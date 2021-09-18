package warehaus.projection;

import org.springframework.data.rest.core.config.Projection;
import warehaus.entity.Measurement;

@Projection(types = Measurement.class)
public interface CustomMeasurement {

    Integer getId();

    String getName();

    boolean getActive();
}
