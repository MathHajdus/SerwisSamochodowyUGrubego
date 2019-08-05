package pl.mateuszhajdus.Serwis_Samochodowy_U_Grubego.authentication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import pl.mateuszhajdus.Serwis_Samochodowy_U_Grubego.authentication.model.User;
import pl.mateuszhajdus.Serwis_Samochodowy_U_Grubego.authentication.repository.RoleRepository;
import pl.mateuszhajdus.Serwis_Samochodowy_U_Grubego.authentication.repository.UserRepository;

import java.util.HashSet;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public void save(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setRoles(new HashSet<>(roleRepository.findAll()));
        userRepository.save(user);
    }

    @Override
    public Optional<User> findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
