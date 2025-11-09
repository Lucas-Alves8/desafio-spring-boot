package Repository;

import model.House;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HouseRepositorio extends JpaRepository <House, String> {

}
