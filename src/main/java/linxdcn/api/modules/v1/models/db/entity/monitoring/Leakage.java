package linxdcn.api.modules.v1.models.db.entity.monitoring;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by linxiaodong on 4/19/17.
 */
@Entity
@Table(name = "Leakage")
public class Leakage {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "ID")
    private int id;

    @Column(name = "StartMilage")
    private String startMilage;

    @Column(name = "EndMilage")
    private String endMilage;

    @Column(name = "MetroLine")
    private int metroLine;

    @Column(name = "LineNo")
    private int lineNo;

    @Column(name = "StartRingNo")
    private int startRingNo;

    @Column(name = "EndRingNo")
    private int endRingNo;

    @Column(name = "SLCode")
    private String slCode;

    @Column(name = "StartAngle")
    private double startAngle;

    @Column(name = "EndAngle")
    private double endAngle;

    @Column(name = "Area")
    private double area;

    @Column(name = "Speed")
    private double speed;

    @Column(name = "Status")
    private String status;

    @Column(name = "p")
    private String p;

    @Column(name = "pH")
    private String pH;

    @Column(name = "WaterSample")
    private String waterSample;

    @Column(name = "Date")
    private Date date;

    @Column(name = "Document")
    private String document;

    @Column(name = "Discription")
    private String discription;

    public Leakage() {
        super();
    }

    public int getId() {
        return id;
    }

    public String getStartMilage() {
        return startMilage;
    }

    public String getEndMilage() {
        return endMilage;
    }

    public int getMetroLine() {
        return metroLine;
    }

    public int getLineNo() {
        return lineNo;
    }

    public int getStartRingNo() {
        return startRingNo;
    }

    public int getEndRingNo() {
        return endRingNo;
    }

    public String getSlCode() {
        return slCode;
    }

    public double getStartAngle() {
        return startAngle;
    }

    public double getEndAngle() {
        return endAngle;
    }

    public double getArea() {
        return area;
    }

    public double getSpeed() {
        return speed;
    }

    public String getStatus() {
        return status;
    }

    public String getP() {
        return p;
    }

    public String getpH() {
        return pH;
    }

    public String getWaterSample() {
        return waterSample;
    }

    public Date getDate() {
        return date;
    }

    public String getDocument() {
        return document;
    }

    public String getDiscription() {
        return discription;
    }
}
