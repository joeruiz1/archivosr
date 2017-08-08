/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import vo.Registro;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

/**
 *
 * @author Labing I5
 */
public class DB {

    private ArrayList<Registro> registros;

    public DB() {
        this.registros = new ArrayList<>();
        this.registros.add(new Registro(1, 2, 'A'));
        this.registros.add(new Registro(4, 5, 'B'));
        this.registros.add(new Registro(6, 7, 'C'));
    }

    public void escribirArchivo() throws FileNotFoundException, IOException {
        RandomAccessFile archivo
                = new RandomAccessFile("test.txt", "rw");

        long tamanio = archivo.length();
        System.out.println("Tamano actual" + tamanio);
        archivo.seek(tamanio);

        for (Registro registro : registros) {
            archivo.writeInt(registro.getCampo1());
            System.out.println(archivo.getFilePointer()); //Byte actual
            archivo.writeInt(registro.getCampo2());
            System.out.println(archivo.getFilePointer()); //Byte actual
            archivo.writeChar(registro.getCampo3());
            System.out.println(archivo.getFilePointer()); //Byte actual
        }
        tamanio = archivo.length();
        System.out.println("Tamano " + tamanio);
        System.out.println("Consultando Caracteres");

        archivo.seek(8);
        System.out.println(archivo.readChar());
        archivo.seek(18);
        System.out.println(archivo.readChar());
        archivo.skipBytes(4);
        System.out.println(archivo.readInt());

    }

    public ArrayList<Registro> crear(int uno, int dos, char s) throws FileNotFoundException, IOException {

        RandomAccessFile archivo = new RandomAccessFile("test.txt", "rw");

        ArrayList<Registro> l=null;
        Registro r = new Registro();
        if (r == null) {
            ArrayList<Registro> x= new ArrayList<>();

            uno = r.getCampo1();
            dos = r.getCampo2();
            s = r.getCampo3();
            x.add(r);
        }
        if (r != null) {
             l= new ArrayList<>();

            uno = r.getCampo1();
            dos = r.getCampo2();
            s = r.getCampo3();
            l.add(r);
            
            for (int i = 0; i <l.size(); i++) {
            System.out.println("la primera creacion es " +l.get(i));
    
            }
            
        }
        return l;
    }
    
    
    public void listar(){
        
    }
    
    

}
