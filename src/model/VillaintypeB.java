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
public class VillaintypeB extends Villain {
    private int shield;
    public VillaintypeB(int live, int atack, String name, String NamespH, int espH, int shield) {
        super(live, atack, name, NamespH, espH);
        this.shield = shield;
    }
    
}
