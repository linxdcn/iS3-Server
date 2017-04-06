package linxdcn.api.modules.models.db.entity.geology;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

/**
 * Created by linxiaodong on 4/6/17.
 */
@Entity
@Table(name = "BoreholeStrataInfo")
public class BoreholeStrataInfo {
    @Id
    @Column(name = "ID")
    private int id;

    @Column(name = "StratumSequenceInBorehole")
    private int stratumSequenceInBorehole;

    @Column(name = "ElevationOfStratumBottom")
    private double elevationOfStratumBottom;

    @ManyToOne
    @JoinColumn(name = "BoreholeID")
    @JsonIgnore
    private Borehole borehole;

    @ManyToOne
    @JoinColumn(name = "StratumID")
    private Strata strata;

    public int getId() {
        return id;
    }

    public int getStratumSequenceInBorehole() {
        return stratumSequenceInBorehole;
    }

    public double getElevationOfStratumBottom() {
        return elevationOfStratumBottom;
    }

    public Borehole getBorehole() {
        return borehole;
    }

    public Strata getStrata() {
        return strata;
    }
}
