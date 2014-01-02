package edu.sau.sausensor.client.service;

import edu.sau.sausensor.client.domain.Mts400Results;

import java.util.ArrayList;
import java.util.Map;

/**
 * Created by Vostro on 02.01.2014.
 */
public class DAO {
    WebServiceProvider webServiceProvider;
     public DAO(){
         webServiceProvider=new WebServiceProvider("admin","admin");
     }
    //singleton yapılacak
    public Mts400Results getMts400Result(Map params){
        return (Mts400Results)webServiceProvider.getResult("http://192.168.1.116:8080/sausensor/mts400resultses/{id}",params,Mts400Results.class);
    }

}
