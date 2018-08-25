/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrizletras;

import GUI.principalFrame;
import exceptionsML.InputsVaciosException;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author angel
 */
public class matrixLetters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            principalFrame principal = new principalFrame(Color.BLACK, Color.CYAN);
            principal.setVisible(true);
        } catch (InputsVaciosException e) {
            System.out.println("Error: " + e);
        }
    }

}
