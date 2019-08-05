package pl.mateuszhajdus.Serwis_Samochodowy_U_Grubego.vehicle.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.mateuszhajdus.Serwis_Samochodowy_U_Grubego.vehicle.model.Equipment;
import pl.mateuszhajdus.Serwis_Samochodowy_U_Grubego.vehicle.service.EquipmentService;

import java.util.List;

@RestController
@RequestMapping(value = { "/equipmentlist" })
public class EquipmentControler {

    @Autowired
    private EquipmentService equipmentService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Equipment> getEquipmentList() {
        return equipmentService.getEquipmentList();
    }

    @RequestMapping(value = { "/{id}" }, method = RequestMethod.GET)
    public List<Equipment> getUnexistingDistinctEquipmentListForVehicle(@PathVariable Long id) {
        return equipmentService.getUnexistingDistinctEquipmentListForVehicle(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addEquipment(@RequestBody Equipment equipment) {
        equipmentService.addEquipment(equipment);
    }

    @RequestMapping(value = { "/{eqpCode}" }, method = RequestMethod.DELETE)
    public void deleteEquipment(@PathVariable String eqpCode) {
        equipmentService.deleteEquipmentById(eqpCode);
    }

}
