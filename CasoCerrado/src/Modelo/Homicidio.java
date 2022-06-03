
package Modelo;

public class Homicidio extends Caso {
    
    private Detective segundoDetective;
    
    public Homicidio(){}
    
    public Detective getSegundoDetective() {
        return segundoDetective;
    }
    public void setSegundoDetective(Detective segundoDetective) {
        this.segundoDetective = segundoDetective;
    }
}
