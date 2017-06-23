package service;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by bobby on 6/22/2017.
 */
@XmlRootElement
public class Car {
    int autoid;
    String merk;
    Double prijs;
    String beschrijving;

    public String toString(){
        return "Car [AutoID=" + autoid + ", merk=" + merk + ", prijs=" + prijs + ", beschrijving=" + beschrijving + "]";
    }

    public Car() {super();}

    public Car(int autoid, String merk, Double prijs, String beschrijving){
        super();
        this.autoid = autoid;
        this.merk = merk;
        this.prijs = prijs;
        this.beschrijving = beschrijving;
    }
    @XmlAttribute
    public void setAutoId(int autoid) {this.autoid = autoid;}
    public int getAutoId(){return autoid;}

    public void setMerk(String merk){this.merk = merk;}
    public String getMerk(){return merk;}

    public void setPrijs(Double prijs){this.prijs = prijs;}
    public Double getPrijs(){return prijs;}

    public void setBecshrijving(String beschrijving){this.beschrijving = beschrijving;}
    public String getBeschrijving(){return beschrijving;}
}
