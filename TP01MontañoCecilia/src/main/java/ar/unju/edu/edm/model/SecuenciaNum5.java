package ar.unju.edu.edm.model;

import org.springframework.stereotype.Component;

@Component
public class SecuenciaNum5 {
  private int numero;
  private String aux;
  public void setNumero(int numero) {
    this.numero = numero;
  }
  public int getNumero() {
    return numero;
  }
  public String secuencia5(){
    String resultadoS5="";
    do{
      aux=String.valueOf(numero);
      resultadoS5= resultadoS5 + " " + aux;
      numero=numero-20;
    }while(numero>=160);
    return resultadoS5;
  }
}
