package linxdcn.api.modules.v1.models.db.entity.geology;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by linxiaodong on 4/17/17.
 */
@Entity
@Table(name = "PhreaticWater")
public class PhreaticWater {
    @Id
    @Column(name = "ID")
    private int id;

    @Column(name = "SiteName")
    private String siteName;

    @Column(name = "AvBuriedDepth")
    private double avBuriedDepth;

    @Column(name = "AvElevation")
    private double avElevation;

    @Column(name = "StratumSectionID")
    private int stratumSectionID;

    public PhreaticWater() {
        super();
    }

    public int getId() {
        return id;
    }

    public String getSiteName() {
        return siteName;
    }

    public double getAvBuriedDepth() {
        return avBuriedDepth;
    }

    public double getAvElevation() {
        return avElevation;
    }

    public int getStratumSectionID() {
        return stratumSectionID;
    }
}
