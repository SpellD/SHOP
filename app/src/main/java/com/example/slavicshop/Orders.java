package com.example.slavicshop;

public class Orders {

    String eml;
    String tel;
    String nameP;

    public Orders(String eml, String tel, String nameP) {
        this.eml = eml;
        this.tel = tel;
        this.nameP = nameP;
    }

    public String getEml() {
        return eml;
    }

    public String getTel() {
        return tel;
    }

    public String getNameP() {
        return nameP;
    }
}
