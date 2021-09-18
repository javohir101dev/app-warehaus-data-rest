package warehaus.projection;

import org.springframework.data.rest.core.config.Projection;
import warehaus.entity.Warehaus;

@Projection(types = Warehaus.class)
public interface CustomWarehaus {

    Integer getId();

    String getName();

    boolean getActive();

}
