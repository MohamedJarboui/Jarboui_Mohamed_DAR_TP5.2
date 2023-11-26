package rmiClient;

import java.rmi.Naming;

import metier.Compte;
import rmiService.IBanque;
public class BanqueClient {
    public static void main(String[] args)
    {
        try{
            IBanque stub = (IBanque) Naming.lookup("rmi://localhost:1097/BanqueObject");
            stub.creerCompte(new Compte(122.015));
            stub.creerCompte(new Compte(0));
            stub.creerCompte(new Compte(25));


            System.out.println(stub.getInfoCompte(2));
            System.out.println(stub.getInfoCompte(7));


        }catch(Exception e){
            e.printStackTrace();
        }
    }

}
