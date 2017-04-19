package linxdcn.api.modules.v1.models.db.entity.geology;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by linxiaodong on 4/19/17.
 */
@Entity
@Table(name = "SoilProperty")
public class SoilProperty {
    @Id
    @Column(name = "ID")
    private int id;

    @Column(name = "Name")
    private String name;

    @Column(name = "StratumSectionID")
    private int stratumSectionID;

    @Column(name = "StratumID")
    private int stratumID;

    @Column(name = "w")
    private double w;

    @Column(name = "gama")
    private double gama;

    @Column(name = "Kv")
    private double kv;

    @Column(name = "Kh")
    private double kh;

    @Column(name = "ccq")
    private double ccq;

    @Column(name = "faicq")
    private double faicq;

    @Column(name = "c_s")
    private double c_s;

    @Column(name = "fais")
    private double fais;

    @Column(name = "a01_02")
    private double a01_02;

    @Column(name = "Es01_02")
    private double es01_02;

    @Column(name = "qu")
    private double qu;

    @Column(name = "K0")
    private double k0;

    @Column(name = "cuu")
    private double cuu;

    @Column(name = "faiuu")
    private double faiuu;

    @Column(name = "ccu")
    private double ccu;

    @Column(name = "faicu")
    private double faicu;

    @Column(name = "cprime")
    private double cprime;

    @Column(name = "faiprime")
    private double faiprime;

    @Column(name = "E015_0025")
    private double e015_0025;

    @Column(name = "E02_0025")
    private double e02_0025;

    @Column(name = "E04_0025")
    private double e04_0025;

    @Column(name = "Cu")
    private double cu;

    @Column(name = "c")
    private double c;

    @Column(name = "fai")
    private double fai;

    @Column(name = "Cs")
    private double cs;

    @Column(name = "e")
    private double e;

    @Column(name = "av")
    private double av;

    @Column(name = "G0")
    private double g0;

    @Column(name = "ar")
    private double ar;

    @Column(name = "br")
    private double br;

    @Column(name = "G")
    private double g;

    @Column(name = "Sr")
    private double sr;

    public SoilProperty() {
        super();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getStratumSectionID() {
        return stratumSectionID;
    }

    public int getStratumID() {
        return stratumID;
    }

    public double getW() {
        return w;
    }

    public double getGama() {
        return gama;
    }

    public double getKv() {
        return kv;
    }

    public double getKh() {
        return kh;
    }

    public double getCcq() {
        return ccq;
    }

    public double getFaicq() {
        return faicq;
    }

    public double getC_s() {
        return c_s;
    }

    public double getFais() {
        return fais;
    }

    public double getA01_02() {
        return a01_02;
    }

    public double getEs01_02() {
        return es01_02;
    }

    public double getQu() {
        return qu;
    }

    public double getK0() {
        return k0;
    }

    public double getCuu() {
        return cuu;
    }

    public double getFaiuu() {
        return faiuu;
    }

    public double getCcu() {
        return ccu;
    }

    public double getFaicu() {
        return faicu;
    }

    public double getCprime() {
        return cprime;
    }

    public double getFaiprime() {
        return faiprime;
    }

    public double getE015_0025() {
        return e015_0025;
    }

    public double getE02_0025() {
        return e02_0025;
    }

    public double getE04_0025() {
        return e04_0025;
    }

    public double getCu() {
        return cu;
    }

    public double getC() {
        return c;
    }

    public double getFai() {
        return fai;
    }

    public double getCs() {
        return cs;
    }

    public double getE() {
        return e;
    }

    public double getAv() {
        return av;
    }

    public double getG0() {
        return g0;
    }

    public double getAr() {
        return ar;
    }

    public double getBr() {
        return br;
    }

    public double getG() {
        return g;
    }

    public double getSr() {
        return sr;
    }
}
