import java.util.Scanner;

public class exercicio18{

    public static void main(String[] args){

double download;
double velocidade;
double tempo;

Scanner teclado = new Scanner(System.in);

System.out.println("Insira o tamanho do arquivo em MB:");
download = teclado.nextDouble();

System.out.println("Insira a velocidade do link de internet:");
velocidade = teclado.nextDouble();

tempo = ((download / velocidade) * 60);

System.out.println("Tempo aproximado de download do arquivo é de " + tempo + " minutos");

    }

}