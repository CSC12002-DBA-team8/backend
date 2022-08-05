package tourManagement.model.entityFromDB;

import javax.persistence.*;

@Entity
@Table(name = "DIADIEM")
public class DiaDiem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="MaDD")
    private int maDiaDiem;

    @Column(name ="Country")
    private String quocGia;

    @Column(name ="City")
    private String thanhPho;

    public DiaDiem() {
    }
    public DiaDiem(String quocGia, String thanhPho) {
        this.quocGia = quocGia;
        this.thanhPho = thanhPho;
    }
    public int getMaDiaDiem() {
        return maDiaDiem;
    }
    public void setMaDiaDiem(int maDiaDiem) {
        this.maDiaDiem = maDiaDiem;
    }
    public String getQuocGia() {
        return quocGia;
    }
    public void setQuocGia(String quocGia) {
        this.quocGia = quocGia;
    }
    public String getThanhPho() {
        return thanhPho;
    }
    public void setThanhPho(String thanhPho) {
        this.thanhPho = thanhPho;
    }


}