
package Modelo;

public class Sospechoso extends Persona{
    
    private String alias,descrpfisica;
    private Direccion direccion;
    private byte edad;
    
    public Sospechoso() {
        this.alias = "";
        this.edad = 0;
        this.descrpfisica = "";
    }

    
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public String getDescrpfisica() {
        return descrpfisica;
    }

    public void setDescrpfisica(String descrpfisica) {
        this.descrpfisica = descrpfisica;
    }
    
    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
}
