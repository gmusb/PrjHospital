package aula1202;

public class Funcionario extends Pessoa{
    private int matricula;
    private String senha;
    private double valorHora;

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public double calcularSalario(){
        return this.valorHora * 40;
    }
    
    public double calculaSalario(double desconto){
        return (this.valorHora * 40)-desconto;
    }
    
    public double gerarBonus(){
        return calcularSalario()*0.1;
    }
}
