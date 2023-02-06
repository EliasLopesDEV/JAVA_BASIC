package IF;

import java.util.Scanner;

public class IF {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("informe a media");
        double media = read.nextDouble();
        // Condição if
        if (media <= 10 && media >7.0){
            System.out.println ("acertou miseravi");
        }
       if (media <=7 && media>=4.5){
           System.out.println("Errou Miseravi");
   }
       if (media <=4.5 && media>=0.0){
           System.out.println("Deve estudar mais");
        }
       read.close();
}

}