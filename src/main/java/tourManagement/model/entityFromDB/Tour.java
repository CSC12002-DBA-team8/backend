package tourManagement.model.entityFromDB;

import javax.persistence.*;

@Entity
@Table(name = "TOUR")
public class Tour {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "maTour")
    private int maTour;

    @Column(name = "TenTour")
    private String tenTour;

    @Column(name = "ThoiLuong")
    private int thoiLuong;

    @Column(name = "SoNguoiToiDa")
    private int soNguoiToiDa;

    @Column(name = "GiaVe")
    private int giaVe;

    @Column(name = "GiaVeTE")
    private int giaVeTreEm;

    @Column(name = "DiemKH")
    private int maDiemKhoiHanh;

    @Column(name = "TinhTrang")
    private int tinhTrang;

    public Tour() {}

    public Tour(String tenTour, int thoiLuong, int soNguoiToiDa, int giaVe, int giaVeTreEm, int maDiemKhoiHanh, int tinhTrang) {
        this.tenTour = tenTour;
        this.thoiLuong = thoiLuong;
        this.soNguoiToiDa = soNguoiToiDa;
        this.giaVe = giaVe;
        this.giaVeTreEm = giaVeTreEm;
        this.maDiemKhoiHanh = maDiemKhoiHanh;
        this.tinhTrang = tinhTrang;
    }

    public int getMaTour() {
        return maTour;
    }

    public void setMaTour(int maTour) {
        this.maTour = maTour;
    }

    public String getTenTour() {
        return tenTour;
    }

    public void setTenTour(String tenTour) {
        this.tenTour = tenTour;
    }

    public int getThoiLuong() {
        return thoiLuong;
    }

    public void setThoiLuong(int thoiLuong) {
        this.thoiLuong = thoiLuong;
    }

    public int getSoNguoiToiDa() {
        return soNguoiToiDa;
    }

    public void setSoNguoiToiDa(int soNguoiToiDa) {
        this.soNguoiToiDa = soNguoiToiDa;
    }

    public int getGiaVe() {
        return giaVe;
    }

    public void setGiaVe(int giaVe) {
        this.giaVe = giaVe;
    }

    public int getGiaVeTreEm() {
        return giaVeTreEm;
    }

    public void setGiaVeTreEm(int giaVeTreEm) {
        this.giaVeTreEm = giaVeTreEm;
    }

    public int getMaDiemKhoiHanh() {
        return maDiemKhoiHanh;
    }

    public void setMaDiemKhoiHanh(int maDiemKhoiHanh) {
        this.maDiemKhoiHanh = maDiemKhoiHanh;
    }

    public int getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(int tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
}
