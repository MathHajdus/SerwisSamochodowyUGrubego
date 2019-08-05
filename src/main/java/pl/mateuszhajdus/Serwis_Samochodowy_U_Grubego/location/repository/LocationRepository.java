package pl.mateuszhajdus.Serwis_Samochodowy_U_Grubego.location.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;
import pl.mateuszhajdus.Serwis_Samochodowy_U_Grubego.location.model.Location;

import java.util.List;

@Repository
public interface LocationRepository extends JpaRepository<Location, Long> {

    public Location getLocationById(Long id);

}
