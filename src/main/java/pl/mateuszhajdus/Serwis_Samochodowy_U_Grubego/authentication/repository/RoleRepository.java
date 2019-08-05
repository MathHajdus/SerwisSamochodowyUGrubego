package pl.mateuszhajdus.Serwis_Samochodowy_U_Grubego.authentication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.mateuszhajdus.Serwis_Samochodowy_U_Grubego.authentication.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
