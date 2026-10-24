package pl.wsb.zaklepmiejsce.booking.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "desk_booking")
public class DeskBooking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "resource_code", nullable = false, length = 20)
    private String resourceCode;

    @Column(name = "user_email", nullable = false, length = 120)
    private String userEmail;

    @Column(name = "booking_date", nullable = false)
    private LocalDate bookingDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false, length = 20)
    private BookingStatus status;

    @Column(name = "notes", length = 200)
    private String notes;

    protected DeskBooking() {
    }

    public DeskBooking(String resourceCode, String userEmail, LocalDate bookingDate, BookingStatus status, String notes) {
        this.resourceCode = resourceCode;
        this.userEmail = userEmail;
        this.bookingDate = bookingDate;
        this.status = status;
        this.notes = notes;
    }

    public Long getId() {
        return id;
    }

    public String getResourceCode() {
        return resourceCode;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public LocalDate getBookingDate() {
        return bookingDate;
    }

    public BookingStatus getStatus() {
        return status;
    }

    public String getNotes() {
        return notes;
    }
}
