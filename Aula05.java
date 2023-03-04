
import java.util.Scanner;

public class Aula05{
    
    static Scanner teclado = new Scanner(System.in);

    private static void fatorialWhile(){
        int fat = 0;
        int contador;

        System.out.println("\nInforme um valor para a realização do fatorial: ");
        contador = Aula05.teclado.nextInt();

        fat = 1;
        while(contador > 0){

            fat *= contador;
            contador--;
        }

        System.out.println("O fatorial é: " + fat);
    }
    private static void fatorialFor(){
        int fat = 0;
        int contador;

        System.out.println("\nInforme um valor para a realização do fatorial: ");
        contador = Aula05.teclado.nextInt();

        fat = 1;
            for(;contador > 0; contador--){
                fat *= contador;
            }
    
        System.out.println("O fatorial eh: " + fat);
    }

    private static void fibonNacciWhile(){

        int termo;
        int i = 2;
        int anterior = 0;
        int atual = 1;
        int proximo = 1;

        System.out.println("\nInforme o termo desejado: ");
        termo = Aula05.teclado.nextInt();

        if(termo <= 0){
            System.out.println("Informe um termo que não seja <= a 0: \n");
            return ;
        }

   

        System.out.println(anterior + " ");
        System.out.println(atual + " ");

        
        while(i < termo){
            
            proximo = anterior + atual;
            System.out.println(proximo);
            anterior = atual;
            atual = proximo;
            i++;
        }
    }
    private static void fibonNacciFor(){

       
        int termo;
        int anterior = 1;
        int proximo = 0;
        int atual = 1;

        System.out.println("\nInforme um termo: ");
        termo = Aula05.teclado.nextInt();

        if(termo <= 0 ){

            System.out.println("Informe um termo > que 0");
        }
        
        System.out.println("\n" + anterior + " ");
        System.out.println(atual + " ");

        for(int i = 2;i < termo; i++){

            proximo = anterior + atual;
            System.out.println(proximo);
            anterior = atual;
            atual = proximo;
        }
        
    }

    public static void main (String[] args){

        String menu = "\n Menu de opções"
        + "\n A)Calculo fatorial (while)"
        + "\n B)Calculo fatorial (for)"
        + "\n C)Calculo fibonnaci (while)"
        + "\n D)Calculo fibonnaci (for) \n\n ";
        
        String valor = null;
        
        System.out.println(menu);
        System.out.println("Digite a opção desejada: ");

        valor = Aula05.teclado.next();

        switch (valor) {
            
            case "A", "a":
                fatorialWhile();
                break;

            case "B", "b":
                fatorialFor();
                break;

            case "C","c":
                fibonNacciWhile();
                break;

            case "D","d":
                fibonNacciFor();
                break;

            default:
                break;
        }
    }
    
}