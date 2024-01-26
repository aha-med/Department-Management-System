package com.department.controller;

import com.department.entity.Department;
import com.department.exception.NoDepartmentFound;
import com.department.service.Departmentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class Departcontroller {
    @Autowired
    private Departmentservice departmentservice;

    @PostMapping("/department")
    public Department saveDepartment(@RequestBody Department department) {
        return departmentservice.saveDepartment(department);
    }
    @GetMapping("/department")
    public List<Department> fetchDepartmentList () {
        return departmentservice.fetchDepartmentList();
    }
    @GetMapping("/department/{id}")
    public Department fetchDepartmentById(@PathVariable("id") Long departmentId) throws NoDepartmentFound {
        return departmentservice.fetchDepartmentById(departmentId);
    }
    @DeleteMapping("/department/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long deaprtmentId) {
        departmentservice.deleteDepartmentById(deaprtmentId);
        return "deleted successfully";
    }
    @PutMapping("/department/{id}")
    public Department updateDepartment(@PathVariable("id") Long deaprtmentId,@RequestBody Department department){
        return departmentservice.updateDepartment(deaprtmentId,department);
    }
    @GetMapping("department/name/{name}")
    public Department fetchDepartmentByName(@PathVariable("name")String departmentName){
        return departmentservice.fetchDepartmentByName(departmentName);
    }

}
