package org.vex.engine;

public interface VexMain {

    static void main(String[] args) throws InterruptedException {
        VexMainContext vexMainContext = new VexMainContext();
        vexMainContext.refresh();
//
//        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
//        ctx.scan("hello");
//        ctx.scan("org.vex");
//        ctx.refresh();
//
//        HelloMain helloMain = ctx.getBean(HelloMain.class);
//        System.out.println(helloMain);
//
//        ThreadManager threadManager = ctx.getBean(ThreadManager.class);
//        System.out.println(threadManager);

//        System.out.println("sleeping");
//        Threads.sleep(Long.MAX_VALUE);
    }

}
