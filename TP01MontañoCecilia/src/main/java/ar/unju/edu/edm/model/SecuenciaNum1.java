package ar.unju.edu.edm.model;

import org.springframework.stereotype.Component;

@Component
public class SecuenciaNum1 {
  private int numero,auxiliar=37;
  public void setNumero(int numero) {
    this.numero = numero;
  }
  public int getNumero() {
    return numero;
  }
  public String secuencia(){
    String resultadoS="",auxiliar1;
    int i=2;
     for(int j=40;j>0;j--){
      auxiliar1=String.valueOf(numero);
      resultadoS=resultadoS + " " + auxiliar1;
      if(auxiliar==0){
        numero=numero-auxiliar;
        auxiliar=auxiliar+i;
      }else{
        numero=numero+auxiliar;
        auxiliar=auxiliar-i;
      }
      
    }
    return resultadoS;
  }
}
