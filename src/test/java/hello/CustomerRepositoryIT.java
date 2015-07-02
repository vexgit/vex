package hello;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomerRepositoryIT {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    private HelloMain helloMain;

    @Autowired
    private CustomerRepository customerRepository;

    @Before
    public void before() {
        helloMain = new HelloMain();
        helloMain.refresh();
        helloMain.getAutowireCapableBeanFactory().autowireBean(this);
    }

    @Test
    public void shouldPersistNewCustomer() {

        Customer c = new Customer();

        logger.info("running test with repo {}", customerRepository);
        logger.info("repo count before. count={}, c={}", customerRepository.count(), c.getId());
        c.setAttribute1("a2");
        customerRepository.save(c);
        logger.info("repo count after. count={}, c={}", customerRepository.count(), c.getId());

        c = customerRepository.findOne(c.getId());

        c.setAttribute1("a2");
        customerRepository.save(c);
        logger.info("repo count after. count={}, c={}", customerRepository.count(), c.getId());

    }

}
