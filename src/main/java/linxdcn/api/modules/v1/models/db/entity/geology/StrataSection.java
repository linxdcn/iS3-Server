package linxdcn.api.modules.v1.models.db.entity.geology;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

/**
 * Created by linxiaodong on 4/2/17.
 */
@Entity
@Table(name = "StrataSection")
public class StrataSection {
    @Id
    @Column(name = "ID")
    private int id;

    @Column(name = "Name")
    private String name;

    @Column(name = "StartMileage")
    private String startMileage;

    @Column(name = "EndMileage")
    private String endMileage;

    @OneToMany(mappedBy = "strataSection",cascade = {CascadeType.ALL})
    @JsonBackReference
    private List<Borehole> boreholes;

    public StrataSection() {
        super();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getStartMileage() {
        return startMileage;
    }

    public String getEndMileage() {
        return endMileage;
    }

    public List<Borehole> getBoreholes() {
        return boreholes;
    }
}
