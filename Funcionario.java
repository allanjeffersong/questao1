public class Funcionario {

    protected String nome;
    protected double salario;
    protected int nasc, idade;

    public void informarSalario(){
        System.out.println(salario);
    }
    public void calcularIdade(){
     idade = 2024 - nasc;
    }
}
