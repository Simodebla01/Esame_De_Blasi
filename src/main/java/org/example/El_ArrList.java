package org.example;

import java.util.ArrayList;
import com.google.gson.Gson;
public class El_ArrList {
    Gson gson=new Gson();
    ArrayList<Cars> arr;
    El_ArrList(){
        arr=new ArrayList<Cars>();
    }

    void add_Prodotti(String brand,int id,double price){
        Cars a=new Cars( brand, id, price);
        arr.add(a);
    }


    void crea_lista(){
        add_Prodotti("fiat",1,1546.32);
        add_Prodotti("bmw",2,45448.35);
        add_Prodotti("audi",3,94688.22);
        add_Prodotti("lexus",4,89863.22);
        add_Prodotti("honda",5,353.52);
        add_Prodotti("clclcl",6,1416.85);
    }

    String all(){
        String msg="";
        String result;
        result="[{\"cars\":";
        for (int i = 0; i < arr.size(); i++) {
            result=result+gson.toJson(arr.get(i));
        }
        result=result+"}]";
        return result;

    }

    String moreExpensive(){
        arr.sort((Cars p1, Cars p2)->(int) (p2.price-p1.price));
        return gson.toJson(arr.get(0));
    }
    String allSorted(){
        arr.sort((Cars p1, Cars p2)->(int) (p1.price-p2.price));
        String result;
        result="[{\"cars\":";
        for (int i = 0; i < arr.size(); i++) {
            result=result+gson.toJson(arr.get(i));
        }
        result=result+"}]";
        return result;
    }


}