package com.ssi.dao;


import com.ssi.entity.Department;
import com.ssi.exception.NotFoundException;
import com.ssi.utils.DatabaseUtils;
import org.springframework.stereotype.Repository;

@Repository
public class DepartmentDao {


    public Department getDepartmentById(Integer id) {
        return DatabaseUtils.departmentMap.get(id);
    }

    public Department save(Department department) {
        return DatabaseUtils.departmentMap.put(department.getDepartmentId(), department);
    }

    public Department update(Department department) throws NotFoundException {
        if (DatabaseUtils.departmentMap.containsKey(department.getDepartmentId())) {
            throw new NotFoundException("department");
        }
        return DatabaseUtils.departmentMap.put(department.getDepartmentId(), department);
    }

    public Department delete(Integer id) throws NotFoundException {
        if (DatabaseUtils.departmentMap.containsKey(id)) {
            throw new NotFoundException("department");
        }
        return DatabaseUtils.departmentMap.remove(id);
    }
}
