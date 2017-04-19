package linxdcn.api.modules.v1.models.db.entity.structure;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by linxiaodong on 4/19/17.
 */
@Entity
@Table(name = "Segment")
public class Segment {
    @Id
    @Column(name = "ID")
    private int id;

    @Column(name = "SLBaseTypeID")
    private int slBaseTypeID;

    @Column(name = "StartAngle")
    private double StartAngle;

    @Column(name = "CentralAngle")
    private double centralAngle;

    @Column(name = "Code")
    private String code;

    public Segment() {
        super();
    }

    public int getId() {
        return id;
    }

    public int getSlBaseTypeID() {
        return slBaseTypeID;
    }

    public double getStartAngle() {
        return StartAngle;
    }

    public double getCentralAngle() {
        return centralAngle;
    }

    public String getCode() {
        return code;
    }
}
