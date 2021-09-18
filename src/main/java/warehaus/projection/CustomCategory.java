package warehaus.projection;


import org.springframework.data.rest.core.config.Projection;
import warehaus.entity.Category;

@Projection(types = Category.class)
public interface CustomCategory {

    Integer getId();

    String getName();

    boolean getActive();

    Category getCategoryParent();
}
