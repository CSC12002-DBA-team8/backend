package tourManagement.model.apis.showTour;

public class RequestShowTour {
    int maTour;

    public RequestShowTour(int maTour) {
        this.maTour = maTour;
    }

    public int getMaTour() {
        return maTour;
    }

    public void setMaTour(int maTour) {
        this.maTour = maTour;
    }

}
