package warehaus.repository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import warehaus.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import warehaus.projection.CustomClient;

@RepositoryRestResource(path = "client", excerptProjection = CustomClient.class)
public interface ClientRepo extends JpaRepository<Client, Integer> {

}
