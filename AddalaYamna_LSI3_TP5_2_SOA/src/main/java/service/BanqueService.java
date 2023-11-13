package service;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import metier.compte;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@WebService
public class BanqueService {

    @WebMethod
    public double conversion (@WebParam double montant) {
        return montant*3.36;
    }
    @WebMethod
    public compte getCompte(@WebParam int code) {
        return new compte(code, 0, new Date());

    }
    @WebMethod
   public List<compte> getComptes(){
        List<compte> list = new ArrayList<>();
        Date d = new Date(12, 01, 23);
        compte cmt = new compte(0, 100.6, d);
        list.add(cmt);
        return list;
    }


}
