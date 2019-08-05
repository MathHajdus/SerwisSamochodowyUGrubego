package pl.mateuszhajdus.Serwis_Samochodowy_U_Grubego.booking.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "ChangesBookings")
public class ChangeBooking {

    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "bookingID")
    private Long bookingID;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "changeDate")
    private LocalDateTime changeDate;

    @Column(name = "who")
    private String who;

    @Column(name = "PC")
    private String PC;

    public ChangeBooking(Long bookingID, LocalDateTime changeDate, String who, String pC) {
        super();
        this.bookingID = bookingID;
        this.changeDate = changeDate;
        this.who = who;
        PC = pC;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBookingID() {
        return bookingID;
    }

    public void setBookingID(Long bookingID) {
        this.bookingID = bookingID;
    }

    public LocalDateTime getChangeDate() {
        return changeDate;
    }

    public void setChangeDate(LocalDateTime changeDate) {
        this.changeDate = changeDate;
    }

    public String getWho() {
        return who;
    }

    public void setWho(String who) {
        this.who = who;
    }

    public String getPC() {
        return PC;
    }

    public void setPC(String PC) {
        this.PC = PC;
    }

    @Override
    public String toString() {
        return "ChangeBooking[id=" + id + ", bookingID=" + bookingID + ", changeDate=" + changeDate + ", who=" + who +
                ", PC=" + PC  + ']';
    }

    public ChangeBooking() {
        super();


    }
}
