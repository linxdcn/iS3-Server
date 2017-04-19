package linxdcn.api.modules.v1.models.db.entity.monitoring;

import linxdcn.api.modules.v1.models.db.entity.structure.SLConstructionRecord;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by linxiaodong on 4/19/17.
 */
@Entity
@Table(name = "SLConvergence")
public class SLConvergence {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "ID")
    private int id;

    @Column(name = "Milage")
    private double milage;

    @Column(name = "LineNo")
    private int lineNo;

    @Column(name = "RingNo")
    private int ringNo;

    @Column(name = "HorizontalRad")
    private double horizontalRad;

    @Column(name = "HorizontalDeviation")
    private double HorizontalDeviation;

    @Column(name = "VerticalRad")
    private double verticalRad;

    @Column(name = "VerticalDeviation")
    private double VerticalDeviation;

    @Column(name = "Date")
    private Date date;

    public SLConvergence() {
        super();
    }

    public int getId() {
        return id;
    }

    public double getMilage() {
        return milage;
    }

    public int getLineNo() {
        return lineNo;
    }

    public int getRingNo() {
        return ringNo;
    }

    public double getHorizontalRad() {
        return horizontalRad;
    }

    public double getHorizontalDeviation() {
        return HorizontalDeviation;
    }

    public double getVerticalRad() {
        return verticalRad;
    }

    public double getVerticalDeviation() {
        return VerticalDeviation;
    }

    public Date getDate() {
        return date;
    }
}
