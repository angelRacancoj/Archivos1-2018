/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import java.awt.Color;
import javax.swing.JButton;

/**
 *
 * @author angel
 */
public class pixelConfig {

    int posX;
    int posY;
    JButton boton;

    public pixelConfig(int posX, int posY, JButton boton) {
        this.posX = posX;
        this.posY = posY;
        this.boton = boton;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public JButton getBoton() {
        return boton;
    }

    public void setBoton(JButton boton) {
        this.boton = boton;
    }

}
