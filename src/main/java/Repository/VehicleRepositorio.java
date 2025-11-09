package Repository;

import model.Vehicle;
import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepositorio extends JpaRepository <Vehicle, String> {
}
