package pl.mateuszhajdus.Serwis_Samochodowy_U_Grubego.vehicle.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.mateuszhajdus.Serwis_Samochodowy_U_Grubego.location.service.LocationService;
import pl.mateuszhajdus.Serwis_Samochodowy_U_Grubego.vehicle.model.Vehicle;
import pl.mateuszhajdus.Serwis_Samochodowy_U_Grubego.vehicle.service.VehicleService;

import java.util.List;

@Controller
@RequestMapping(value = "/carlistsearch")
public class VehicleFilterController {

    @Autowired
    VehicleService vehicleService;

    @Autowired
    LocationService locationService;

    @RequestMapping(value = "/brandlist", method = RequestMethod.GET)
    public List<String> vehicleSearchGetBrandList() {

        return vehicleService.getBrandList();
    }

    @RequestMapping(value = "/modellist", method = RequestMethod.GET)
    public List<Vehicle> vehicleSearchGetModelListForBrand(@RequestBody String brand) {

        return vehicleService.getModelListForBrand(brand);
    }

    @RequestMapping(value = "/bodytypelist", method = RequestMethod.GET)
    public List<String> vehicleSearchGetBodTypeList() {

        return vehicleService.getBodTypeList();
    }

    @RequestMapping(value = "/citylist", method = RequestMethod.GET)
    public List<String> vehicleSearchGetCityList() {

        return vehicleService.getCityList();
    }

    @RequestMapping(value = "/colorlist", method = RequestMethod.GET)
    public List<String> vehicleSearchGetColorList() {

        return vehicleService.getColorList();
    }

    @RequestMapping(value = "/modelsforbrand", method = RequestMethod.POST)
    public List<Vehicle> getModelsForBrand(@RequestBody String brand) {
        return vehicleService.getModelListForBrand(brand);
    }
}


