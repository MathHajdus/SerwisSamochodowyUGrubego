package pl.mateuszhajdus.Serwis_Samochodowy_U_Grubego.exception;

public class BookingUnavailableVehicleException extends Throwable {

    public BookingUnavailableVehicleException(final String message){
        super(message);
    }
}
