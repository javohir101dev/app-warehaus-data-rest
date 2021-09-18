package warehaus.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import warehaus.entity.Currency;
import warehaus.projection.CustomCurrency;

@RepositoryRestResource(path = "currency", excerptProjection = CustomCurrency.class)
public interface CurrencyRepo extends JpaRepository<Currency, Integer> {

}
