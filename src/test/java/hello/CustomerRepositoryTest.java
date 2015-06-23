package hello;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomerRepositoryTest {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Before
    public void before() {
    }

    @Test
    public void shouldPersistNewCustomer() throws InterruptedException {
        logger.info("running unit test");
    }

}
