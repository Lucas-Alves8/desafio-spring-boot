package Repository;

import model.Insurance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InsuranceRepositorio extends JpaRepository <Insurance, String> {

}
