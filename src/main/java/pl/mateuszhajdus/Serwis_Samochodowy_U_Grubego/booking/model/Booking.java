package pl.mateuszhajdus.Serwis_Samochodowy_U_Grubego.booking.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "Bookings")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "userID")
    private Long userID;

    @Column(name = "vehicleID")
    private Long vehicleID;

    @Column(name = "locationID")
    private Long locationID;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "receiptDate")
    private Timestamp receiptDate;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "returnDate")
    private Timestamp returnDate;

    @Column(name = "bookingStateCode")
    private String bookingStateCode;

    @Column(name = "totalCost")
    private BigDecimal totalCost;

    public Booking(Long userID, Long vehicleID, Long locationID, Timestamp receiptDate, Timestamp returnDate,
                   String bookingStateCode, BigDecimal totalCost) {
        this.userID = userID;
        this.vehicleID = vehicleID;
        this.locationID = locationID;
        this.receiptDate = receiptDate;
        this.returnDate = returnDate;
        this.bookingStateCode = bookingStateCode;
        this.totalCost = totalCost;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserID() {
        return userID;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }

    public Long getVehicleID() {
        return vehicleID;
    }

    public void setVehicleID(Long vehicleID) {
        this.vehicleID = vehicleID;
    }

    public Long getLocationID() {
        return locationID;
    }

    public void setLocationID(Long locationID) {
        this.locationID = locationID;
    }

    public Timestamp getReceiptDate() {
        return receiptDate;
    }

    public void setReceiptDate(Timestamp receiptDate) {
        this.receiptDate = receiptDate;
    }

    public Timestamp getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Timestamp returnDate) {
        this.returnDate = returnDate;
    }

    public String getBookingStateCode() {
        return bookingStateCode;
    }

    public void setBookingStateCode(String bookingStateCode) {
        this.bookingStateCode = bookingStateCode;
    }

    public BigDecimal getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(BigDecimal totalCost) {
        this.totalCost = totalCost;
    }

    @Override
    public String toString() {
        return "Booking[id=" + id + ", userID=" + userID + ", vehicleID=" + vehicleID + ", locationID=" + locationID +
                ", receiptDate=" + receiptDate + ", returnDate=" + returnDate + ", bookingStateCode='" + bookingStateCode  +
                ", totalCost=" + totalCost + ']';
    }

    public Booking() {
        super();

    }
}
