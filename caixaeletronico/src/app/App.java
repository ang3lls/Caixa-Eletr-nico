package app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int num, saldo = 1000, dep, saq, resp = 0, resp2 = 3;
        String cpf, senha = " ";
        Scanner read = new Scanner(System.in);
            do{
            System.out.println("*Bem-vindo ao seu banco*");
            System.out.println("----------------------------");
            System.out.println("Acessar a sua conta");
            System.out.println("Digite seu CPF: ");
            cpf = read.next();
            do{
            if(cpf.equals("12345678900") == true) {
                System.out.println("Digite a sua senha: ");
                senha = read.next(); 
            }
            else{
                System.out.println("ACESSO NEGADO");
                System.exit(0);
            }  
            if(senha.equals("01020304") == true){
                do{
                System.out.println("-------------------");
                System.out.println("ACESSO PERMITIDO");
                System.out.println("*Qual operação deseja efetuar?*");
                System.out.println(" 1-Ver o Saldo");
                System.out.println(" 2-Fazer Depósito");
                System.out.println(" 3-Fazer Saque");
                System.out.println("*****");
                System.out.println("Digite o número da operação desejada: ");
                num = read.nextInt();
                switch(num){
                    case 1:
                        System.out.println("Saldo = " + saldo);
                    break;
                    case 2:
                        System.out.println("Digite o valor do depósito: ");
                        dep = read.nextInt();
                        System.out.println("Saldo = " + (saldo+dep));
                    break;
                    case 3:
                        System.out.println("Digite o valor do saque: ");
                        saq = read.nextInt();
                        System.out.println("Saldo = " + (saldo-saq));
                    break;
                    default:
                        System.out.println("Número inválido");
                    break;   
                }   
                System.out.println("Deseja continuar? 0-Sim 1-Não");
                resp = read.nextInt();
                }while(resp == 0);
            }
            else{
                resp2--;
                if(resp2 == 0){
                System.out.println("ACESSO BLOQUEADO");
                System.exit(0);
                }
                System.out.println("Senha incorreta!");
                System.out.println("Tentativas restantes " + resp2);
            } 
        }while(resp2 > 0 && resp != 1);
        }while(resp == 1); 
    }
}