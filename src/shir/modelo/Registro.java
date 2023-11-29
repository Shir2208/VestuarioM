package shir.modelo;

import java.util.LinkedList;
import java.util.List;

public class Registro {

    List<Cliente> clienteList = new LinkedList<>();

    public void addCliente(Cliente cliente){
        clienteList.add(cliente);
    }

    public List<Cliente> getPrendaList() {
        return clienteList;
    }

    public void resCliente(Cliente cliente){
        int indice = clienteList.indexOf(cliente);
        clienteList.remove(indice);
    }
}
