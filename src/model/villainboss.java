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
public class villainboss extends Villain{
    private String Namextraesp;
    private int extraesp;
    public villainboss(int live, int atack, String name, String NamespH, int espH, String Namextraesp, int extraesp) {
        super(live, atack, name, NamespH, espH);
        this.Namextraesp = Namextraesp;
        this.extraesp = extraesp;
                
    }

    public void setExtraesp(int extraesp) {
        this.extraesp = extraesp;
    }

    public int getExtraesp() {
        return extraesp;
    }

    public void setNamextraesp(String Namextraesp) {
        this.Namextraesp = Namextraesp;
    }

    public String getNamextraesp() {
        return Namextraesp;
    }
    
}
