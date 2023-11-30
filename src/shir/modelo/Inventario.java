package shir.modelo;

import java.util.LinkedList;
import java.util.List;

public class Inventario {

    List<Prenda> prendaList = new LinkedList<>();

    public void addPrenda(Prenda prenda){
        prendaList.add(prenda);
    }

    public List<Prenda> getPrendaList() {
        return prendaList;
    }

    public double getPrendaList(double crenta){return crenta;}

    public void resPrenda(Prenda prenda){
        int indice = prendaList.indexOf(prenda);
        prendaList.remove(indice);
    }

}
