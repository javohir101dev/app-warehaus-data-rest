package warehaus.repository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import warehaus.entity.InputProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import warehaus.projection.CustomInputProduct;


@RepositoryRestResource(path = "inputProduct", excerptProjection = CustomInputProduct.class)
public interface InputProductRepo extends JpaRepository<InputProduct, Integer> {


}
