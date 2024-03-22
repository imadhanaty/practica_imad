package modelos;


import java.util.*;

/**
 * 
 */
public class Rectangulo {
	 public int Base;
	 public int Altura;

	 public Rectangulo() {
	       
	    }

    /**
     * 
     */
    

    /**
     * 
     */
   

    /**
     * 
     */
   
    /**
     * 
     */
    public void rectangulo() {
        // TODO implement here
    }

    /**
     * @param base 
     * @param altura
     */
    public  Rectangulo(int base, int altura) {
        this.Base=base;
        this.Altura=altura;
    }

    /**
     * 
     */
    public int getBase() {
        return Base;
    }

    /**
     * 
     */
    public int getAltura() {
        return Altura;
    }

    /**
     * 
     */
    public void setBase(int base) {
        this.Base=base;
    }

    /**
     * 
     */
    public void setAltura(int altura) {
        this.Altura=altura;
    }

    /**
     * 
     */

    /**
     * 
     */
    public int area_calculation( ) {
       return Base*Altura;
    }

    /**
     * 
     */
    public int perimetro_calculation() {
        return 2*(Base+Altura);
    }

    /**
     * 
     */
    @Override
    public String toString() {
        return "rectangulo base= "+Base+" altura= "+Altura;
    }

}