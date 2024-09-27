import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionario f = new Funcionario();
        Programador p = new Programador();
        Gerente g = new Gerente();


        int repetir;
        do {
            System.out.println("Olá funcionário, digite 1 se você for gerente e 2 se for programador.");
            int x = sc.nextInt();


            switch(x){
                case 1:
                    System.out.println("olá gerente, digite seu projeto");
                    g.setProjeto(sc.next());

                    g.informarProjeto();

                    break;

                case 2:
                    System.out.println("olá programador, digite sua linguagem de programação");
                    p.setLinguagem(sc.next());
                    p.informarLinguagem();
                    break;
            }
            System.out.println("para repetir a experiencia digite 0");
            repetir = sc.nextInt();
        }while (repetir == 0);

        }
    }
