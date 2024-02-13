package org.iesalandalus.programacion.tallermecanico.modelo.negocio;

import org.iesalandalus.programacion.tallermecanico.modelo.dominio.Cliente;

import java.util.ArrayList;
import java.util.List;

public class Clientes {
    private final List<Cliente> ListaClientes;
    public Clientes(List<Cliente> listaClientes) {
        ListaClientes = new ArrayList<>();
    }

    public List<Cliente> get() {
        return new ArrayList<>(ListaClientes);
    }

    public void insertar(Cliente cliente) {

    }
}
