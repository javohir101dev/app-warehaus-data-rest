package warehaus.projection;

import org.springframework.data.rest.core.config.Projection;
import warehaus.entity.Output;
import warehaus.entity.OutputProduct;
import warehaus.entity.Product;



@Projection(types = OutputProduct.class)
public interface CustomOutputProduct {

     Integer getId();

     Product getProduct();

     Double getAmount();

     Double getPrice();

     Output getOutput();

}
