package warehaus.projection;

import org.springframework.data.rest.core.config.Projection;
import warehaus.entity.User;
import warehaus.entity.Warehaus;

import java.util.Set;

@Projection(types = User.class)
public interface CustomUseer {

     Integer getId();

     String getFirstName();

     String getLastName();

     String getPhoneNumber();

     String getCode();

     String getPassword();

     boolean getActive();

     Set<Warehaus> getWarehaus();

}

