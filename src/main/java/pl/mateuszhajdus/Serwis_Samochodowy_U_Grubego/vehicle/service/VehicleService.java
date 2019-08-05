package pl.mateuszhajdus.Serwis_Samochodowy_U_Grubego.vehicle.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.mateuszhajdus.Serwis_Samochodowy_U_Grubego.location.model.Location;
import pl.mateuszhajdus.Serwis_Samochodowy_U_Grubego.location.repository.LocationRepository;
import pl.mateuszhajdus.Serwis_Samochodowy_U_Grubego.vehicle.model.Equipment;
import pl.mateuszhajdus.Serwis_Samochodowy_U_Grubego.vehicle.model.Vehicle;
import pl.mateuszhajdus.Serwis_Samochodowy_U_Grubego.vehicle.model.VehicleParameters;
import pl.mateuszhajdus.Serwis_Samochodowy_U_Grubego.vehicle.repository.VehicleRepository;
import pl.mateuszhajdus.Serwis_Samochodowy_U_Grubego.vehicleDto.VehicleAdd;
import pl.mateuszhajdus.Serwis_Samochodowy_U_Grubego.vehicleDto.VehicleFilter;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class VehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;

    @Autowired
    private LocationRepository locationRepository;


    public Vehicle getVehicleById(Long id) {
        return vehicleRepository.getVehicleUsingId(id);
    }

    public List<Vehicle> getFilteredCarListForPage(VehicleFilter vehicleFilter) {
        return vehicleRepository.getFilteredCarListForPage(vehicleFilter);
    }

    public List<String> getBrandList() {
        return vehicleRepository.findAll().stream()
                .map(Vehicle::getBrand)
                .collect(Collectors.toList());
    }

    public List<Vehicle> getModelListForBrand(String brand) {
        return vehicleRepository.getAllByBrand(brand);
    }

    public List<String> getBodTypeList() {
        return vehicleRepository.findAll().stream()
                .map(Vehicle::getVehicleParameters)
                .map(VehicleParameters::getBodytype)
                .collect(Collectors.toList());
    }

    public List<String> getColorList() {
        return vehicleRepository.findAll().stream()
                .map(Vehicle::getVehicleParameters)
                .map(VehicleParameters::getColor)
                .collect(Collectors.toList());
    }

    public List<Vehicle> getAllVehicles() {
        return vehicleRepository.findAll();
    }

    public Vehicle updateVehicle(VehicleAdd vehicleAddDto) {
        Vehicle vehicle = vehicleRepository.findById(vehicleAddDto.getId())
                .orElseThrow(() -> new IllegalArgumentException("Vehicle not found"));
        vehicle.setBrand(vehicleAddDto.getBrand());
        vehicle.setModel(vehicleAddDto.getModel());
        vehicle.setDailyFee(vehicleAddDto.getDailyFee());
        vehicle.setLocationId(vehicleAddDto.getLocation());
        vehicle.setVehicleStatus(vehicleAddDto.getVehicleStatus());
        vehicle.getVehicleParameters().setColor(vehicleAddDto.getColor());
        vehicle.getVehicleParameters().setDescription(vehicleAddDto.getDescription());
        vehicle.getVehicleParameters().setBodytype(vehicleAddDto.getBodytype());
        vehicle.getVehicleParameters().setDescription(vehicleAddDto.getFileName());
        vehicle.getVehicleParameters().setProductionYear(vehicleAddDto.getProductionYear());

        return vehicleRepository.save(vehicle);
    }

    public void addVehicle(VehicleAdd vehicleAddDto) {

        Vehicle vehicle = new Vehicle();
        vehicle.setBrand(vehicleAddDto.getBrand());
        vehicle.setModel(vehicleAddDto.getModel());
        vehicle.setDailyFee(vehicleAddDto.getDailyFee());
        vehicle.setLocationId(vehicleAddDto.getLocation());
        vehicle.setVehicleStatus(vehicleAddDto.getVehicleStatus());

        VehicleParameters vehicleParameters = new VehicleParameters();
        vehicleParameters.setColor(vehicleAddDto.getColor());
        vehicleParameters.setDescription(vehicleAddDto.getDescription());
        vehicleParameters.setBodytype(vehicleAddDto.getBodytype());
        vehicleParameters.setDescription(vehicleAddDto.getFileName());
        vehicleParameters.setProductionYear(vehicleAddDto.getProductionYear());

        vehicle.setVehicleParameters(vehicleParameters);
        vehicleRepository.save(vehicle);
    }

    public void addEquipment(Equipment equipment, Long vehicleId) {
        Vehicle vehicle = vehicleRepository.findById(vehicleId)
                .orElseThrow(() -> new IllegalArgumentException("Vehicle not found"));
        vehicle.getEquipmentList().add(equipment);
        vehicleRepository.save(vehicle);
    }

    public void removeEquipment(String eqpCode, Long vehicleId) {
        Vehicle vehicle = vehicleRepository.findById(vehicleId)
                .orElseThrow(() -> new IllegalArgumentException("Vehicle not found"));
        vehicle.getEquipmentList().stream().filter(e -> e.getEquipmentCode().equals(eqpCode))
                .findFirst()
                .ifPresent(equipment -> {
                    vehicle.getEquipmentList().remove(equipment);
                    vehicleRepository.save(vehicle);
                });
    }

    public List<String> getCityList() {
        return locationRepository.findAll().stream()
                .map(Location::getCity)
                .collect(Collectors.toList());
    }
     public List<Vehicle> getAvailableVehicleListForLocation(Long cityId) {
         return vehicleRepository.getAvailableVehicleListForLocation(cityId);
     }
    }
