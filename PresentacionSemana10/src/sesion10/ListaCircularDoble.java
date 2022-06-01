/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion10;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jhair
 */
public class ListaCircularDoble {

    private Nodo inicio, fin;

    /**
     *
     * @return
     */
    public boolean estaVacia() {
        return inicio == null;
    }

    /**
     *
     * @param persona
     */
    public void agregarAlInicio(Persona persona) {
        Nodo nuevo = new Nodo(persona);

        if (estaVacia()) {
            inicio = fin = nuevo;
            nuevo.setSiguiente(nuevo);
            nuevo.setAnterior(nuevo);
        } else {
            nuevo.setSiguiente(inicio);
            inicio.setAnterior(nuevo);
            inicio = nuevo;
            fin.setSiguiente(inicio);
            inicio.setAnterior(fin);
        }
    }

    /**
     *
     * @param persona
     */
    public void agregarAlFinal(Persona persona) {
        Nodo nuevo = new Nodo(persona);

        if (estaVacia()) {
            inicio = fin = nuevo;
            nuevo.setSiguiente(nuevo);
            nuevo.setAnterior(nuevo);
        } else {
            fin.setSiguiente(nuevo);
            nuevo.setAnterior(fin);
            fin = nuevo;
            //Se nota que es lista doble
            fin.setSiguiente(inicio);
            inicio.setAnterior(fin);
        }
    }

    /**
     *
     * @return
     */
    public String ordenar() {
        Nodo actual = inicio, posterior;
        byte auxiliar;
        if (estaVacia()) {
            return "La lista circular está vacía";
        } else {
            while (actual.getSiguiente() != inicio) {
                posterior = actual.getSiguiente();
                while (posterior != inicio) {
                    if (actual.getPersona().getEdad() > posterior.getPersona().getEdad()) {
                        auxiliar = actual.getPersona().getEdad();
                        actual.getPersona().setEdad(posterior.getPersona().getEdad());
                        posterior.getPersona().setEdad(auxiliar);
                    }
                    posterior = posterior.getSiguiente();
                }
                actual = actual.getSiguiente();
            }
            return "La lista circular está ordenada";
        }
    }

    /**
     *
     * @param DNI
     * @return
     */
    public boolean buscar(int DNI) {
        Nodo temp = inicio;
        boolean encontrado = false;

        do {
            if (temp.getPersona().getDNI() == DNI) {
                encontrado = true;
            }
            temp = temp.getSiguiente();
        } while (temp != inicio);

        return encontrado;
    }

    /**
     *
     * @param modelo
     * @param filas
     */
    public void vaciarTabla(DefaultTableModel modelo, int filas) {
        for (int i = 0; i < filas; i++) {
            modelo.removeRow(0);
        }
    }

    public void mostrarListaTabla(DefaultTableModel modelo) {
        String nombre, apellidoPaterno, apellidoMaterno, estadoCivil, sexo, altura, DNI, edad, cantidadDeHijos;

        Nodo temp;

        if (!estaVacia()) {
            temp = inicio;

            do {

                nombre = temp.getPersona().getNombre();
                apellidoPaterno = temp.getPersona().getApellidoPaterno();
                apellidoMaterno = temp.getPersona().getApellidoMaterno();
                estadoCivil = temp.getPersona().getEstadoCivil();
                sexo = temp.getPersona().getSexo();
                altura = String.valueOf(temp.getPersona().getAltura());
                DNI = String.valueOf(temp.getPersona().getDNI());
                edad = String.valueOf(temp.getPersona().getEdad());
                cantidadDeHijos = String.valueOf(temp.getPersona().getCantidadDeHijos());
                Object[] fila = {nombre, apellidoPaterno, apellidoMaterno, estadoCivil, sexo, altura, DNI, edad, cantidadDeHijos};
                modelo.addRow(fila);

                temp = temp.getSiguiente();

            } while (temp != inicio);
        }

    }

}
