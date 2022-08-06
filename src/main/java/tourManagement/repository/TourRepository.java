package tourManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import tourManagement.model.entityFromDB.Tour;

import java.util.List;

public interface TourRepository extends JpaRepository<Tour, Integer> {
    @Query(value = "SELECT tour FROM Tour tour WHERE tour.maTour = ?1")
    List<Tour> getTourInformation(int maTour);
}