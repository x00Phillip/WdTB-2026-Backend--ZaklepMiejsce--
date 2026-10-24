package pl.wsb.zaklepmiejsce.room.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "office_room")
public class OfficeRoom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false, unique = true, length = 60)
    private String name;

    @Column(name = "capacity", nullable = false)
    private Integer capacity;

    @Column(name = "floor", nullable = false)
    private Integer floor;

    @Column(name = "has_video_conference", nullable = false)
    private Boolean hasVideoConference;

    @Column(name = "description", length = 200)
    private String description;

    protected OfficeRoom() {
    }

    public OfficeRoom(String name, Integer capacity, Integer floor, Boolean hasVideoConference, String description) {
        this.name = name;
        this.capacity = capacity;
        this.floor = floor;
        this.hasVideoConference = hasVideoConference;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public Integer getFloor() {
        return floor;
    }

    public Boolean getHasVideoConference() {
        return hasVideoConference;
    }

    public String getDescription() {
        return description;
    }
}
