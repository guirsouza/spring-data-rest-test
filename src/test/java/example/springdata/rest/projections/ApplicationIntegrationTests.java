package example.springdata.rest.projections;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Integration tests to bootstrap the application.
 * 
 * @author Oliver Gierke
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationIntegrationTests {

//    @Autowired
//    OrderRepository repository;

    @Test
    public void initializesRepositoryWithSampleData() {

//        Iterable<Order> result = repository.findAll();
//
//        assertThat(result, is(iterableWithSize(1)));
    }
}
