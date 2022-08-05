package tourManagement.model.entityFromDB;

import javax.persistence.*;

@Entity
@Table(name = "MOTA")
public class MoTa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaMoTa")
    private int maMoTa;

    @Column(name = "MaTour")
    private int maTour;

    @Column(name = "STT")
    private int STT;

    @Column(name = "Picture")
    private String pictureUrl;

    @Column(name = "Descript")
    private String noiDungMoTa;


    public MoTa() {}

    public MoTa(int maTour, int STT, String pictureUrl, String noiDungMoTa) {
        this.maTour = maTour;
        this.STT = STT;
        this.pictureUrl = pictureUrl;
        this.noiDungMoTa = noiDungMoTa;
    }

    public int getMaMoTa() {
        return maMoTa;
    }

    public void setMaMoTa(int maMoTa) {
        this.maMoTa = maMoTa;
    }

    public int getMaTour() {
        return maTour;
    }

    public void setMaTour(int maTour) {
        this.maTour = maTour;
    }

    public int getSTT() {
        return STT;
    }

    public void setSTT(int STT) {
        this.STT = STT;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public String getNoiDungMoTa() {
        return noiDungMoTa;
    }

    public void setNoiDungMoTa(String noiDungMoTa) {
        this.noiDungMoTa = noiDungMoTa;
    }
}
