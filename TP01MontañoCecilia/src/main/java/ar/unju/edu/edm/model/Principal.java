package ar.unju.edu.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Principal{
	//atributos
	private Integer numero1;
	//Constructores
	public Principal() {
		// TODO Auto-generated constructor stub
	}
		public Integer getNumero1() {
		return numero1;
	}


	public void setNumero1(Integer numero1) {
		this.numero1 = numero1;
	}
	
	public Principal(Integer numero1) {
		super();
		this.numero1 = numero1;
	}
	//otro metodo
	public int resolverFactorial () {
		int num=1;
		if (numero1< 0) {
			System.out.println("No se puede resolver el factorial, ingrese otro numero");
		}
		else {
			for (int i=1; i==numero1; i++) {
				num*=1;
			}
		}
		return num;
	}



}


