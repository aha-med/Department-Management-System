package com.department.service;

import com.department.entity.Department;
import com.department.repository.Departmentrepositary;
import com.department.exception.NoDepartmentFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class Departserimp implements Departmentservice{
    @Autowired
    private Departmentrepositary departmentrepo;

    @Override
        public Department saveDepartment(Department department){
        if(department==null){
            throw new NullPointerException("add department details");
        }

            return departmentrepo.save(department);
        }
        @Override
    public List<Department> fetchDepartmentList(){
            return departmentrepo.findAll();
        }
        @Override
        public Department fetchDepartmentById(Long departmentId) throws NoDepartmentFound {
            Optional<Department> department =departmentrepo.findById(departmentId);
            if (!department.isPresent()){
               throw new NoDepartmentFound("data not found");
            }
            return department.get();
        }
        @Override
        public Department deleteDepartmentById(Long departmentId) {
            Department department = departmentrepo.findById(departmentId).orElse(null);
            if (department != null) {
                departmentrepo.deleteById(departmentId);
            }

            return department;
        }
@Override
    public Department updateDepartment(Long deaprtmentId,Department department){
        Department depDb=departmentrepo.findById(deaprtmentId).get();
        if(Objects.nonNull(department.getDepartmentName())&& !"".equalsIgnoreCase(department.getDepartmentName())){
            depDb.setDepartmentName(department.getDepartmentName());
        }
        if(Objects.nonNull(department.getDepartmentAddress())&& !"".equalsIgnoreCase(department.getDepartmentName())){
            depDb.setDepartmentAddress(department.getDepartmentAddress());
        }
        if(Objects.nonNull(department.getDepartmentCode())&& !"".equalsIgnoreCase(department.getDepartmentName())){
            depDb.setDepartmentCode(department.getDepartmentCode());
        }
        return departmentrepo.save(depDb);

    }
    @Override
    public Department fetchDepartmentByName(String departmentName){
        return departmentrepo.findBydepartmentName(departmentName);
    }
    }


