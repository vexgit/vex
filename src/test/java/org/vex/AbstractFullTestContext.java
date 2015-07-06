package org.vex;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.springframework.context.support.AbstractApplicationContext;
import org.vex.lang.Try;
import org.vex.main.VexMainContext;

import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

public class AbstractFullTestContext {

    protected static ConcurrentHashMap<Long, VexMainContext> contextMap = new ConcurrentHashMap<>();

    @BeforeClass
    public static void beforeClass() {
        contextMap.computeIfAbsent(Thread.currentThread().getId(), (id) -> {
            VexMainContext vexMainContext = new VexMainContext();
            vexMainContext.refresh();
            return vexMainContext;
        });
    }

    @AfterClass
    public static void afterClass() {
        Optional.ofNullable(contextMap.remove(Thread.currentThread().getId()))
                .ifPresent(AbstractApplicationContext::close);

    }

    @Before
    public void beforeTest() {
        long threadId = Thread.currentThread().getId();
        Optional.ofNullable(contextMap.get(threadId))
                .orElseThrow(() -> Try.fatal("context not found. threadId={}", threadId))
                .getAutowireCapableBeanFactory()
                .autowireBean(this);
    }


}
