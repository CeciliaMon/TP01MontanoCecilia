package ar.unju.edu.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Par_Impar {
	private int numero;
	public String esPar_Impar(){
	    String resultadoP_I;
	    if(this.numero%2==0){
	      resultadoP_I="es par";
	    }else{
	      resultadoP_I="es impar";
	    }
	    return resultadoP_I;
	  }

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	

}
