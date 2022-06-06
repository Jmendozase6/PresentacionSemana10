/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion10;

import javax.swing.JOptionPane;
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
            //Se nota que es lista doble
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
     * @param opcion
     * @return
     */
    public String ordenar(int opcion) {
        Nodo actual = inicio, posterior;
        Persona auxiliar;
        if (estaVacia()) {
            return "La lista circular está vacía";
        } else {
            while (actual.getSiguiente() != inicio) {
                posterior = actual.getSiguiente();

                while (posterior != inicio) {
                    switch (opcion) {
                        case 0 -> {
                            if (actual.getPersona().getEdad() > posterior.getPersona().getEdad()) {
                                auxiliar = actual.getPersona();
                                actual.setPersona(posterior.getPersona());
                                posterior.setPersona(auxiliar);
                            }
                        }
                        case 1 -> {
                            if (actual.getPersona().getDNI() > posterior.getPersona().getDNI()) {
                                auxiliar = actual.getPersona();
                                actual.setPersona(posterior.getPersona());
                                posterior.setPersona(auxiliar);
                            }
                        }
                        case 2 -> {
                            if (actual.getPersona().getId() > posterior.getPersona().getId()) {
                                auxiliar = actual.getPersona();
                                actual.setPersona(posterior.getPersona());
                                posterior.setPersona(auxiliar);
                            }
                        }
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
    public Nodo buscar(int DNI) {
        Nodo temp = inicio;
        Nodo retornar = null;

        do {
            if (temp.getPersona().getDNI() == DNI) {
                retornar = temp;
            }
            temp = temp.getSiguiente();
        } while (temp != inicio);

        return retornar;
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
        String id, nombre, apellidoPaterno, apellidoMaterno, estadoCivil, sexo, fechaNacimiento, altura, DNI, edad, cantidadDeHijos;

        Nodo temp;

        if (!estaVacia()) {
            temp = inicio;

            do {
                id = String.valueOf(temp.getPersona().getId());
                nombre = temp.getPersona().getNombre();
                apellidoPaterno = temp.getPersona().getApellidoPaterno();
                apellidoMaterno = temp.getPersona().getApellidoMaterno();
                estadoCivil = temp.getPersona().getEstadoCivil();
                sexo = temp.getPersona().getSexo();
                fechaNacimiento = temp.getPersona().getFechaNacimiento();
                altura = String.valueOf(temp.getPersona().getAltura());
                DNI = String.valueOf(temp.getPersona().getDNI());
                edad = String.valueOf(temp.getPersona().getEdad());
                cantidadDeHijos = String.valueOf(temp.getPersona().getCantidadDeHijos());
                Object[] fila = {id, nombre, apellidoPaterno, apellidoMaterno, estadoCivil, sexo, fechaNacimiento, altura, DNI, edad, cantidadDeHijos};
                modelo.addRow(fila);

                temp = temp.getSiguiente();

            } while (temp != inicio);
        }

    }

    public void eliminarAlInicio() {
        if (inicio == fin) {
            inicio = fin = null;
        } else {
            inicio = inicio.getSiguiente();
            inicio.setAnterior(fin);
            fin.setSiguiente(inicio);
        }
    }

    public void eliminarDelFinal() {
        if (inicio == fin) {
            inicio = fin = null;
        } else {
            fin = fin.getAnterior();
            fin.setSiguiente(inicio);
            inicio.setAnterior(fin);
        }
    }

    public void eliminarNodoEspecifico(byte id) {
        if (!estaVacia()) {
            Nodo actual = inicio, anterior = fin;
            do {
                if (actual.getPersona().getId() == id) {
                    if (actual == inicio) {
                        inicio = inicio.getSiguiente();
                        fin.setSiguiente(inicio);
                        inicio.setAnterior(fin);
                    } else if (actual == fin) {
                        fin = anterior;
                        inicio.setAnterior(fin);
                        fin.setSiguiente(inicio);
                    } else {
                        anterior.setSiguiente(actual.getSiguiente());
                        actual.getSiguiente().setAnterior(anterior);
                    }
                }
                anterior = actual;
                actual = actual.getSiguiente();
            } while (actual != inicio);
        } else {
            JOptionPane.showMessageDialog(null, "La lista ahora está vacía");
        }

    }

    public Nodo getInicio() {
        return inicio;
    }

    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }

    public Nodo getFin() {
        return fin;
    }

    public void setFin(Nodo fin) {
        this.fin = fin;
    }

}
