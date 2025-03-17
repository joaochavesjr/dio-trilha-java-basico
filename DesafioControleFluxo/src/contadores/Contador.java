package contadores;

import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o valor inicial:");
        int parametroUm = scanner.nextInt();

        System.out.println("Insira o valor final:");
        int parametroDois = scanner.nextInt();

        try{
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException ex){
            System.out.println(ex.getMessage());
        }
    }
    
    static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException {

        if (parametro1 > parametro2) {
            ParametrosInvalidosException minhaex = new ParametrosInvalidosException("** Erro: Valores incorretos");
            throw minhaex;
        }

        int contagem = parametro2 - parametro1;
        for (int i = 0; i <= contagem; i++) {
            System.out.println(i+1);
        }
    }
}