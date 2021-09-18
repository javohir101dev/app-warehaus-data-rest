package warehaus.projection;

import org.springframework.data.rest.core.config.Projection;
import warehaus.entity.Attachment;
import warehaus.entity.Category;
import warehaus.entity.Measurement;
import warehaus.entity.Product;


@Projection(types = Product.class)
public interface CustomProduct {

     Integer getId();

     String getName();

     boolean getActive();

     Category getCategory();

     Attachment getPhoto();

     String getCode();

     Measurement getMeasurement();

}
