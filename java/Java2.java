import java.util.Scanner;

public class Java2 {
    public static void main(String[] args) {
        //este comando serve para printar as coisas na tela//
        System.out.println("Digite o seu nome");

        System.out.println ("Digite sua cidade");

        System.out.println("Digite estado");

        System.out.println("Cor Favorita");

        System.out.println("Digite sua idade");

        // o Scanner é o metodo para leitura ler o que o usuario digitar//
        Scanner read = new Scanner(System.in);

        // É o formato que a variavel irá receber//
        String Nome = read.nextLine();
        String Cidade = read.nextLine();
        String Estado = read.nextLine();
        String Cor = read.nextLine();
        String Idade = read.nextLine();

        // Atividade Criar nome, Cidade, Estado, Cor Favorita, Idade //


    }
}

