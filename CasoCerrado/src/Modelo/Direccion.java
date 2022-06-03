
package Modelo;

public class Direccion {
    
    private String numVivienda,localidad,ciudad;
    private String departamento,pais;

    public Direccion(){
        this.numVivienda = "";
        this.localidad = "";
        this.ciudad = "";
        this.departamento = "";
        this.pais = "";
    }

    public String getNumVivienda() {
        return numVivienda;
    }

    public void setNumVivienda(String numVivienda) {
        this.numVivienda = numVivienda;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
