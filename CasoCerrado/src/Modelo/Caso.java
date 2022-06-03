
package Modelo;

public abstract class Caso {
    private int numCaso;
    private String descripCase,codigoPrioridad,nombreClave;
    private Detective detective;
    private Sospechoso[] sospechosos;
    private Bitacora bitacora;
    
    public Caso() {
        this.numCaso = 0;
        this.descripCase = "";
        this.codigoPrioridad = "";
        this.nombreClave = "";
    }

    public int getNumCaso() {return this.numCaso;}
    public String getDescripCase(){return this.descripCase;}
    public String getCodigoPrioridad() {return this.codigoPrioridad;}
    public Detective getDetective() {return this.detective;}
    public String getNombreClave() {return nombreClave;}
    public Sospechoso getSospechoso(int num) {return this.sospechosos[num];}
    public Bitacora getBitacora() {return bitacora;}
    
    public void setNumCaso(int numCaso){this.numCaso = numCaso;}
    public void setDescripCase(String descripCase) {this.descripCase = descripCase;}
    public void setCodigoPrioridad(String codigoPrioridad) {this.codigoPrioridad = codigoPrioridad;}
    public void setNombreClave(String nombreClave) {this.nombreClave = nombreClave;}
    public void setDetective(Detective detective) {this.detective = detective;}
    public void setSospechoso(Sospechoso sospechoso,int num) {this.sospechosos[num] = sospechoso;}
    public void setBitacora(Bitacora bitacora) {this.bitacora = bitacora;}
}
