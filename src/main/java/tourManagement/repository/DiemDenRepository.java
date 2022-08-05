package tourManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tourManagement.model.entityFromDB.DiemDen;

public interface DiemDenRepository extends JpaRepository<DiemDen, Integer> {
}