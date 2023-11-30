package shir.acciones;

import shir.modelo.Inventario;
import shir.modelo.Prenda;

public class Renta {
    private Inventario inventario;
    private Prenda prenda;
    public Renta(){
        for (Prenda p: inventario.getPrendaList()) {
            System.out.println(p);
            System.out.println(inventario.getPrendaList(prenda.getCrenta()));
        }
    }
}
