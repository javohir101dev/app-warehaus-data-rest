package warehaus.projection;

import org.springframework.data.rest.core.config.Projection;
import warehaus.entity.Currency;
import warehaus.entity.Input;
import warehaus.entity.Supplier;
import warehaus.entity.Warehaus;

import java.sql.Timestamp;

@Projection(types = Input.class)
public interface CustomInput {

     Integer getId();

     String getName();

     Timestamp getDate();

     Warehaus getWarehaus();

     Supplier getSupplier();

     Currency getCurrency();

     String getFactureNumber();

     String getCode();
}
