package ar.unju.edu.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Tiempo {
  private int numero;
  private double aux,g=9.81;
  private String resultadoT;
  public void setNumero(int numero) {
    this.numero = numero;
  }
  public int getNumero() {
    return numero;
  }
  public String formula(){
    aux=(Math.sqrt((2*numero)/g));
    resultadoT = String.valueOf(aux);
    return resultadoT;
  }
}
