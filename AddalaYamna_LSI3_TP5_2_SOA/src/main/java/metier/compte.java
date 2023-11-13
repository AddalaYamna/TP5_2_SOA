package metier;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;

import java.util.Date;
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class compte  {

    int code;
    Double solde;
    @XmlTransient
    Date DateCreation;



    public compte(int code, double d, Date dateCreation) {
        super();
        this.code = code;
        this.solde = d;
        DateCreation = dateCreation;
    }
    public compte() {

    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Double getSolde() {
        return solde;
    }

    public void setSolde(float solde) {
        this.solde = (double) solde;
    }

    public Date getDateCreation() {
        return DateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        DateCreation = dateCreation;
    }





}
