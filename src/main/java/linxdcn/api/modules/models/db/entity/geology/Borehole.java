package linxdcn.api.modules.models.db.entity.geology;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

/**
 * Created by linxiaodong on 4/6/17.
 */
@Entity
@Table(name = "Borehole")
public class Borehole {
    @Id
    @Column(name = "ID")
    private int id;

    @Column(name = "Name")
    private String name;

    @Column(name = "FullName")
    private String fullName;

    @Column(name = "Description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "StratumSection")
    @JsonIgnore
    private StrataSection strataSection;

    @Column(name ="SectionSequence")
    private int sectionSequence;

    @Column(name = "BoreholeType")
    private String boreholeType;

    @Column(name = "TopElevation")
    private double topElevation;

    @Column(name = "BoreholeLength")
    private double boreholeLength;

    @Column(name = "Mileage")
    private String mileage;

    @Column(name = "Xcoordinate")
    private double xcoordinate;

    @Column(name = "Ycoordinate")
    private double ycoordinate;

    @OneToMany(mappedBy = "borehole", cascade = {CascadeType.ALL})
    List<BoreholeStrataInfo> boreholeStrataInfoList;

    public Borehole() {
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

    public String getDescription() {
        return description;
    }

    public StrataSection getStrataSection() {
        return strataSection;
    }

    public int getSectionSequence() {
        return sectionSequence;
    }

    public String getBoreholeType() {
        return boreholeType;
    }

    public double getTopElevation() {
        return topElevation;
    }

    public double getBoreholeLength() {
        return boreholeLength;
    }

    public String getMileage() {
        return mileage;
    }

    public double getXcoordinate() {
        return xcoordinate;
    }

    public double getYcoordinate() {
        return ycoordinate;
    }

    public List<BoreholeStrataInfo> getBoreholeStrataInfoList() {
        return boreholeStrataInfoList;
    }
}
