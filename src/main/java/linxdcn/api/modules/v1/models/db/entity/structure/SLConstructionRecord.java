package linxdcn.api.modules.v1.models.db.entity.structure;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by linxiaodong on 4/19/17.
 */
@Entity
@Table(name = "SLConstructionRecord")
public class SLConstructionRecord {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "ID")
    private int id;

    @Column(name = "LineNo")
    private int lineNo;

    @Column(name = "MilageAsBuilt")
    private double milageAsBuilt;

    @Column(name = "SLTypeIDAsBuilt")
    private int slTypeIDAsBuilt;

    @Column(name = "ConstructionDate")
    private Date constructionDate;

    @Column(name = "KeySegementPositionNum")
    private int keySegementPositionNum;

    @Column(name = "IsDataMissing")
    private int isDataMissing;

    @Column(name = "Remarks")
    private String remarks;

    @Column(name = "RingNo")
    private int ringNo;

    public SLConstructionRecord() {
        super();
    }

    public int getId() {
        return id;
    }

    public int getLineNo() {
        return lineNo;
    }

    public double getMilageAsBuilt() {
        return milageAsBuilt;
    }

    public int getSlTypeIDAsBuilt() {
        return slTypeIDAsBuilt;
    }

    public Date getConstructionDate() {
        return constructionDate;
    }

    public int getKeySegementPositionNum() {
        return keySegementPositionNum;
    }

    public int getIsDataMissing() {
        return isDataMissing;
    }

    public String getRemarks() {
        return remarks;
    }

    public int getRingNo() {
        return ringNo;
    }
}
