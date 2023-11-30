

import shir.modelo.Inventario;
import shir.modelo.Prenda;

public class Main {
    Inventario inventario;
    Prenda prenda;
    public void main(String[] args) {

        for (Prenda p: inventario.getPrendaList()) {
            System.out.println(p);
        }
        System.out.println(inventario.getPrendaList(prenda.getCrenta()));


    }
}