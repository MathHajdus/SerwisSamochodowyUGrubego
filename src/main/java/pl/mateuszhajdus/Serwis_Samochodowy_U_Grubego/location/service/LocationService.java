package pl.mateuszhajdus.Serwis_Samochodowy_U_Grubego.location.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.mateuszhajdus.Serwis_Samochodowy_U_Grubego.location.model.Location;
import pl.mateuszhajdus.Serwis_Samochodowy_U_Grubego.location.repository.LocationRepository;
import pl.mateuszhajdus.Serwis_Samochodowy_U_Grubego.vehicle.model.Vehicle;
import pl.mateuszhajdus.Serwis_Samochodowy_U_Grubego.vehicle.model.VehicleParameters;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LocationService{

    @Autowired
    private LocationRepository locationRepository;

    public Location getLocationById(Long id) {
        return locationRepository.getLocationById(id);
    }

    public List<Location> getLocationList() {
        return locationRepository.findAll();

    }
    }

