package modelos;


import java.util.*;

/**
 * 
 */
public class circulo {
	public double radio;

    /**
     * Default constructor
     */
	public circulo (double radio) {
        this.radio = radio;
    }
    /**
     * 
     */
    

    /**
     * @return 
     * 
     */
    public double getRadio() {
    	 return radio;
    }

    /**
     * 
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }

    /**
     * @return 
     * 
     */
    public double area() {
    	return Math.PI * radio * radio;
    }

    /**
     * 
     */
    public double obtenerPerimetro() {
        return 2 * Math.PI * radio;
    }

    /**
     * 
     */
    @Override
    public String toString() {
        return "Circulo radio=" + radio  ;
    }
}