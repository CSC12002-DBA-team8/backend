package tourManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tourManagement.model.entityFromDB.Tour;

public interface TourRepository extends JpaRepository<Tour, Integer> {
}