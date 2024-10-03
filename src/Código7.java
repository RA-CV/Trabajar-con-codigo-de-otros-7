import java.util.HashMap;//Importé las clases necesarias
import java.util.Scanner;

public class Código7 {

public static void main(String[] args) { // Añadí el método main 
    Scanner s = new Scanner(System.in); // Para inicializar el scanner

    HashMap<String, String> capitales = new HashMap<>();//Cambié a <String, String> y "capitales"

    capitales.put("Canadá", "Ottawa");
    capitales.put("Estados Unidos", "Washington DC");
    capitales.put("México", "Ciudad de México");
    capitales.put("Belice", "Belmopán");
    capitales.put("Costa Rica", "San José");
    capitales.put("El Salvador", "San Salvador"); // Agregué la capital
    capitales.put("Guatemala", "Ciudad de Guatemala");
    capitales.put("Honduras", "Tegucigalpa");
    capitales.put("Nicaragua", "Managua");
    capitales.put("Panamá", "Panamá");
   
    String c = "";//  Añadí "r"
    do {
      System.out.print("Escribe el nombre de un país y te diré su capital: ");// Cambié a "System.out.print"
      c = s.nextLine(); // Cambié a nextLine()
      
      if (!c.equals("salir")) {//  Añadí "s"
        if (capitales.containsValue(c)) {// Cambié a "capitales.
          System.out.print("La capital de " + c);//  Añadí ".out."
          System.out.println(" es " + capitales.get(c));// Cambié a "capitales.get(c)"
        } else {
          System.out.print("No conozco la respuesta ");
          System.out.print("¿cuál es la capital de " + c + "?: ");
          String nuevaCapital = s.nextLine();// Cambié a String "nuevaCapital"
          capitales.put(c, nuevaCapital);// Cambié a "capitales" y "nuevaCapital"
          System.out.println("Gracias por enseñarme nuevas capitales");
        }
      }
    } while (!c.equals("salir"));//  Añadí "s" y ")"
    
    s.close(); // Cerré el Scanner
  }//main

}//class Código7
