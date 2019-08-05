package pl.mateuszhajdus.Serwis_Samochodowy_U_Grubego.vehicleDto;

import java.math.BigDecimal;

public class VehicleAdd {

    private Long id;
    private String brand;
    private String model;
    private BigDecimal dailyFee;
    private Long location;
    private String vehicleStatus;


    private String bodytype;
    private String color;
    private String description;
    private String fileName;
    private Integer productionYear;

    public VehicleAdd() {
        super();
    }

    public VehicleAdd(Long id, String brand, String model, BigDecimal dailyFee,
                      Long location, String vehicleStatus, String bodytype,
                      String color, String description, String fileName, Integer productionYear) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.dailyFee = dailyFee;
        this.location = location;
        this.vehicleStatus = vehicleStatus;
        this.bodytype = bodytype;
        this.color = color;
        this.description = description;
        this.fileName = fileName;
        this.productionYear = productionYear;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public BigDecimal getDailyFee() {
        return dailyFee;
    }

    public void setDailyFee(BigDecimal dailyFee) {
        this.dailyFee = dailyFee;
    }

    public Long getLocation() {
        return location;
    }

    public void setLocation(Long location) {
        this.location = location;
    }

    public String getVehicleStatus() {
        return vehicleStatus;
    }

    public void setVehicleStatus(String vehicleStatus) {
        this.vehicleStatus = vehicleStatus;
    }

    public String getBodytype() {
        return bodytype;
    }

    public void setBodytype(String bodytype) {
        this.bodytype = bodytype;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Integer getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(Integer productionYear) {
        this.productionYear = productionYear;
    }

    @Override
    public String toString() {
        return "VehicleAdd[id=" + id + ", brand=" + brand + ", model=" + model + ", dailyFee=" + dailyFee +
                ", location=" + location + ", vehicleStatus=" + vehicleStatus + ", bodytype=" + bodytype + ", color=" + color +
                ", description=" + description + ", fileName=" + fileName + ", productionYear=" + productionYear + ']';
    }
}
