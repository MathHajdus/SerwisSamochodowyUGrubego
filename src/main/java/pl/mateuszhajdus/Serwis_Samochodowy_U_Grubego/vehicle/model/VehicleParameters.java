package pl.mateuszhajdus.Serwis_Samochodowy_U_Grubego.vehicle.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "VehicleParameters")
public class VehicleParameters {
    @Id
    @JsonIgnore
    @Column(name = "vehicleID")
    private Long vehicleID;

    @Column(name = "bodytype")
    private String bodytype;

    @Column(name = "productionYear")
    private Integer productionYear;

    @Column(name = "color")
    private String color;

    @Column(name = "photoName")
    private String photoName;

    @Column(name = "description")
    private String description;

    public VehicleParameters(Long vehicleID, String bodytype, Integer productionYear,
                             String color, String photoName, String description) {
        this.vehicleID = vehicleID;
        this.bodytype = bodytype;
        this.productionYear = productionYear;
        this.color = color;
        this.photoName = photoName;
        this.description = description;

    }

    public Long getVehicleID() {
        return vehicleID;
    }

    public void setVehicleID(Long vehicleID) {
        this.vehicleID = vehicleID;
    }

    public String getBodytype() {
        return bodytype;
    }

    public void setBodytype(String bodytype) {
        this.bodytype = bodytype;
    }

    public Integer getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(Integer productionYear) {
        this.productionYear = productionYear;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPhotoName() {
        return photoName;
    }

    public void setPhotoName(String photoName) {
        this.photoName = photoName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "VehicleParameters[vehicleID=" + vehicleID + ", bodytype=" + bodytype + ", productionYear=" + productionYear +
                ", color=" + color + ", photoName=" + photoName + ", description=" + description +
                ']';
    }

    public VehicleParameters() {
        super();

    }
}
