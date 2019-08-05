package pl.mateuszhajdus.Serwis_Samochodowy_U_Grubego.authentication.service;

public interface SecurityService {
    String findLoggedInUsername();

    void autoLogin(String username, String password);
}
