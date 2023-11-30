package shir.acciones;

import shir.modelo.Prenda;
import shir.prenda.TPrenda;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LlenarInventario {
    Scanner sc = new Scanner(System.in);
    List<Prenda> inList = new LinkedList<>();
    private Prenda prenda;

    public LlenarInventario(){

        System.out.println("¿Cuántas prendas va a registrar?");
        int c = sc.nextInt();

        for (int i = 0; i < c; i++){
            System.out.println("¿Cuál es el tipo de prenda a registrar?");
             //prenda = sc.
        }
        //Prenda prenda = new Prenda(TPrenda.PANTALON);
    }
}
