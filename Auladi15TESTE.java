import java.util.Arrays;
import java.util.Scanner;

public class Auladi15TESTE {

    public static void main(String[] args){
        int valor[] = new int [10];
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe valores");

        for(int i = 0; i < valor.length; i++){
            
            valor[i] = teclado.nextInt();

        }
        
        System.out.println("Maior valor: " + getMaior(valor));
        System.out.println("Menor valor: "+ getMenor(valor));

        for(int i : valor)  System.out.print(i + " ");        
        
    }

    public static int getMaior (int vet[]){
        int maior = 0;

        for(int i = 0; i < vet.length; i++ ){

            if(i == 0){
                maior = vet[i];
                continue;

            }
            if(vet[i] > maior) maior = vet[i];
        }
        return maior;
    }

    public static int getMenor(int vet[]){
        int menor = 0;

        for(int i = 0; i < vet.length; i++ ){
            if(i == 0){
                menor = vet[i];
                continue;

            }
            if(vet[i] < menor) menor = vet[i];
        }

        return menor;
    }
}
