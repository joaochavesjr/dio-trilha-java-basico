import java.util.Locale;
import java.util.Scanner;

public class Usuario {

    public static void main(String[] args) throws Exception {
        
        // apenas visivel no metodo
        //int varlocal = 1;
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o nome:");
        String nome = scanner.next();
    
        System.out.println("Digite o sobrenome:");
        String sobrenome = scanner.next();
    
        System.out.println("Digite a idade:");
        int idade = scanner.nextInt();

        System.out.println("Digite a idade:");
        Double altura = scanner.nextDouble();

        System.out.println("Nome: " + nome + " " + sobrenome);
        System.out.println("Idade: " + idade + " Altura: " + altura);

        /*String nome = args[0];
        String sobrenome = args[1];
        String sobrenome2 = args[2];
        System.out.println("Nome: " + nome + " " + sobrenome + " " + sobrenome2);*/

        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada ? " + smartTv.ligada);
        System.out.println("Canal atual ? " + smartTv.canal);
        System.out.println("Volume ? " + smartTv.volume);

        smartTv.ligar();
        System.out.println("TV Ligada ? " + smartTv.ligada);

    }


}
