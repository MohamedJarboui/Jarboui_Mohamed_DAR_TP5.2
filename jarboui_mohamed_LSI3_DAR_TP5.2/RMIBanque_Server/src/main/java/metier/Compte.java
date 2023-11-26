package metier;

import java.io.Serializable;
import java.util.Date;

public class Compte implements Serializable {
    private  int code;
    private static  int count=0;
    private Date date;
    private  double solde;
public Compte(double solde){
    this.solde=solde;
    this.date=new Date();
    this.code=count;
    count++;
}

    @Override
    public String toString() {
        return "Compte{" +
                "code=" + code +
                ", date=" + date +
                ", solde=" + solde +
                '}';
    }

    public int getCode() {
        return code;
    }

    public static int getCount() {
        return count;
    }

    public Date getDate() {
        return date;
    }

    public double getSolde() {
        return solde;
    }
}
