package warehaus.projection;

import org.springframework.data.rest.core.config.Projection;
import warehaus.entity.Input;
import warehaus.entity.InputProduct;
import warehaus.entity.Product;


import java.sql.Date;

@Projection(types = InputProduct.class)
public interface CustomInputProduct {

     Integer getId();

     Double getAmount();

     Double getPrice();

     Date getExpireDate();

     Product getProduct();

     Input getInput();

}
