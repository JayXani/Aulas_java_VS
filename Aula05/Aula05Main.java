import javax.swing.JOptionPane;

public class Aula05Main extends CalculosAula05{
    static CalculosAula05 Intermedio = new CalculosAula05();

    public static void main (String[] args){
        
        String menu = "\n\n Menu de opções \n"
        + "\n 1) Calculo fatorial (while)"
        + "\n 2) Calculo fatorial (for)"
        + "\n 3) Calculo fibonnaci (while)"
        + "\n 4) Calculo fatRecur \n\n ";

        int condicao = Integer.parseInt(JOptionPane.showInputDialog(null, "Selecione a opção desejada:" + menu));
        
        switch (condicao) {
            case 1:
                Aula05Main.Intermedio.fatorialWhile();
                break;

            case 2: 
                Aula05Main.Intermedio.fatorialFor();
                break;

            case 3:
                int termo;
                termo = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o termo desejado, sendo maior que 0: "));                
                fibonnaciRecursiva(1,1,0,termo);

                break;
            case 4: 
            int num;
            num = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor para calculo: "));
            System.out.println(fatorialRecursiva(num));
        
                break;

            default:
                break;
        }
        
    }

}
