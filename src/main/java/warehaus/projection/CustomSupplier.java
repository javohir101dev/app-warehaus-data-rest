package warehaus.projection;

import org.springframework.data.rest.core.config.Projection;
import warehaus.entity.Supplier;

@Projection(types = Supplier.class)
public interface CustomSupplier {

    Integer getId();

    String getName();

    boolean getActive();

     String getPhoneNumber();

}
