package pl.mateuszhajdus.Serwis_Samochodowy_U_Grubego.vehicle.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pl.mateuszhajdus.Serwis_Samochodowy_U_Grubego.vehicle.model.Equipment;

import java.util.List;

@Repository
public interface EquipmentRepository extends JpaRepository <Equipment, Long> {

    void addEquipment(Equipment equipment);

    void deleteEquipmentById(String id);

    Equipment getEquipmentByCode(String equipmentCode);

    List<Equipment> getUnexistingDistinctEquipmentListForVehicle(Long id);

    List<Equipment> getEquipmentList();

}
