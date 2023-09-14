package lk.zyntech.calmmind.util;

import lk.zyntech.calmmind.db.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CrudUtil {
    
    public static <T>T execute(String sql,Object...args) throws SQLException, ClassNotFoundException {
        
        Connection connection = DBConnection.getInstance().getConnection();
            PreparedStatement ps = connection.prepareStatement(sql);
            for (int i = 0; i < args.length; i++) {
                ps.setObject(i+1,args[i]);
            }

            if(sql.toLowerCase().startsWith("select")){
                return (T) ps.executeQuery();
            }else {
                return(T) ((Boolean) (0<ps.executeUpdate()));
            }

        
    }
    
}
