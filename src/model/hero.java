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
public class hero {
    private int live;
    private int atack;
    private String itemsname;
    private int items1;
    private int items2;
    private String name;
    private String message;
    private int cantitems;
    
   public hero(int live, int atack, String itemsname, int items1, int items2, String name, String message, int catitems){
       this.atack = atack;
       this.live = live;
       this.itemsname = itemsname;
       this.items2 = items2;
       this.items1 = items1;
       this.message=message;
       this.cantitems = cantitems;
       this.name = name;
   }

    public void setLive(int live) {
        this.live = live;
    }

    public void setAtack(int atack) {
        this.atack = atack;
    }

    public void setItemsname(String itemsname) {
        this.itemsname = itemsname;
    }

    public void setItems1(int items1) {
        this.items1 = items1;
    }

    public void setItems2(int items2) {
        this.items2 = items2;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setCantitems(int cantitems) {
        this.cantitems = cantitems;
    }

    public int getLive() {
        return live;
    }

    public int getAtack() {
        return atack;
    }

    public String getItemsname() {
        return itemsname;
    }

    public int getItems1() {
        return items1;
    }

    public int getItems2() {
        return items2;
    }

    public String getName() {
        return name;
    }

    public String getMessage() {
        return message;
    }

    public int getCantitems() {
        return cantitems;
    }
    
    
}
