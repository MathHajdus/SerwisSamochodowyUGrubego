package pl.mateuszhajdus.Serwis_Samochodowy_U_Grubego.vehicle.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.mateuszhajdus.Serwis_Samochodowy_U_Grubego.vehicle.model.Vehicle;
import pl.mateuszhajdus.Serwis_Samochodowy_U_Grubego.vehicle.service.VehicleService;

import javax.xml.stream.events.Comment;

@Controller
@RequestMapping(value = {"/carlist/{id}"})
public class VehiclePropertiesController {

    @Autowired
    VehicleService vehicleService;

    @RequestMapping(method = RequestMethod.GET)
    public Vehicle getVehicleProperties(@PathVariable Long id) {

        return vehicleService.getVehicleById(id);
    }

    @RequestMapping(value = "/addcomment", method = RequestMethod.POST)
    public Comment addComment(@RequestBody Comment comment) {
        return null;
    }

}

