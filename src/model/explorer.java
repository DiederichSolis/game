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
public class explorer extends hero{
    private int items3;
    private int items4;
    
    public explorer(int live, int atack, String itemsname, int items1, int items2, String name, String message, int catitems, int items3,int items4) {
        super(live, atack, itemsname, items1, items2, name, message, catitems);
    this.items3 = items3;
    this.items4= items4;
    
            }

    
    public void setItems3(int items3) {
        this.items3 = items3;
    }

    public void setItems4(int items4) {
        this.items4 = items4;
    }

    public int getItems3() {
        return items3;
    }

    public int getItems4() {
        return items4;
    }
    
}
