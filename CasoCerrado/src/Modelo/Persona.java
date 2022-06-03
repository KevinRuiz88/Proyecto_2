
package Modelo;

public class Persona {
    private String identificacion,primerNombre,segundoNombre;
    private String primerApelllido,segundoApellido;
    
    public Persona(){
        this.identificacion = "";
        this.primerNombre = "";
        this.segundoNombre = "";
        this.primerApelllido = "";
        this.segundoApellido = "";
    }
    
    public String getIdentificacion(){
        return this.identificacion;
    }
    public void setIdentificacion(String identificacion){
        this.identificacion=identificacion;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }
    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }
    public void setSegundoNombre(String SegundoNombre) {
        this.segundoNombre = SegundoNombre;
    }

    public String getPrimerApelllido() {
        return primerApelllido;
    }
    public void setPrimerApelllido(String primerApelllido) {
        this.primerApelllido = primerApelllido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }   
    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }
}
