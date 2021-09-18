package warehaus.repository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import warehaus.entity.Measurement;
import org.springframework.data.jpa.repository.JpaRepository;
import warehaus.projection.CustomMeasurement;

@RepositoryRestResource(path = "measurement", excerptProjection = CustomMeasurement.class)
public interface MeasurementRepository extends JpaRepository<Measurement, Integer> {

}
