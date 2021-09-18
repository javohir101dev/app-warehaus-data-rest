package warehaus.repository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import warehaus.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import warehaus.projection.CustomSupplier;

@RepositoryRestResource(path = "supplier", excerptProjection = CustomSupplier.class)
public interface SupplierRepo extends JpaRepository<Supplier, Integer> {

}
