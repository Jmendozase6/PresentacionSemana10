package sesion10;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author jhair
 */
public class Nodo {

    private Persona persona;
    private Nodo anterior;
    private Nodo siguiente;

    public Nodo(Persona persona) {
        this(persona, null, null);
    }

    public Nodo(Persona persona, Nodo anterior, Nodo siguiente) {
        this.persona = persona;
        this.anterior = anterior;
        this.siguiente = siguiente;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

}
