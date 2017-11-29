package example.springdata.rest.projections;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import java.util.HashMap;
import java.util.Map;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.projection.ProjectionFactory;
import org.springframework.data.projection.SpelAwareProxyProjectionFactory;

/**
 * Test cases showing the programatic use of a {@link ProjectionFactory}.
 * 
 * @author Oliver Gierke
 */
public class SimpleProjectionTests {

    ProjectionFactory factory = new SpelAwareProxyProjectionFactory();

    @Test
    public void createMapBackedProjection() {

        Customer customer = factory.createProjection(Customer.class);
        customer.setFirstname("Dave");
        customer.setLastname("Matthews");

        // Verify accessors work
        assertThat(customer.getFirstname(), is("Dave"));
        assertThat(customer.getLastname(), is("Matthews"));

        // Verify evaluating a SpEL expression
        assertThat(customer.getFullName(), is("Dave Matthews"));
    }

    @Test
    public void createsProxyForSourceMap() {

        Map<String, Object> backingMap = new HashMap<>();
        backingMap.put("firstname", "Dave");
        backingMap.put("lastname", "Matthews");

        Customer customer = factory.createProjection(Customer.class, backingMap);

        // Verify accessors work
        assertThat(customer.getFirstname(), is("Dave"));
        assertThat(customer.getLastname(), is("Matthews"));
    }

    interface Customer {

        String getFirstname();

        void setFirstname(String firstname);

        String getLastname();

        void setLastname(String lastname);

        @Value("#{target.firstname + ' ' + target.lastname}")
        String getFullName();
    }
}
