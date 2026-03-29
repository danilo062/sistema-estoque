import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcao;

        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("========================");
            System.out.println("========  MENU  ========");
            System.out.println("========================");
            System.out.println("(1) Cadastrar Produto");
            System.out.println("(2) Listar Produto");
            System.out.println("(0) Sair");

            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("Cadastro(Teste)");
                    break;

                case 2:
                    System.out.println("Listar(Teste)");
                    break;

                case 0:
                    System.out.println("Sair(Teste)");
                    break;
            }

        }while(opcao != 0);
    }
}
