package warehaus.projection;

import org.springframework.data.rest.core.config.Projection;
import warehaus.entity.Currency;

@Projection(types = Currency.class)
public interface CustomCurrency {
    Integer getId();

    String getName();

    boolean getActive();
}
