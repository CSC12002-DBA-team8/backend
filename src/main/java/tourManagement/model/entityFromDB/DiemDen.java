package tourManagement.model.entityFromDB;

import javax.persistence.*;

@Entity
@Table(name = "DIEMDEN")
public class DiemDen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaDiemDen")
    private int maDiemDen;

    @Column(name = "MaTour")
    private int maTour;

    @Column(name = "MaDD")
    private int maDiaDiem;


    public DiemDen() {
    }

    public DiemDen(int maTour, int maDiaDiem) {
        this.maTour = maTour;
        this.maDiaDiem = maDiaDiem;
    }
    public int getMaTour() {
        return maTour;
    }
    public void setMaTour(int maTour) {
        this.maTour = maTour;
    }
    public int getMaDiaDiem() {
        return maDiaDiem;
    }
    public void setMaDiaDiem(int maDiaDiem) {
        this.maDiaDiem = maDiaDiem;
    }

    public int getMaDiem() {
        return maDiemDen;
    }

    public void setMaDiemDen(int maDiemDen) {
        this.maDiemDen = maDiemDen;
    }

}