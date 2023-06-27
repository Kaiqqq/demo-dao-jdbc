package model.dao.impl;

import model.entities.Department;

import java.sql.ResultSet;
import java.sql.SQLException;

public class InstantiateDepartment {

    protected static Department instantiateDepartment(ResultSet rs) throws SQLException {
        Department dep = new Department();
        dep.setId(rs.getInt("Id"));
        dep.setName(rs.getString("Name"));
        return dep;
    }

}
