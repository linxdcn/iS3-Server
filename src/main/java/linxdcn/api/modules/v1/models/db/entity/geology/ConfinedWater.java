package linxdcn.api.modules.v1.models.db.entity.geology;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by linxiaodong on 4/17/17.
 */
@Entity
@Table(name = "ConfinedWater")
public class ConfinedWater {
    @Id
    @Column(name = "ID")
    private int id;

    @Column(name = "BoreholeName")
    private String boreholeName;

    @Column(name = "SiteName")
    private String siteName;

    @Column(name = "StrataSectionID")
    private int strataSectionID;

    @Column(name = "TopElevation")
    private double topElevation;

    @Column(name = "ObservationDepth")
    private double observationDepth;

    @Column(name = "StatumName")
    private String statumName;

    @Column(name = "Layer")
    private int layer;

    @Column(name = "WaterTable")
    private double waterTable;

    @Column(name = "ObservationDate")
    private Date observationDate;

    public ConfinedWater() {
        super();
    }
}
