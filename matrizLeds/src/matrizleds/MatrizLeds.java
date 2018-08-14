/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrizleds;

import java.awt.Color;
import java.util.LinkedList;

/**
 *
 * @author angel
 */
public class MatrizLeds {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        LinkedList<Color> colores = new LinkedList<>();
        colores.add(Color.BLACK);
        colores.add(Color.YELLOW);
        colores.add(Color.GREEN);
        colores.add(Color.RED);
        colores.add(Color.WHITE);

        MatrizLED matriz = new MatrizLED(10, colores, Color.LIGHT_GRAY);

        matriz.setVisible(true);
    }

}
