package tourManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tourManagement.model.entityFromDB.ChuyenDi;

public interface ChuyenDiRepository extends JpaRepository<ChuyenDi, Integer> {
}