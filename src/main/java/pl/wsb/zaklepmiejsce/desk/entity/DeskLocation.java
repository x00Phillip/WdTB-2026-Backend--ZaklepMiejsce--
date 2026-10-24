package pl.wsb.zaklepmiejsce.desk.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class DeskLocation {

    @Column(name = "floor", nullable = false)
    private Integer floor;

    @Column(name = "zone", nullable = false, length = 30)
    private String zone;

    @Column(name = "has_dual_monitor", nullable = false)
    private Boolean hasDualMonitor;

    @Column(name = "has_docking_station", nullable = false)
    private Boolean hasDockingStation;

    protected DeskLocation() {
    }

    public DeskLocation(Integer floor, String zone, Boolean hasDualMonitor, Boolean hasDockingStation) {
        this.floor = floor;
        this.zone = zone;
        this.hasDualMonitor = hasDualMonitor;
        this.hasDockingStation = hasDockingStation;
    }

    public Integer getFloor() {
        return floor;
    }

    public String getZone() {
        return zone;
    }

    public Boolean getHasDualMonitor() {
        return hasDualMonitor;
    }

    public Boolean getHasDockingStation() {
        return hasDockingStation;
    }
}
