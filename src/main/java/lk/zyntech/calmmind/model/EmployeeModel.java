package lk.zyntech.calmmind.model;

import lk.zyntech.calmmind.entity.Employee;
import lk.zyntech.calmmind.util.CrudUtil;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeModel {
    public static Employee searchEmployee(String id) throws SQLException, ClassNotFoundException {
        ResultSet rs = CrudUtil.execute("SELECT * FROM employee WHERE id =? ", id);
        if(rs.next()){
            return new Employee(rs.getString(1), rs.getNString(2));
        }
        return null;
    }
}
