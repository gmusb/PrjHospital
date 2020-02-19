package aula1202;

import java.util.ArrayList;

public class Hospital {
    private int idHospital;
    private ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
    private String endereco;
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdHospital() {
        return idHospital;
    }

    public void setIdHospital(int idHospital) {
        this.idHospital = idHospital;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public void addFuncionario(Funcionario funcionario){
        this.funcionarios.add(funcionario);
    }
    public void listarTodosFuncionarios(){
        funcionarios.forEach(funcionarios->System.out.println(funcionarios));
    }
    public void listarMedicos(){
        for(int i = 0; i < funcionarios.size(); i++){
            if(funcionarios.get(i) instanceof Medico){
                System.out.println(funcionarios.get(i));
            }
        }
    }
    public void listarEnfermeiros(){
        for(int i = 0; i < funcionarios.size(); i++){
            if(funcionarios.get(i) instanceof Enfermeiro){
                System.out.println(funcionarios.get(i));
            }
        }
    }
    
    public Hospital(int id, String end){
        this.idHospital = id;
        this.endereco = end;
    }
}
