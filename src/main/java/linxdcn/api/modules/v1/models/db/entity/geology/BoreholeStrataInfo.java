package linxdcn.api.modules.v1.models.db.entity.geology;

import com.fasterxml.jackson.annotation.JsonBackReference;

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
    @JsonBackReference
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
