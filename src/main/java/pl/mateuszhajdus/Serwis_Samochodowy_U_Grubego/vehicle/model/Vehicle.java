package pl.mateuszhajdus.Serwis_Samochodowy_U_Grubego.vehicle.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.xml.stream.events.Comment;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "Vehicles")
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "brand")
    private String brand;

    @Column(name = "model")
    private String model;

    @Column(name = "locationID")
    private Long locationId;

    @Column(name = "vehicleStatus")
    private String vehicleStatus;

    @Column(name = "dailyFee")
    private BigDecimal dailyFee;

    @ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH, CascadeType.DETACH })
    @JoinTable(name = "Eqp", joinColumns = @JoinColumn(name = "vehicleID"), inverseJoinColumns = @JoinColumn(name = "equipmentID"))
    private List<Equipment> equipmentList = new ArrayList<Equipment>();

    @OneToOne
    private VehicleParameters vehicleParameters;

    @JsonIgnore
    @OneToMany(mappedBy = "vehicle")
    private Set<Comment> comments;

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

    public Long getLocationId() {
        return locationId;
    }

    public void setLocationId(Long locationId) {
        this.locationId = locationId;
    }

    public String getVehicleStatus() {
        return vehicleStatus;
    }

    public void setVehicleStatus(String vehicleStatus) {
        this.vehicleStatus = vehicleStatus;
    }

    public BigDecimal getDailyFee() {
        return dailyFee;
    }

    public void setDailyFee(BigDecimal dailyFee) {
        this.dailyFee = dailyFee;
    }

    public List<Equipment> getEquipmentList() {
        if(equipmentList == null){
            equipmentList = new ArrayList<>();
        }
        return equipmentList;
    }

    public void setEquipmentList(List<Equipment> equipmentList) {
        this.equipmentList = equipmentList;
    }

    public VehicleParameters getVehicleParameters() {
        return vehicleParameters;
    }

    public void setVehicleParameters(VehicleParameters vehicleParameters) {
        this.vehicleParameters = vehicleParameters;
    }

    public Set<Comment> getComments() {
        return comments;
    }

    public void setComments(Set<Comment> comments) {
        this.comments = comments;
    }
}