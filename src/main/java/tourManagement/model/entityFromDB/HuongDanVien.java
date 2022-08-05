package tourManagement.model.entityFromDB;

import javax.persistence.*;

@Entity
@Table(name = "HDV")
public class HuongDanVien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaHDV")
    private int maHuongDanVien;

    @Column(name = "CCCD")
    private String CCCD;

    @Column(name = "Hoten")
    private String hoTen;

    @Column(name = "Diachi")
    private String diaChi;

    @Column(name = "Birthday")
    private String ngaySinh;

    @Column(name = "email")
    private String email;

    public HuongDanVien() {}

    public HuongDanVien(String CCCD, String hoTen, String diaChi, String ngaySinh, String email) {
        this.CCCD = CCCD;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.ngaySinh = ngaySinh;
        this.email = email;
    }

    public int getMaHuongDanVien() {
        return maHuongDanVien;
    }

    public void setMaHuongDanVien(int maHuongDanVien) {
        this.maHuongDanVien = maHuongDanVien;
    }

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
