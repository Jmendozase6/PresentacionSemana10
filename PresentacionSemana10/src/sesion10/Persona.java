package sesion10;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author jhair
 */
public class Persona {

    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String estadoCivil;
    private String sexo;
    private String fechaNacimiento;
    private double altura;
    private byte id;
    private int DNI;
    private byte edad;
    private byte cantidadDeHijos;

    public Persona(byte id, String nombre, String apellidoPaterno, String apellidoMaterno, String estadoCivil, String sexo, String fechaNacimiento, double altura, int DNI, byte edad, byte cantidadDeHijos) {
        this.id = id;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.estadoCivil = estadoCivil;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
        this.altura = altura;
        this.DNI = DNI;
        this.edad = edad;
        this.cantidadDeHijos = cantidadDeHijos;
    }

    public byte getId() {
        return id;
    }

    public void setId(byte id) {
        this.id = id;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public byte getCantidadDeHijos() {
        return cantidadDeHijos;
    }

    public void setCantidadDeHijos(byte cantidadDeHijos) {
        this.cantidadDeHijos = cantidadDeHijos;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append("id=").append(id);
        sb.append("nombre=").append(nombre);
        sb.append(", apellidoPaterno=").append(apellidoPaterno);
        sb.append(", apellidoMaterno=").append(apellidoMaterno);
        sb.append(", estadoCivil=").append(estadoCivil);
        sb.append(", sexo=").append(sexo);
        sb.append(", altura=").append(altura);
        sb.append(", DNI=").append(DNI);
        sb.append(", edad=").append(edad);
        sb.append(", cantidadDeHijos=").append(cantidadDeHijos);
        sb.append('}');
        return sb.toString();
    }

}
