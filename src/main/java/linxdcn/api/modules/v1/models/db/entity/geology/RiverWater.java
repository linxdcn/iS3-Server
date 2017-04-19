package linxdcn.api.modules.v1.models.db.entity.geology;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by linxiaodong on 4/19/17.
 */
@Entity
@Table(name = "RiverWater")
public class RiverWater {
    @Id
    @Column(name = "ID")
    private int id;

    @Column(name = "ObservationLocation")
    private String observationLocation;

    @Column(name = "HighestTidalLevel")
    private double highestTidalLevel;

    @Column(name = "HighestTidalLevelDate")
    private Date highestTidalLevelDate;

    @Column(name = "LowestTidalLevel")
    private double lowestTidalLevel;

    @Column(name = "LowestTidalLevelDate")
    private Date lowestTidalLevelDate;

    @Column(name = "AvHighTidalLevel")
    private double avHighTidalLevel;

    @Column(name = "AvLowTidalLevel")
    private double avLowTidalLevel;

    @Column(name = "AvTidalRange")
    private double avTidalRange;

    @Column(name = "DurationOfRise")
    private String durationOfRise;

    @Column(name = "DurationOfFall")
    private String durationOfFall;

    public RiverWater () {
        super();
    }

    public int getId() {
        return id;
    }

    public String getObservationLocation() {
        return observationLocation;
    }

    public double getHighestTidalLevel() {
        return highestTidalLevel;
    }

    public Date getHighestTidalLevelDate() {
        return highestTidalLevelDate;
    }

    public double getLowestTidalLevel() {
        return lowestTidalLevel;
    }

    public Date getLowestTidalLevelDate() {
        return lowestTidalLevelDate;
    }

    public double getAvHighTidalLevel() {
        return avHighTidalLevel;
    }

    public double getAvLowTidalLevel() {
        return avLowTidalLevel;
    }

    public double getAvTidalRange() {
        return avTidalRange;
    }

    public String getDurationOfRise() {
        return durationOfRise;
    }

    public String getDurationOfFall() {
        return durationOfFall;
    }
}
