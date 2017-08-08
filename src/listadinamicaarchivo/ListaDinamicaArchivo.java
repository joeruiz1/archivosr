/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadinamicaarchivo;

import dao.DB;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Labing I5
 */
public class ListaDinamicaArchivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            DB db = new DB();
//           db.escribirArchivo();
          db.crear(1,2,'e');
        } catch (IOException ex) {
            Logger.getLogger(ListaDinamicaArchivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
