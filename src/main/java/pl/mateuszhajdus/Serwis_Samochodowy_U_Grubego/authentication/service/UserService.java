package pl.mateuszhajdus.Serwis_Samochodowy_U_Grubego.authentication.service;

import pl.mateuszhajdus.Serwis_Samochodowy_U_Grubego.authentication.model.User;

import java.util.Optional;

public interface UserService {
    void save(User user);

    Optional<User> findByUsername(String username);
}
