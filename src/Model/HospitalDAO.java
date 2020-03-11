package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class HospitalDAO {

    private Connection con = new ConnectionFactory().getConnection();
    
    public void cadastar(Hospital hospital){
        try{
            String query = "Insert into hospital (nm_hospital, ds_endereco) values (? ,?)";
            
            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.setString(1, hospital.getNome());
            preparedStatement.setString(2, hospital.getEndereco());
            
            preparedStatement.execute();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
     };           
    public ArrayList<Hospital> buscar(){
        ArrayList<Hospital> ah = new ArrayList();
        try{
            String query = "select * from hospital";
            PreparedStatement preparedStmd = con.prepareStatement(query);
            ResultSet rs = preparedStmd.executeQuery(query);
            
            while(rs.next()){  
                Hospital h = new Hospital(rs.getString("nm_hospital"));
                h.setIdHospital(rs.getInt("id_hospital"));
                ah.add(h);
            }
            
        }catch( Exception e ){
            System.out.println(e);
        }
            
        return ah;
    };
}
