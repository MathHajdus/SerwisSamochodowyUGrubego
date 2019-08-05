package pl.mateuszhajdus.Serwis_Samochodowy_U_Grubego.booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.mateuszhajdus.Serwis_Samochodowy_U_Grubego.booking.model.Booking;

@Repository
public interface BookingRepository extends JpaRepository <Booking, Long> {

    void addBooking(Booking booking);
}
