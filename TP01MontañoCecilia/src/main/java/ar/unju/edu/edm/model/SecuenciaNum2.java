package ar.unju.edu.edm.model;

import org.springframework.stereotype.Component;

@Component
public class SecuenciaNum2 {
  private int numero;
  private String aux;
  public void setNumero(int numero) {
    this.numero = numero;
  }
  public int getNumero() {
    return numero;
  }
  public String secuencia2(){
    String resultadoS2="";
    do {
      numero=numero+4;
      aux=String.valueOf(numero);
      resultadoS2= resultadoS2 + " " + aux;
    } while (numero<100);
    return resultadoS2;
  }
}
