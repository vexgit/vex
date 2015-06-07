package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class HelloMain extends AnnotationConfigApplicationContext {

    private final Logger logger = LoggerFactory.getLogger(HelloMain.class);

    public static void main(String[] args) throws Exception {
        HelloMain helloMain = new HelloMain();
        helloMain.refresh();
        helloMain.getBean(HelloMain.class).run();
    }


    public HelloMain() {
        super();
        this.scan("hello");
    }

    @Autowired
    private CustomerRepository customerRepository;

    public void run() {
        logger.info("running with: {}", customerRepository);
        logger.info("repo count={}", customerRepository.count());
        customerRepository.save(new Customer("f1","l1"));
    }


}
