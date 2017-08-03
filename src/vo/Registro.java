/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vo;

/**
 *
 * @author Labing I5
 */
public class Registro {
    private int campo1;
    private int campo2;
    private char campo3;

    public Registro(int campo1, int campo2, char campo3) {
        this.campo1 = campo1;
        this.campo2 = campo2;
        this.campo3 = campo3;
    }

    public Registro() {
            }

    
    public int getCampo1() {
        return campo1;
    }

    public void setCampo1(int campo1) {
        this.campo1 = campo1;
    }

    public int getCampo2() {
        return campo2;
    }

    public void setCampo2(int campo2) {
        this.campo2 = campo2;
    }

    public char getCampo3() {
        return campo3;
    }

    public void setCampo3(char campo3) {
        this.campo3 = campo3;
    }
    
    
    
}
