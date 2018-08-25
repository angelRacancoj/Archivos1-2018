/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrizletras;

import exceptionsML.InputsVaciosException;
import java.awt.Color;
import java.util.LinkedList;
import javax.swing.JButton;
import objectsML.MLButton;
import objectsML.letras;

/**
 *
 * @author angel
 */
public class matrixManager {

    LinkedList<LinkedList<MLButton>> buttonList = new LinkedList<>();
    Color baseColor;
    Color letrasColor;
    letras letras = new letras();

    public matrixManager(Color baseColor, Color letrasColor) throws InputsVaciosException {
        this.baseColor = baseColor;
        this.letrasColor = letrasColor;
        createMatrix();
    }

    private void createMatrix() throws InputsVaciosException {
        try {
            for (int y = 0; y < letras.matrixSize; y++) {
                LinkedList<MLButton> auxList = new LinkedList<>();
                for (int x = 0; x < letras.matrixSize; x++) {
                    JButton auxButton = new JButton();
                    auxButton.setBackground(baseColor);
                    auxList.add(new MLButton(auxButton, x, y));
                }
                buttonList.add(auxList);
            }
        } catch (Exception e) {
            throw new InputsVaciosException("Error al crear la matriz\n" + e);
        }
    }

    private void setLetterAndColor(int[][] letra) {
        for (int y = 0; y < letras.matrixSize; y++) {
            for (int x = 0; x < letras.matrixSize; x++) {
                if (letra[y][x] == 1) {
                    buttonList.get(y).get(x).getBoton().setBackground(letrasColor);
                } else {
                    buttonList.get(y).get(x).getBoton().setBackground(baseColor);
                }
            }
        }
    }

    public void setLetterAndColor(String letterIn) throws InputsVaciosException {
        if (letterIn.length() == 1) {
            char letra = letterIn.charAt(0);
            switch (letra) {
                case 'A':
                case 'a':
                    setLetterAndColor(letras.IMG_A);
                    break;
                case 'B':
                case 'b':
                    setLetterAndColor(letras.IMG_B);
                    break;
                case 'C':
                case 'c':
                    setLetterAndColor(letras.IMG_C);
                    break;
                case 'D':
                case 'd':
                    setLetterAndColor(letras.IMG_D);
                    break;
                case 'E':
                case 'e':
                    setLetterAndColor(letras.IMG_E);
                    break;
                case 'F':
                case 'f':
                    setLetterAndColor(letras.IMG_F);
                    break;
                case 'G':
                case 'g':
                    setLetterAndColor(letras.IMG_G);
                    break;
                case 'H':
                case 'h':
                    setLetterAndColor(letras.IMG_H);
                    break;
                case 'I':
                case 'i':
                    setLetterAndColor(letras.IMG_I);
                    break;
                case 'J':
                case 'j':
                    setLetterAndColor(letras.IMG_J);
                    break;
                case 'K':
                case 'k':
                    setLetterAndColor(letras.IMG_K);
                    break;
                case 'L':
                case 'l':
                    setLetterAndColor(letras.IMG_L);
                    break;
                case 'M':
                case 'm':
                    setLetterAndColor(letras.IMG_M);
                    break;
                case 'N':
                case 'n':
                    setLetterAndColor(letras.IMG_N);
                    break;
                case 'O':
                case 'o':
                    setLetterAndColor(letras.IMG_O);
                    break;
                case 'P':
                case 'p':
                    setLetterAndColor(letras.IMG_P);
                    break;
                case 'Q':
                case 'q':
                    setLetterAndColor(letras.IMG_Q);
                    break;
                case 'R':
                case 'r':
                    setLetterAndColor(letras.IMG_R);
                    break;
                case 'S':
                case 's':
                    setLetterAndColor(letras.IMG_S);
                    break;
                case 'T':
                case 't':
                    setLetterAndColor(letras.IMG_T);
                    break;
                case 'U':
                case 'u':
                    setLetterAndColor(letras.IMG_U);
                    break;
                case 'V':
                case 'v':
                    setLetterAndColor(letras.IMG_V);
                    break;
                case 'W':
                case 'w':
                    setLetterAndColor(letras.IMG_W);
                    break;
                case 'X':
                case 'x':
                    setLetterAndColor(letras.IMG_X);
                    break;
                case 'Y':
                case 'y':
                    setLetterAndColor(letras.IMG_Y);
                    break;
                case 'Z':
                case 'z':
                    setLetterAndColor(letras.IMG_Z);
                    break;
                case '0':
                    setLetterAndColor(letras.IMG_0);
                    break;
                case '1':
                    setLetterAndColor(letras.IMG_1);
                    break;
                case '2':
                    setLetterAndColor(letras.IMG_2);
                    break;
                case '3':
                    setLetterAndColor(letras.IMG_3);
                    break;
                case '4':
                    setLetterAndColor(letras.IMG_4);
                    break;
                case '5':
                    setLetterAndColor(letras.IMG_5);
                    break;
                case '6':
                    setLetterAndColor(letras.IMG_6);
                    break;
                case '7':
                    setLetterAndColor(letras.IMG_7);
                    break;
                case '8':
                    setLetterAndColor(letras.IMG_8);
                    break;
                case '9':
                    setLetterAndColor(letras.IMG_9);
                    break;
                default:
                    throw new InputsVaciosException("Simbolo invalido");
            }

        } else if (letterIn.length() < 1) {
            resetLetterAndColor();
        } else {
            throw new InputsVaciosException("Cantidad de letras excedida");
        }
    }

    public void resetLetterAndColor() {
        for (int y = 0; y < letras.matrixSize; y++) {
            for (int x = 0; x < letras.matrixSize; x++) {
                buttonList.get(y).get(x).getBoton().setBackground(baseColor);
            }
        }
    }

    public LinkedList<LinkedList<MLButton>> getButtonList() {
        return buttonList;
    }

    public void setButtonList(LinkedList<LinkedList<MLButton>> buttonList) {
        this.buttonList = buttonList;
    }

}
