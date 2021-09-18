package warehaus.repository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import warehaus.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import warehaus.projection.CustomCategory;

@RepositoryRestResource(path = "category", excerptProjection = CustomCategory.class)
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
