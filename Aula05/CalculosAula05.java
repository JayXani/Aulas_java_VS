import javax.swing.JOptionPane;


public  class CalculosAula05{

    public void fatorialWhile(){
        int getValorFatorial = 0;
        int contador;
        while(getValorFatorial <= 0){
            getValorFatorial = Integer.parseInt(JOptionPane.showInputDialog(null, " Teste Fatorial (WHILE) \n Informe um valor para o calculo: "));
        }
        contador = getValorFatorial;
        getValorFatorial = 1;
        while(contador > 0){
            getValorFatorial *= contador;
            contador--;
        }
        JOptionPane.showMessageDialog(null, "O fatorial eh: " + getValorFatorial);
    }

    public void fatorialFor(){
        int getValorFatorial = 0;
        int contador;

        while(getValorFatorial <= 0){
            getValorFatorial = Integer.parseInt(JOptionPane.showInputDialog(null,"Teste fatorial (FOR) \n Informe um valor para o calculo: "));
        }
        contador = getValorFatorial;
        getValorFatorial = 1;

        for(;contador > 0 ; contador--){
            getValorFatorial *= contador;
        }

        JOptionPane.showMessageDialog(null, "O fatorial eh: " + getValorFatorial);

    }
    public static void fibonnaciRecursiva(int anterior, int atual, int condicao, int termo){
        if(condicao == 2){
            System.out.println(anterior);
            System.out.println(atual);
        }

        if(termo == condicao){
            return;
        }
        System.out.println(anterior + atual);

        fibonnaciRecursiva(atual, anterior + atual, condicao + 1, termo);
    }
    public static int fatorialRecursiva(int n){
        int fat = n;
        if(n <= 0){
            return 0;
        }
        return fatorialRecursiva(fat * (n-1));
    }
}
