package com.department.repository;

import com.department.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Departmentrepositary  extends JpaRepository<Department,Long> {
    public Department findBydepartmentName(String departmentName);
    public Department findByDepartmentNameIgnoreCase(String departmentName);

}
