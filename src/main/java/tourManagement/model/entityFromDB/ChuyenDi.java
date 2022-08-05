package tourManagement.model.entityFromDB;

import javax.persistence.*;

@Entity
@Table(name = "CHUYENDI")
public class ChuyenDi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaCD")
    private int maChuyenDi;

    @Column(name = "NgayKhoiHanh")
    private String ngayKhoiHanh;


    @Column(name = "SoGheTrong")
    private int soGheTrong;

    @Column(name = "MaHDV")
    private int maHuongDanVien;

    @Column(name = "MaTour")
    private int maTour;

    public ChuyenDi() {}

    public ChuyenDi(String ngayKhoiHanh, int maHuongDanVien, int maTour) {
        this.ngayKhoiHanh = ngayKhoiHanh;
        this.maHuongDanVien = maHuongDanVien;
        this.maTour = maTour;
    }

    public int getMaChuyenDi() {
        return maChuyenDi;
    }

    public void setMaChuyenDi(int maChuyenDi) {
        this.maChuyenDi = maChuyenDi;
    }

    public String getNgayKhoiHanh() {
        return ngayKhoiHanh;
    }

    public void setNgayKhoiHanh(String ngayKhoiHanh) {
        this.ngayKhoiHanh = ngayKhoiHanh;
    }

    public int getMaHuongDanVien() {
        return maHuongDanVien;
    }

    public void setMaHuongDanVien(int maHuongDanVien) {
        this.maHuongDanVien = maHuongDanVien;
    }

    public int getMaTour() {
        return maTour;
    }

    public void setMaTour(int maTour) {
        this.maTour = maTour;
    }

    public int getSoGheTrong() {
        return soGheTrong;
    }

    public void setSoGheTrong(int soGheTrong) {
        this.soGheTrong = soGheTrong;
    }

}
