import java.util.Locale;
import java.util.Scanner;

public class Contador {
    
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite parâmetro um:");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite parâmetro dois:");
        int parametroDois = terminal.nextInt();
        
        try{

            contar(parametroUm, parametroDois);

        }catch(ParametrosInvalidosException e){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");

        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        //validar se parametroUm é maior que parametroDois e lançcar exceção
        if(parametroUm > parametroDois){
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;
        System.out.println(contagem);
        //realizar o for para imprimir os numeros com base na variavel 
        for(int contador=1;contador<=contagem;contador++){
            System.out.println("Imprimindo o número " + contador);
        }
    }
}
