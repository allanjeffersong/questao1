public class Programador extends Funcionario {
    private String Linguagem;

    public void setLinguagem(String linguagem){
        this.Linguagem = linguagem;
    }

    public String getLinguagem() {
        return Linguagem;
    }
    public void informarLinguagem(){
        System.out.println("sua linguagem de programação é: " +  Linguagem);
    }
}
