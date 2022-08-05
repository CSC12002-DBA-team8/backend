package tourManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tourManagement.model.entityFromDB.QuanLyTour;

public interface QuanLyTourRepository extends JpaRepository<QuanLyTour, Integer> {
}