package warehaus.repository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import warehaus.entity.Product;

import org.springframework.data.jpa.repository.JpaRepository;
import warehaus.projection.CustomProduct;

@RepositoryRestResource(path = "product", excerptProjection = CustomProduct.class)
public interface ProductRepo extends JpaRepository<Product, Integer> {

}
