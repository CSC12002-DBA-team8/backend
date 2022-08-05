package tourManagement.model.entityFromDB;

import javax.persistence.*;

@Entity
@Table(name = "QLTour")
public class QuanLyTour {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaQuanLyTour")
    private int maQuanLyTour;

    @Column(name = "MaTour")
    private int maTour;

    @Column(name = "maHDV")
    private int maHuongDanVien;

    public QuanLyTour() {}

    public QuanLyTour(int maTour, int maHuongDanVien) {
        this.maTour = maTour;
        this.maHuongDanVien = maHuongDanVien;
    }

    public int getMaQuanLyTour() {
        return maQuanLyTour;
    }

    public void setMaQuanLyTour(int maQuanLyTour) {
        this.maQuanLyTour = maQuanLyTour;
    }

    public int getMaTour() {
        return maTour;
    }

    public void setMaTour(int maTour) {
        this.maTour = maTour;
    }

    public int getMaHuongDanVien() {
        return maHuongDanVien;
    }

    public void setMaHuongDanVien(int maHuongDanVien) {
        this.maHuongDanVien = maHuongDanVien;
    }
}
