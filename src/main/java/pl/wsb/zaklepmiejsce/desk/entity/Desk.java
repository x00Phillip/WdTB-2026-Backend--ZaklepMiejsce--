package pl.wsb.zaklepmiejsce.desk.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name = "desk")
public class Desk {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "code", nullable = false, unique = true, length = 20)
    private String code;

    @Enumerated(EnumType.STRING)
    @Column(name = "desk_type", nullable = false, length = 30)
    private DeskType deskType;

    @Embedded
    private DeskLocation location;

    @Column(name = "daily_fee", nullable = false, precision = 10, scale = 2)
    private BigDecimal dailyFee;

    @Column(name = "active", nullable = false)
    private Boolean active;

    protected Desk() {
    }

    public Desk(String code, DeskType deskType, DeskLocation location, BigDecimal dailyFee, Boolean active) {
        this.code = code;
        this.deskType = deskType;
        this.location = location;
        this.dailyFee = dailyFee;
        this.active = active;
    }

    public Long getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public DeskType getDeskType() {
        return deskType;
    }

    public DeskLocation getLocation() {
        return location;
    }

    public BigDecimal getDailyFee() {
        return dailyFee;
    }

    public Boolean getActive() {
        return active;
    }
}
