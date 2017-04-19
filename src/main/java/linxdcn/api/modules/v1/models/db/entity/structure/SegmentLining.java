package linxdcn.api.modules.v1.models.db.entity.structure;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by linxiaodong on 4/19/17.
 */
@Entity
@Table(name = "SegmentLining")
public class SegmentLining {
    @Id
    @Column(name = "ID")
    private int id;

    @Column(name = "Centroid_Z")
    private double centroid_Z;

    @Column(name = "LineNo")
    private int lineNo;

    @Column(name = "RingNo")
    private int ringNo;

    @Column(name = "MilageAsDesign")
    private double milageAsDesign;

    @Column(name = "DesignX")
    private double designX;

    @Column(name = "DesignY")
    private double designY;

    @Column(name = "DesignH")
    private double designH;

    @Column(name = "SLTypeIDAsDesign")
    private int slTypeIDAsDesign;

    @Column(name = "Name")
    private String name;

    @Column(name = "FullName")
    private String fullName;

    @Column(name = "Description")
    private String description;

    public SegmentLining() {
        super();
    }

    public int getId() {
        return id;
    }

    public double getCentroid_Z() {
        return centroid_Z;
    }

    public int getLineNo() {
        return lineNo;
    }

    public int getRingNo() {
        return ringNo;
    }

    public double getMilageAsDesign() {
        return milageAsDesign;
    }

    public double getDesignX() {
        return designX;
    }

    public double getDesignY() {
        return designY;
    }

    public double getDesignH() {
        return designH;
    }

    public int getSlTypeIDAsDesign() {
        return slTypeIDAsDesign;
    }

    public String getName() {
        return name;
    }

    public String getFullName() {
        return fullName;
    }

    public String getDescription() {
        return description;
    }
}
