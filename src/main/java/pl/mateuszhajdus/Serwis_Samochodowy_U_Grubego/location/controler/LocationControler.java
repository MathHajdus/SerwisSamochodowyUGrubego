package pl.mateuszhajdus.Serwis_Samochodowy_U_Grubego.location.controler;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;
import pl.mateuszhajdus.Serwis_Samochodowy_U_Grubego.location.model.Location;
import pl.mateuszhajdus.Serwis_Samochodowy_U_Grubego.location.service.LocationService;

import java.util.List;

@RestController
@RequestMapping(value = {"/locations"})
public class LocationControler {

    @Autowired
    LocationService locationsService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Location> getLocationList() {
        return locationsService.getLocationList();
    }

    /*@RequestMapping(method = RequestMethod.GET, params = {"page", "number"})
    public Page<Location> getAllBookingsFOrPage(@RequestParam(value = "page") int page,
                                                @RequestParam(value = "number") int number) {
        return locationsService.getLocationListForPage(new PageRequest(page, number));
    }*/
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Location getLocationById(@PathVariable Long id) {
        return locationsService.getLocationById(id);
}
}
