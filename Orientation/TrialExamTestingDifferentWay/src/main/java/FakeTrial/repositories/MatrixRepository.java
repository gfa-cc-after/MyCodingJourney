package FakeTrial.repositories;

import FakeTrial.models.Matrix;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatrixRepository extends JpaRepository<Matrix, Long> {
}
