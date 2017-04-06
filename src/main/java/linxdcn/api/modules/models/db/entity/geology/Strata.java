package linxdcn.api.modules.models.db.entity.geology;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by linxiaodong on 4/6/17.
 */
@Entity
@Table(name = "Strata")
public class Strata {
    @Id
    @Column(name = "ID")
    private int id;

    @Column(name = "Name")
    private String name;

    @Column(name = "FullName")
    private String fullName;

    @Column(name = "GeologicalAge")
    private String geologicalAge;

    @Column(name = "FormationType")
    private String formationType;

    @Column(name = "Compaction")
    private String compaction;

    @Column(name = "ElevationOfStratumBottom")
    private String elevationOfStratumBottom;

    @Column(name = "Thickness")
    private String thickness;

    @Column(name = "Description", length = 16777216)
    private String description;

    public Strata() {
        super();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getFullName() {
        return fullName;
    }

    public String getGeologicalAge() {
        return geologicalAge;
    }

    public String getFormationType() {
        return formationType;
    }

    public String getCompaction() {
        return compaction;
    }

    public String getElevationOfStratumBottom() {
        return elevationOfStratumBottom;
    }

    public String getThickness() {
        return thickness;
    }

    public String getDescription() {
        return description;
    }
}
