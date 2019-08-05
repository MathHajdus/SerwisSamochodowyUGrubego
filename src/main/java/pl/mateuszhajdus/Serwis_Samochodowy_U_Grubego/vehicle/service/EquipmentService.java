package pl.mateuszhajdus.Serwis_Samochodowy_U_Grubego.vehicle.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.mateuszhajdus.Serwis_Samochodowy_U_Grubego.vehicle.model.Equipment;
import pl.mateuszhajdus.Serwis_Samochodowy_U_Grubego.vehicle.repository.EquipmentRepository;

import java.util.List;

@Service
public class EquipmentService {

    @Autowired
    private EquipmentRepository equipmentRepository;

    public List<Equipment> getEquipmentList() {
        return equipmentRepository.getEquipmentList();
    }

    public List<Equipment> getUnexistingDistinctEquipmentListForVehicle(Long id) {
        return equipmentRepository.getUnexistingDistinctEquipmentListForVehicle(id);
    }

    public void addEquipment(Equipment equipment) {
        equipmentRepository.addEquipment(equipment);
    }

    public void deleteEquipmentById(String id) {
        equipmentRepository.deleteEquipmentById(id);
    }

    public Equipment getEquipmentByCode(String equipmentCode) {
        return equipmentRepository.getEquipmentByCode(equipmentCode);
    }
}
