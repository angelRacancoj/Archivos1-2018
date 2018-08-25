/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectsML;

import javax.swing.JButton;

/**
 *
 * @author angel
 */
public class MLButton {

    JButton boton;
    int xPos;
    int yPos;

    public MLButton(JButton boton, int xPos, int yPos) {
        this.boton = boton;
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public JButton getBoton() {
        return boton;
    }

    public void setBoton(JButton boton) {
        this.boton = boton;
    }

    public int getxPos() {
        return xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

}
