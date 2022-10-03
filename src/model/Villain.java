/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author diede
 */
public class Villain {
    private int live;
    private int atack;
    private String name;
    private String NamespH;
    private int espH;
public Villain(int live, int atack, String name, String NamespH, int espH){
    this.live = live;
    this.atack = atack;
    this.name= name;
    this.NamespH = NamespH;
    this.espH = espH;
}
    public void setLive(int live) {
        this.live = live;
    }

    public void setAtack(int atack) {
        this.atack = atack;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNamespH(String NamespH) {
        this.NamespH = NamespH;
    }

    public void setEspH(int espH) {
        this.espH = espH;
    }

    public int getLive() {
        return live;
    }

    public int getAtack() {
        return atack;
    }

    public String getName() {
        return name;
    }

    public String getNamespH() {
        return NamespH;
    }

    public int getEspH() {
        return espH;
    }
    
    
}
