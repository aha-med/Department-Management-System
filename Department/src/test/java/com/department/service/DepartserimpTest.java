package com.department.service;

import com.department.entity.Department;
import com.department.repository.Departmentrepositary;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;

class DepartserimpTest {
    @InjectMocks
    private Departserimp departserimp;
    @Mock
    private Departmentrepositary repository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void should_saveDepartment() {
        Department department=new Department(
                "ECE",
                "Coimbatore",
                102);
        department.setDepartmentId((long)22);
        when(repository.save(department)).thenReturn(department);
        departserimp.saveDepartment(department);
        verify(repository,times(1)).save(department);
    }

    @Test
    void should_fetchDepartmentList() {
        List<Department> allDepartment=new ArrayList<>();
        allDepartment.add(new Department(
                "ECE",
                "Coimbatore",
                102) );

        when(repository.findAll()).thenReturn(allDepartment);
        List<Department> all=departserimp.fetchDepartmentList();
        assertEquals(allDepartment.size(),all.size());
    }

    @Test
    void should_fetchDepartmentById() {
        long id=1;
        Department department=new Department("ECE",
                "Coimbatore",
                102);
        when(repository.findById(id)).thenReturn(Optional.of(department));
        Department actualDepartment=departserimp.fetchDepartmentById(id);
        assertEquals(department.getDepartmentName(),actualDepartment.getDepartmentName());
        assertEquals(department.getDepartmentAddress(),actualDepartment.getDepartmentAddress());
        assertEquals(department.getDepartmentCode(),actualDepartment.getDepartmentCode());
    }

    @Test
    void deleteDepartmentById() {
        long id=1;
        Department department= new Department("ECE",
                "Coimbatore",
                102);
        when(repository.findById(id)).thenReturn(Optional.of(department));
        Department deletedDepartment=departserimp.deleteDepartmentById(id);
        assertNotNull(deletedDepartment);
        verify(repository,times(1)).deleteById(id);
        verify(repository,times(1)).findById(id);
    }

    @Test
    void updateDepartment() {
    }

    @Test
    void fetchDepartmentByName() {
    }
}