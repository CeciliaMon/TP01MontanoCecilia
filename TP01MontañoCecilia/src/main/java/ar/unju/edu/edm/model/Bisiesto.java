package ar.unju.edu.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Bisiesto {
	private int anio;
	public Bisiesto() {
		// TODO Auto-generated constructor stub
	}
	public Bisiesto(int anio) {
		super();
		this.anio = anio;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	public String CalcularBisiesto() {
		String bis="";
		 if(((anio%4==0) || (anio%400==0)) && (anio%100!=0)) {
			bis="Es un anio bisiesto";
		}
		else {
			bis="No es un anio bisiesto";
		}
			return bis;
		}
	}
