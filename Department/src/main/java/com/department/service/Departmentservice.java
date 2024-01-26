package com.department.service;

import com.department.entity.Department;
import com.department.exception.NoDepartmentFound;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface Departmentservice {
   public Department saveDepartment(Department department);
   public List<Department> fetchDepartmentList();
   public Department fetchDepartmentById(Long deaprtmentId) throws NoDepartmentFound;
   public Department deleteDepartmentById(Long deaprtmentId);
   public Department updateDepartment(Long deaprtmentId,Department department);
   public Department fetchDepartmentByName(String departmentName);
}
