package warehaus.repository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import warehaus.entity.Warehaus;
import org.springframework.data.jpa.repository.JpaRepository;
import warehaus.projection.CustomWarehaus;

@RepositoryRestResource(path = "warehaus", excerptProjection = CustomWarehaus.class)
public interface WarehausRepo extends JpaRepository<Warehaus, Integer> {



}
