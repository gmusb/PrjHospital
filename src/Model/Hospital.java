package Model;

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
                System.out.println("CPF do Medico: "+funcionarios.get(i).getCpf());
                System.out.println("idade do Medico: "+funcionarios.get(i).getIdade());
                System.out.println("nome do Medico: "+funcionarios.get(i).getNome());
            }
        }
    }
    public void listarEnfermeiros(){
        for(int i = 0; i < funcionarios.size(); i++){
            if(funcionarios.get(i) instanceof Enfermeiro){
                System.out.println(funcionarios.get(i));
                System.out.println("CPF do enfermeiro: "+funcionarios.get(i).getCpf());
                System.out.println("idade do enfermeiro: "+funcionarios.get(i).getIdade());
                System.out.println("nome do enfermeiro: "+funcionarios.get(i).getNome());
            }
        }
    }
    
    public Hospital( String end){
        this.endereco = end;
    }
}
