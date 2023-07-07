package entities;

public class CarModel {
    private Integer carID;
    private String carLicense;
    private Double carKilometer;
    private String carBrand;
    private String carModel;
    private String carColor;
    private Integer carYear;
    public CarModel (Integer carID, String carLicense, Double carKilometer, String carBrand, String carModel, String carColor, Integer carYear){
        this.carID = carID;
        this.carLicense = carLicense;
        this.carKilometer = carKilometer;
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.carColor = carColor;
        this.carYear = carYear;
    }

    public void setCarID(Integer carID) {
        this.carID = carID;
    }

    public void setCarLicense(String carLicense) {
        this.carLicense = carLicense;
    }

    public void setCarKilometer(Double carKilometer) {
        this.carKilometer = carKilometer;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public void setCarYear(Integer carYear) {
        this.carYear = carYear;
    }

    public Integer getCarID() {
        return carID;
    }

    public String getCarLicense() {
        return carLicense;
    }

    public Double getCarKilometer() {
        return carKilometer;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public String getCarModel() {
        return carModel;
    }

    public String getCarColor() {
        return carColor;
    }

    public Integer getCarYear() {
        return carYear;
    }

    @Override
    public String toString() {
        return "CarModel{" +
                "carID=" + carID +
                ", carLicense=" + carLicense +
                ", carKilometer=" + carKilometer +
                ", carBrand='" + carBrand + '\'' +
                ", carModel='" + carModel + '\'' +
                ", carColor='" + carColor + '\'' +
                ", carYear=" + carYear +
                '}';
    }
}
