package ar.unju.edu.edm.model;

import org.springframework.stereotype.Component;

@Component
public class SecuenciaNum4 {
  private int numero;
  private String aux;
  public void setNumero(int numero) {
    this.numero = numero;
  }
  public int getNumero() {
    return numero;
  }
  public String secuencia4(){
    String resultadoS4="";
    while(numero>=160){
      aux=String.valueOf(numero);
      resultadoS4= resultadoS4 + " " + aux;
      numero=numero-20;
    }
    return resultadoS4;
  }
}
