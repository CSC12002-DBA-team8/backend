package tourManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tourManagement.model.entityFromDB.HuongDanVien;

public interface HuongDanVienRepository extends JpaRepository<HuongDanVien, Integer> {
}