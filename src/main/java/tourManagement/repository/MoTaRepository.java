package tourManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tourManagement.model.entityFromDB.MoTa;

public interface MoTaRepository extends JpaRepository<MoTa, Integer> {
}