package controller;

import Model.Hospital;
import Model.HospitalDAO;
import java.util.ArrayList;

public class ControllerHospital {
    public void CadastrarHospital(Hospital hospital){
        HospitalDAO hDAO = new HospitalDAO();
        hDAO.cadastar(hospital);
    }
    
    public ArrayList<Hospital> listarHospital(){
        HospitalDAO hDAO = new HospitalDAO();
        return hDAO.buscar();
    }
}
