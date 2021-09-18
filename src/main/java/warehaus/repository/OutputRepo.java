package warehaus.repository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import warehaus.entity.CustomOutput;
import warehaus.entity.Output;
import org.springframework.data.jpa.repository.JpaRepository;

@RepositoryRestResource(path = "output", excerptProjection = CustomOutput.class)
public interface OutputRepo extends JpaRepository<Output, Integer> {


}
