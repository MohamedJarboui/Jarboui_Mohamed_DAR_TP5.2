package rmiService;
import metier.Compte;

import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;
public class BanqueImpl implements IBanque{
    List<Compte> comptes = new ArrayList <>();
    public BanqueImpl()throws RemoteException
    {
    }
    @Override
    public String creerCompte(Compte c)
    {
        comptes.add(c);
        return("Le compte avec le code "+c.getCode()+" est créé le "+c.getDate());
    }
    @Override
    public String getInfoCompte(int code)
    {
        for(Compte c : comptes)
        {
            if (c.getCode() == code)
            {
                return "Le compte avec le code "+c.getCode()+"\ncontient "+c.getSolde()+"\ncree le "+c.getDate();
            }
        }
        return "Aucun compte avec ce code";
    }

}
