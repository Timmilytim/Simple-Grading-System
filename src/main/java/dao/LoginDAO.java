package dao;

import database.DBUtil;
import model.Login;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class LoginDAO {

    public static boolean isUserValid(Login login) {
        boolean validStatus = false;
        try{
            Connection conn = DBUtil.getConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM login WHERE username='" + login.getUserName() + "' " + "AND" +
                    " password='" + login.getPassword() + "'");
            while(rs.next()) {
                validStatus = true;
            }
            DBUtil.closeConnection(conn);
        } catch (Exception e){
            e.printStackTrace();
    }
        return validStatus;
    }
}
