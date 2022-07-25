package com.ssi.dao;

import com.ssi.entity.Employee;
import com.ssi.utils.DatabaseUtils;

public class EmployeeDao {
    public Employee saveEmployee(Employee e) {
        DatabaseUtils.map.put(e.getId(), e);

        return e;
    }


/*    public Employee getAllEmployee() {

        return DatabaseUtils.map.get(id);
    }*/

    public Employee getEmployee(Integer id) {

        return DatabaseUtils.map.get(id);
    }

    public Employee updateEmployee(Employee e) {
        DatabaseUtils.map.put(e.getId(), e);
        return e;

    }

    public Employee deleteEmployee(Employee e) {
        DatabaseUtils.map.remove(e.getId());
        return e;

    }
}
