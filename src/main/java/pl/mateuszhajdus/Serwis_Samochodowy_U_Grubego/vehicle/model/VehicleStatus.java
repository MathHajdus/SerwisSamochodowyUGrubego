package pl.mateuszhajdus.Serwis_Samochodowy_U_Grubego.vehicle.model;

import javax.persistence.*;

@Entity
@Table(name = "VehicleStatus")
public class VehicleStatus {

    @Id
    @JoinColumn(name = "vehicleStatusCode")
    private String vehicleStatusCode;

    @Column(name = "description")
    private String description;

    public VehicleStatus(String vehicleStatusCode, String description) {
        this.vehicleStatusCode = vehicleStatusCode;
        this.description = description;
    }

    public VehicleStatus() {
        super();
    }

    public String getVehicleStatusCode() {
        return vehicleStatusCode;
    }

    public void setVehicleStatusCode(String vehicleStatusCode) {
        this.vehicleStatusCode = vehicleStatusCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "VehicleStatus [vehicleStatusCode=" + vehicleStatusCode + ", description=" + description + "]";
    }
}
