package tourManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tourManagement.model.entityFromDB.GiaoDich;

public interface GiaoDichRepository extends JpaRepository<GiaoDich, Integer> {
}