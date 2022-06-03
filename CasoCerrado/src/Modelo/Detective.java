
package Modelo;

public class Detective extends Persona{
   
    private byte xp;
    private String capasitadoTpCase;

    public Detective() {
        this.xp = 0;
        this.capasitadoTpCase = "";
    }
    
    public byte getXp() {
        return this.xp;
    }
    public void setXp(byte xp) {
        this.xp = xp;
    }
    public String getCapasitadoTpCase() {
        return capasitadoTpCase;
    }
    public void setCapasitadoTpCase(String capasitadoTpCase) {
        this.capasitadoTpCase = capasitadoTpCase;
    }    
}
