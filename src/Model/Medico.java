package Model;

public class Medico extends Funcionario{
    private String CRM;
    private String especialidade;

    public String getCRM() {
        return CRM;
    }

    public void setCRM(String CRM) {
        this.CRM = CRM;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    
    @Override
    public double gerarBonus(){
        return calcularSalario()*0.3;
    }
}
