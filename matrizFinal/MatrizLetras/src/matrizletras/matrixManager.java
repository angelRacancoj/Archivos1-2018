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
import objectsML.letra;

/**
 *
 * @author angel
 */
public class matrixManager {

    LinkedList<LinkedList<MLButton>> buttonList = new LinkedList<>();
    Color baseColor;
    Color letrasColor;
    int cantLetras;
    letra letras = new letra();

    public matrixManager(Color baseColor, Color letrasColor, int cantLetras) throws InputsVaciosException {
        this.baseColor = baseColor;
        this.letrasColor = letrasColor;
        this.cantLetras = cantLetras;
        createMatrix();
    }

    private void createMatrix() throws InputsVaciosException {
        try {
            for (int y = 0; y < letras.matrixSize; y++) {
                LinkedList<MLButton> auxList = new LinkedList<>();
                for (int x = 0; x < letras.matrixSize * cantLetras; x++) {
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

    /**
     *
     * @param x
     * @param y
     * @param color
     */
    public void setPixelColor(int x, int y, Color color) {
        buttonList.get(y).get(x).getBoton().setBackground(color);
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

    private void setLetterColorPosicion(int[][] letra, int posicion) {
        for (int y = 0; y < letras.matrixSize; y++) {
            for (int x = 0; x < letras.matrixSize; x++) {
                if (letra[y][x] == 1) {
                    buttonList.get(y).get(posicion * letras.matrixSize + x).getBoton().setBackground(letrasColor);
                } else {
                    buttonList.get(y).get(posicion * letras.matrixSize + x).getBoton().setBackground(baseColor);
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

    public void SetTextInPanel(String textIn) throws InputsVaciosException {
        if (textIn.length() <= cantLetras) {
            if (!textIn.replaceAll(" ", "").replaceAll("\t", "").isEmpty()) {
                for (int i = 0; i < textIn.length(); i++) {
                    setLetteColorPosicion(textIn.charAt(i), i);
                }
            } else if (textIn.equals("") || textIn.equals(" ") || textIn.equals("\"")) {
                resetLetterAndColor();
            }
        } else {
            throw new InputsVaciosException("Cantidad de letras excedida");
        }

    }

    public void setLetteColorPosicion(char letterIn, int poscion) throws InputsVaciosException {
        if (letterIn != ' ') {
            char letra = letterIn;
            switch (letra) {
                case 'A':
                case 'a':
                    setLetterColorPosicion(letras.IMG_A, poscion);
                    break;
                case 'B':
                case 'b':
                    setLetterColorPosicion(letras.IMG_B, poscion);
                    break;
                case 'C':
                case 'c':
                    setLetterColorPosicion(letras.IMG_C, poscion);
                    break;
                case 'D':
                case 'd':
                    setLetterColorPosicion(letras.IMG_D, poscion);
                    break;
                case 'E':
                case 'e':
                    setLetterColorPosicion(letras.IMG_E, poscion);
                    break;
                case 'F':
                case 'f':
                    setLetterColorPosicion(letras.IMG_F, poscion);
                    break;
                case 'G':
                case 'g':
                    setLetterColorPosicion(letras.IMG_G, poscion);
                    break;
                case 'H':
                case 'h':
                    setLetterColorPosicion(letras.IMG_H, poscion);
                    break;
                case 'I':
                case 'i':
                    setLetterColorPosicion(letras.IMG_I, poscion);
                    break;
                case 'J':
                case 'j':
                    setLetterColorPosicion(letras.IMG_J, poscion);
                    break;
                case 'K':
                case 'k':
                    setLetterColorPosicion(letras.IMG_K, poscion);
                    break;
                case 'L':
                case 'l':
                    setLetterColorPosicion(letras.IMG_L, poscion);
                    break;
                case 'M':
                case 'm':
                    setLetterColorPosicion(letras.IMG_M, poscion);
                    break;
                case 'N':
                case 'n':
                    setLetterColorPosicion(letras.IMG_N, poscion);
                    break;
                case 'O':
                case 'o':
                    setLetterColorPosicion(letras.IMG_O, poscion);
                    break;
                case 'P':
                case 'p':
                    setLetterColorPosicion(letras.IMG_P, poscion);
                    break;
                case 'Q':
                case 'q':
                    setLetterColorPosicion(letras.IMG_Q, poscion);
                    break;
                case 'R':
                case 'r':
                    setLetterColorPosicion(letras.IMG_R, poscion);
                    break;
                case 'S':
                case 's':
                    setLetterColorPosicion(letras.IMG_S, poscion);
                    break;
                case 'T':
                case 't':
                    setLetterColorPosicion(letras.IMG_T, poscion);
                    break;
                case 'U':
                case 'u':
                    setLetterColorPosicion(letras.IMG_U, poscion);
                    break;
                case 'V':
                case 'v':
                    setLetterColorPosicion(letras.IMG_V, poscion);
                    break;
                case 'W':
                case 'w':
                    setLetterColorPosicion(letras.IMG_W, poscion);
                    break;
                case 'X':
                case 'x':
                    setLetterColorPosicion(letras.IMG_X, poscion);
                    break;
                case 'Y':
                case 'y':
                    setLetterColorPosicion(letras.IMG_Y, poscion);
                    break;
                case 'Z':
                case 'z':
                    setLetterColorPosicion(letras.IMG_Z, poscion);
                    break;
                case '0':
                    setLetterColorPosicion(letras.IMG_0, poscion);
                    break;
                case '1':
                    setLetterColorPosicion(letras.IMG_1, poscion);
                    break;
                case '2':
                    setLetterColorPosicion(letras.IMG_2, poscion);
                    break;
                case '3':
                    setLetterColorPosicion(letras.IMG_3, poscion);
                    break;
                case '4':
                    setLetterColorPosicion(letras.IMG_4, poscion);
                    break;
                case '5':
                    setLetterColorPosicion(letras.IMG_5, poscion);
                    break;
                case '6':
                    setLetterColorPosicion(letras.IMG_6, poscion);
                    break;
                case '7':
                    setLetterColorPosicion(letras.IMG_7, poscion);
                    break;
                case '8':
                    setLetterColorPosicion(letras.IMG_8, poscion);
                    break;
                case '9':
                    setLetterColorPosicion(letras.IMG_9, poscion);
                    break;
                case ' ':
                case '\t':
                    setLetterColorPosicion(letras.IMG_NONE, poscion);
                default:
                    throw new InputsVaciosException("Simbolo invalido");
            }

        } else if (letterIn == ' ') {
            resetLetterAndColor();
        } else {
            throw new InputsVaciosException("Cantidad de letras excedida");
        }
    }

    /**
     * Return the pixels to the original color
     */
    public void resetLetterAndColor() {
        for (int y = 0; y < buttonList.size(); y++) {
            for (int x = 0; x < buttonList.get(y).size(); x++) {
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
