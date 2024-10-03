import java.util.HashMap;
import java.util.Scanner;

public class Codigo7 {
	public static void main(String[] args) {
		//Falta agregar el System.in dentro de los parentesis
		Scanner s = new Scanner(System.in);
		
		//falta acabar de nombrar el hasmap de capitales y el hasmap esta puesto como byte, doblue cuando deberia ser string por los datos que se estan agregando
	    HashMap<String, String> capitales = new HashMap<>();

	    capitales.put("Canadá", "Otawwa");
	    capitales.put("Estados Unidos", "Washington DC");
	    capitales.put("México", "México DF");
	    capitales.put("Belice", "Belmopán");
	    capitales.put("Costa rica", "San José");
	    //aqui falta agregar la capital de salvador
	    capitales.put("El Salvador", "San salvador");
	    capitales.put("Guatemala", "Ciudad de Guatemala");
	    capitales.put("Honduras", "Tegucigalpa");
	    capitales.put("Nicaragua", "Managua");
	    capitales.put("Panamá", "Panamá");
	   
	    //esta mal escrito el tipo de dato String decia Sting
	    String c = "";
	    do {
	    	//Esta mal escrito el system y debe ser system.out.print
	      System.out.print("Escribe el nombre de un país y te diré su capital: ");
	      //aca en lugar de ser nextDouble debe ser nextLine porque es un string
	      c = s.nextLine();
	      //Le faltaba una letra s al equals
	      if (!c.equals("salir")) {
	    	  //falta nombrar bien la variable capitales y dever ser key en lugar de values
	        if (capitales.containsKey(c)) {
	        	//Falta poner el out al system.print
	          System.out.print("La capital de " + c);
	          
	          //falta nombrar bien la variable capitales y cambiar put por get
	          System.out.println(" es " + capitales.get(c));
	        } else {
	          System.out.print("No conozco la respuesta ");
	          System.out.print("¿cuál es la capital de " + c + "?: ");
	          String ca = s.nextLine();
	         //renombrar bien el shashmap de ca a capitales
	          capitales.put(c, ca);
	          System.out.println("Gracias por enseñarme nuevas capitales");
	        }
	      }
	      //esta mal escrito el ciclo while y cerrar bien el parentesis
	    } while (!c.equals("salir"));
	    s.close();
	}//main
}//class Codigo7
