import javax.swing.JOptionPane;


public class CalculosAula05{

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
    public static int fibonnaciRecursiva(int termo){
        if(termo == 0 || termo == 1){
            return termo;
        }
        return fibonnaciRecursiva(termo - 1) + fibonnaciRecursiva(termo - 2);
    }

    
}
