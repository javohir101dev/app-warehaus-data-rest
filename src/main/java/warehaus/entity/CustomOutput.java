package warehaus.entity;

import org.springframework.data.rest.core.config.Projection;

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
