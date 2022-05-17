package ar.unju.edu.edm.model;

import org.springframework.stereotype.Component;

@Component
public class SecuenciaNum3 {
  private int numero;
  private String aux;
  public void setNumero(int numero) {
    this.numero = numero;
  }
  public int getNumero() {
    return numero;
  }
  public String secuencia3(){
    String resultadoS3="";
    for(int i=20;numero>=160;numero=numero-i){
      aux=String.valueOf(numero);
      resultadoS3= resultadoS3 + " " + aux;
    }
    return resultadoS3;
  }
}
