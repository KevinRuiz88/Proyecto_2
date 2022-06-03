 
package Modelo;

public class Bitacora {
    
    private String fecha[];
    private String nuevasNovedades[];
    
    public Bitacora(){
        this.fecha = new String[30];
        this.nuevasNovedades = new String[30];
    }

    public String getFecha(int num) {
        return fecha[num];
    }

    public void setFecha(String fecha,int num) {
        this.fecha[num] = fecha;
    }

    public String getNuevaNovedad(int num) {
        return nuevasNovedades[num];
    }

    public void setNuevaNovedad(String nuevaNovedad,int num) {
        this.nuevasNovedades[num] = nuevaNovedad;
    } 
}
