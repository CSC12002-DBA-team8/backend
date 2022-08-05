package tourManagement.model.entityFromDB;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "KHACHHANG")
public class KhachHang {
    @Id
    @Column(name = "CCCD")
    private int CCCD;

    @Column(name = "Hoten")
    private String hoTen;

    @Column(name = "SDT")
    private String SDT;

    @Column(name = "Diachi")
    private String diaChi;

    @Column(name = "Birthday")
    private String ngaySinh;

    @Column(name = "email")
    private String email;

    public int getCCCD() {
        return CCCD;
    }

    public void setCCCD(int CCCD) {
        this.CCCD = CCCD;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
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

    public KhachHang() {}

    public KhachHang(int CCCD, String hoTen, String SDT, String diaChi, String ngaySinh, String email) {
        this.CCCD = CCCD;
        this.hoTen = hoTen;
        this.SDT = SDT;
        this.diaChi = diaChi;
        this.ngaySinh = ngaySinh;
        this.email = email;
    }
}
