package tourManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tourManagement.model.entityFromDB.KhachHang;

public interface KhachHangRepository extends JpaRepository<KhachHang, Integer> {
}