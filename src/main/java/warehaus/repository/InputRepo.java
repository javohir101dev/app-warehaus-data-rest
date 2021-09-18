package warehaus.repository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import warehaus.entity.Input;
import org.springframework.data.jpa.repository.JpaRepository;
import warehaus.projection.CustomInput;

@RepositoryRestResource(path = "input", excerptProjection = CustomInput.class)
public interface InputRepo extends JpaRepository<Input, Integer> {




}
