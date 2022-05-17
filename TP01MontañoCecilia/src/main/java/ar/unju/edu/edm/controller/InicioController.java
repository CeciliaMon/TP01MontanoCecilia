package ar.unju.edu.edm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ar.unju.edu.edm.model.Bisiesto;
import ar.unju.edu.edm.model.EvaluarValor;
import ar.unju.edu.edm.model.Mes;
import ar.unju.edu.edm.model.Mes2;
import ar.unju.edu.edm.model.Par_Impar;
import ar.unju.edu.edm.model.Principal;
import ar.unju.edu.edm.model.SecuenciaNum1;
import ar.unju.edu.edm.model.SecuenciaNum2;
import ar.unju.edu.edm.model.SecuenciaNum3;
import ar.unju.edu.edm.model.SecuenciaNum4;
import ar.unju.edu.edm.model.SecuenciaNum5;
import ar.unju.edu.edm.model.Tiempo;

@Controller
public class InicioController {
@GetMapping ({"/menu"})
public String mostrarMenu() {
	return "menu";
}
	@GetMapping ("/Principal")
	public String getFactorial(@RequestParam(name="numero1")int numero1,Model model) {
	int resultadoF;
	Principal nuevoPrincipal=new Principal();
	nuevoPrincipal.setNumero1(numero1);
	resultadoF=nuevoPrincipal.resolverFactorial();
	model.addAttribute("resultadoF", resultadoF);

	return "Punto1";
}
	@GetMapping ("/Bisciesto")
	public String getBcsiestoPage(@RequestParam(name="num1")int num1, Model model) {
	String resultadoB;
	Bisiesto bisi=new Bisiesto();
	bisi.setAnio(num1);
	resultadoB=bisi.CalcularBisiesto();
	model.addAttribute("resultadoB", resultadoB);
	return "Punto2";
}
	 @GetMapping("/ParImpar")
	  public String getparPage(@RequestParam (name = "numero") int numero,Model model){
	    String[] Aux1= new String[5];
	    Par_Impar par_impar = new Par_Impar();
			for(int i=0;i<5;i++){
				par_impar.setNumero(numero);
				Aux1[i] = par_impar.esPar_Impar();
	      model.addAttribute("par_impar1", Aux1[0]);
	      model.addAttribute("par_impar2", Aux1[1]);
	      model.addAttribute("par_impar3", Aux1[2]);
	      model.addAttribute("par_impar4", Aux1[3]);
	      model.addAttribute("par_impar5", Aux1[4]);
				numero=numero+3;
			}
	    return "Punto3";
	  }
	 @GetMapping("/Mes")
	  public String getMesPage(@RequestParam (name = "numero") int numero,Model model){
	    String aux;
	    Mes mes = new Mes();
	    mes.setNumero(numero);
			aux = mes.Me();
	    model.addAttribute("mes", aux);
	    return "Punto4";
	  }

	  @GetMapping("/Mes2")
	  public String getmes2Page(@RequestParam (name = "numero") int numero,Model model){
	    String aux;
	    Mes2 mes2 = new Mes2();
	    mes2.setNumero(numero);
			aux = mes2.Mes2_numero();
	    model.addAttribute("mes2", aux);
	    return "Punto5";
	  }

	  @GetMapping("/EvaluarValor")
	  public String getnotaPage(@RequestParam (name = "numero") int numero,Model model){
	    String[] Aux1= new String[8];
	    EvaluarValor valor = new EvaluarValor();
			for(int i=0;i<8;i++){
				valor.setNum(numero);
				Aux1[i] = valor.nota();
	      model.addAttribute("valor1", Aux1[0]);
	      model.addAttribute("valor2", Aux1[1]);
	      model.addAttribute("valor3", Aux1[2]);
	      model.addAttribute("valor4", Aux1[3]);
	      model.addAttribute("valor5", Aux1[4]);
	      model.addAttribute("valor6", Aux1[5]);
	      model.addAttribute("valor7", Aux1[6]);
	      model.addAttribute("valor8", Aux1[7]);
				numero--;
			}
	    return "Punto6";
	  }

	  @GetMapping("/Secuencianum1")
	  public String getSecuenciaPage(@RequestParam (name = "numero") int numero,Model model){
	    String Aux;
	    SecuenciaNum1 secu = new SecuenciaNum1();
	    secu.setNumero(numero);
	    Aux = secu.secuencia();
	    model.addAttribute("secuencia", Aux);
	    return "Punto7";
	  }

	  @GetMapping("/Secuencianum2")
	  public String getsecu2Page(@RequestParam (name = "numero") int numero,Model model){
	    String Aux;
	    SecuenciaNum2 secu2 = new SecuenciaNum2();
	    secu2.setNumero(numero);
	    Aux = secu2.secuencia2();
	    model.addAttribute("secuencia2", Aux);
	    return "Punto8";
	  }

	  @GetMapping("/Secuencianum3")
	  public String getsecu3Page(@RequestParam (name = "numero") int numero,Model model){
	    String Aux;
	    SecuenciaNum3 secu3 = new SecuenciaNum3();
	    secu3.setNumero(numero);
	    Aux = secu3.secuencia3();
	    model.addAttribute("secuencia3", Aux);
	    return "Punto9";
	  }

	  @GetMapping("/Secuencianum4")
	  public String getsecu4Page(@RequestParam (name = "numero") int numero,Model model){
	    String Aux;
	    SecuenciaNum4 secu4 = new SecuenciaNum4();
	    secu4.setNumero(numero);
	    Aux = secu4.secuencia4();
	    model.addAttribute("secuencia4", Aux);
	    return "Punto10";
	  }

	  @GetMapping("/Secuencianum5")
	  public String getsecu5Page(@RequestParam (name = "numero") int numero, Model model){
	    String Aux;
	    SecuenciaNum5 secu5 = new SecuenciaNum5();
	    secu5.setNumero(numero);
	    Aux = secu5.secuencia5();
	    model.addAttribute("secuencia5", Aux);
	    return "Punto11";
	  }

	  @GetMapping("/Tiempo")
	  public String gettiempoPage(@RequestParam (name = "numero") int numero,Model model){
	    String aux;
	    Tiempo time = new Tiempo();
	    time.setNumero(numero);
	    aux = time.formula();
	    model.addAttribute("tiempo", aux);
	    return "Punto12";
	  }
}
