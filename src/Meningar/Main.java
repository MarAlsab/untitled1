
package Meningar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        Mening text= new Mening();
        String line;
        int antalTecken = 0;

        do {
            int antalMenigar = 0;
         //   antalMenigar++;
          //  antalTecken++;
            System.out.println(" Skriv in text.! ( Skriv stop för att avsluta.)");
            line = scan.nextLine();

            if (! line.equals("stop")){
                Mening.addMeing(line);
                String Mening;
                System.out.println("Antal meningar är"+ Mening);
                
            }
            System.out.println("Du skrev " + line);
            int sumAntalTecken = line.length();
            System.out.println(sumAntalTecken);

        }while (! line.contains("stop"));
        System.out.println(antalTecken);
    }
}
