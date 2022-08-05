package tourManagement.model.entityFromDB;

import javax.persistence.*;

@Entity
@Table(name = "GIAODICH")

public class GiaoDich {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="MaGD")
    private int maGiaoDich;

    @Column(name ="NgayGD")
    private String ngayGiaoDich;

    @Column(name ="SoVe")
    private int soVe;
    @Column(name ="SoVeTE")
    private int soVeTreEm;

    @Column(name ="TongTien")
    private int tongTien;

    @Column(name ="Note")
    private String ghiChu;

    @Column(name ="CCCDKH")
    private int cccdKhachHang;

    @Column(name ="MaCD")
    private int maChuyenDi;



    public GiaoDich() {
    }
    public GiaoDich(String ngayGiaoDich, int soVe, int soVeTreEm, int tongTien, String ghiChu,
                    int cccdKhachHang, int maChuyenDi) {
        this.ngayGiaoDich = ngayGiaoDich;
        this.soVe = soVe;
        this.soVeTreEm = soVeTreEm;
        this.tongTien = tongTien;
        this.ghiChu = ghiChu;
        this.cccdKhachHang = cccdKhachHang;
        this.maChuyenDi = maChuyenDi;
    }
    public int getMaGiaoDich() {
        return maGiaoDich;
    }
    public void setMaGiaoDich(int maGiaoDich) {
        this.maGiaoDich = maGiaoDich;
    }
    public String getNgayGiaoDich() {
        return ngayGiaoDich;
    }
    public void setNgayGiaoDich(String ngayGiaoDich) {
        this.ngayGiaoDich = ngayGiaoDich;
    }
    public int getSoVe() {
        return soVe;
    }
    public void setSoVe(int soVe) {
        this.soVe = soVe;
    }
    public int getSoVeTreEm() {
        return soVeTreEm;
    }
    public void setSoVeTreEm(int soVeTreEm) {
        this.soVeTreEm = soVeTreEm;
    }
    public int getTongTien() {
        return tongTien;
    }
    public void setTongTien(int tongTien) {
        this.tongTien = tongTien;
    }
    public String getGhiChu() {
        return ghiChu;
    }
    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }
    public int getCccdKhachHang() {
        return cccdKhachHang;
    }
    public void setCccdKhachHang(int cccdKhachHang) {
        this.cccdKhachHang = cccdKhachHang;
    }
    public int getMaChuyenDi() {
        return maChuyenDi;
    }
    public void setMaChuyenDi(int maChuyenDi) {
        this.maChuyenDi = maChuyenDi;
    }



}