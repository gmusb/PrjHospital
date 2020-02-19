package aula1202;

public class Start {

    public static void main(String[] args) {
        Paciente p = new Paciente();
        p.setCodPaciente(1223);
        p.setCpf("133.333.077-40");
        p.setIdade(18);
        p.setNome("Rebeca Catarina dos Santos");
        p.setRg("23.596.222-3");
        p.setSenha("null");
        System.out.println("cod. do paciente: "+p.getCodPaciente());
        System.out.println("CPF do paciente: "+p.getCpf());
        System.out.println("idade do paciente: "+p.getIdade());
        System.out.println("nome do paciente: "+p.getNome());
        System.out.println("RG do paciente: "+p.getRg());
        System.out.println("Senha do paciente: "+p.getSenha());
        System.out.println(" -------------------------------- ");
        
        Funcionario f = new Funcionario();
        f.setCpf("687.991.148-01");
        f.setIdade(28);
        f.setNome("Louise Isabelle Marcela Porto");
        f.setRg("11.602.680-7");
        f.setSenha("null2");
        f.setMatricula(187);
        System.out.println("CPF do Funcionário: "+f.getCpf());
        System.out.println("idade do Funcionário: "+f.getIdade());
        System.out.println("nome do Funcionário: "+f.getNome());
        System.out.println("RG do Funcionário: "+f.getRg());
        System.out.println("Senha do Funcionário: "+f.getSenha());
        System.out.println("Matrícula do Funcionário: "+f.getMatricula());
        System.out.println(" -------------------------------- ");
        
        Enfermeiro e = new Enfermeiro();
        e.setCoren("1517.5");
        e.setCpf("258.147.825-01");
        e.setIdade(38);
        e.setNome("Bryan Murilo da Mata");
        e.setRg("37.631.209-9");
        e.setSenha("null3");
        e.setMatricula(187);
        System.out.println("CPF do enfermeiro: "+e.getCpf());
        System.out.println("idade do enfermeiro: "+e.getIdade());
        System.out.println("nome do enfermeiro: "+e.getNome());
        System.out.println("RG do enfermeiro: "+e.getRg());
        System.out.println("Senha do enfermeiro: "+e.getSenha());
        System.out.println("Matrícula do enfermeiro: "+e.getMatricula());
        System.out.println("Coren do enfermeiro: "+ e.getCoren());
        System.out.println(" -------------------------------- ");
        
        Medico m = new Medico();
        m.setCRM("154");
        m.setEspecialidade("neurocirurgião");
        m.setCpf("524.456.430-74");
        m.setIdade(40);
        m.setNome("Anderson Arthur Osvaldo Moraes");
        m.setRg("20.732.035-4");
        m.setSenha("null4");
        m.setMatricula(187);
        System.out.println("CPF do Medico: "+m.getCpf());
        System.out.println("idade do Medico: "+m.getIdade());
        System.out.println("nome do Medico: "+m.getNome());
        System.out.println("RG do Medico: "+m.getRg());
        System.out.println("Senha do Medico: "+m.getSenha());
        System.out.println("Matrícula do Medico: "+m.getMatricula());
        System.out.println("CRM do Medico: "+m.getCRM());
        System.out.println("Especialidade do Medico: "+m.getEspecialidade());
        System.out.println(" -------------------------------- ");
        
        Hospital h = new Hospital(10 , "Rua 2");
        h.setNome("Flat-Line");
        h.addFuncionario(f);
        h.addFuncionario(m);
        h.addFuncionario(e);
        System.out.println("Funcionarios:");
        h.listarTodosFuncionarios();
        System.out.println("Medicos");
        h.listarMedicos();
        System.out.println("Enfermeiros");
        h.listarEnfermeiros();
        
        ProntoSocorro ps = new ProntoSocorro(10, h);
        ps.setEndereco("Rua 3");
    }
    
}
