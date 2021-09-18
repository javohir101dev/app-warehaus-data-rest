package warehaus.repository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import warehaus.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import warehaus.projection.CustomUseer;

@RepositoryRestResource(path = "user", excerptProjection = CustomUseer.class)
public interface UserRepo extends JpaRepository<User, Integer> {

}
