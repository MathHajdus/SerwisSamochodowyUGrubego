package pl.mateuszhajdus.Serwis_Samochodowy_U_Grubego.vehicle.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pl.mateuszhajdus.Serwis_Samochodowy_U_Grubego.vehicle.model.Vehicle;
import pl.mateuszhajdus.Serwis_Samochodowy_U_Grubego.vehicleDto.VehicleFilter;

import java.util.List;


@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {

    Vehicle getVehicleUsingId(Long id);

    @Query("SELECT v From Vehicle v where vf.model = v.model or vf.brand = v.brand")
    List<Vehicle> getFilteredCarListForPage(@Param("vf") VehicleFilter vehicleFilter);

    List<Vehicle> getAllByBrand(String brand);

    List<Vehicle> getAvailableVehicleListForLocation(Long cityId);
}

