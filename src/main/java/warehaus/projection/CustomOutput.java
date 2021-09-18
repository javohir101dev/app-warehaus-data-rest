package warehaus.projection;

import org.springframework.data.rest.core.config.Projection;
import warehaus.entity.Client;
import warehaus.entity.Currency;
import warehaus.entity.Output;
import warehaus.entity.Warehaus;

import java.sql.Timestamp;

@Projection(types = Output.class)
public interface CustomOutput {

     Integer getId();

     String getName();

     Timestamp getDate();

     Warehaus getWarehaus();

     Client getClient();

     Currency getCurrency();

     String getFactureNumber();

     String getCode();

}
