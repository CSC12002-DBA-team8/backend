package tourManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tourManagement.model.entityFromDB.DiaDiem;

public interface DiaDiemRepository extends JpaRepository<DiaDiem, Integer> {
}