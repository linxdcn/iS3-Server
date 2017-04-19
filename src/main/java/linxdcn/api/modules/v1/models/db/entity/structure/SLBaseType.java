package linxdcn.api.modules.v1.models.db.entity.structure;

import javax.persistence.*;

/**
 * Created by linxiaodong on 4/19/17.
 */
@Entity
@Table(name = "SLBaseType")
public class SLBaseType {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "ID")
    private int id;

    @Column(name = "SLBaseTypeID")
    private int slBaseTypeID;

    @Column(name = "SLCategory")
    private String slCategory;

    @Column(name = "SLShape")
    private String slShape;

    @Column(name = "SLNumOfSegments")
    private int slNumOfSegments;

    @Column(name = "SLConicity")
    private double slConicity;

    @Column(name = "SLThickness")
    private double slThickness;

    @Column(name = "SLWidth")
    private double slWidth;

    @Column(name = "SLOutDiameter")
    private double slOutDiameter;

    @Column(name = "SLInnerDiameter")
    private double slInnerDiameter;

    @Column(name = "SLTotalKeyPos")
    private int slTotalKeyPos;

    public SLBaseType(){
        super();
    }

    public int getId() {
        return id;
    }

    public int getSlBaseTypeID() {
        return slBaseTypeID;
    }

    public String getSlCategory() {
        return slCategory;
    }

    public String getSlShape() {
        return slShape;
    }

    public int getSlNumOfSegments() {
        return slNumOfSegments;
    }

    public double getSlConicity() {
        return slConicity;
    }

    public double getSlThickness() {
        return slThickness;
    }

    public double getSlWidth() {
        return slWidth;
    }

    public double getSlOutDiameter() {
        return slOutDiameter;
    }

    public double getSlInnerDiameter() {
        return slInnerDiameter;
    }

    public int getSlTotalKeyPos() {
        return slTotalKeyPos;
    }
}
