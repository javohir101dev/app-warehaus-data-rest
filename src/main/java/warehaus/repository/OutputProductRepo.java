package warehaus.repository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import warehaus.entity.Client;
import warehaus.entity.Currency;
import warehaus.entity.OutputProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import warehaus.entity.Warehaus;
import warehaus.projection.CustomOutputProduct;


import java.sql.Timestamp;

@RepositoryRestResource(path ="outputProduct", excerptProjection = CustomOutputProduct.class)
public interface OutputProductRepo extends JpaRepository<OutputProduct, Integer> {



}
