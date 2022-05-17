package ar.unju.edu.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Mes {
	private int numero;
	  public void setNumero(int numero) {
	    this.numero = numero;
	  }
	  public int getNumero() {
	    return numero;
	  }
	  public String Me(){
	    String aux;
	    if(numero==1){
	      aux="Enero";
	    }else{
	      if(numero==2){
	        aux="Febrero";
	      }else{
	        if(numero==3){
	          aux="Marzo";
	        }else{
	          if(numero==4){
	            aux="Abril";
	          }else{
	            if(numero==5){
	              aux="Mayo";
	            }else{
	              if(numero==6){
	                aux="Junio";
	              }else{
	                if(numero==7){
	                  aux="Julio";
	                }else{
	                  if(numero==8){
	                    aux="Agosto";
	                  }else{
	                    if(numero==9){
	                      aux="Septiembre";
	                    }else{
	                      if(numero==10){
	                        aux="Octubre";
	                      }else{
	                        if(numero==11){
	                          aux="Noviembre";
	                        }else{
	                          if(numero==12){
	                            aux="Diciembre";
	                          }else{
	                            aux="No existe ese mes";
	                          }
	                        }
	                      }
	                    }
	                  }
	                }
	              }
	            }
	          }
	        }
	      }
	    }
	    return aux;
	  }
}
