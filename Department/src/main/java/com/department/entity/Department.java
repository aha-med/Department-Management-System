package com.department.entity;

import jakarta.persistence.*;

@Entity
public class Department {
    @Id
   @SequenceGenerator(name = "department_sequence",
   sequenceName = "department_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="department_sequence")
    private Long departmentId;
    private String departmentName;
    private String departmentAddress;
    private int departmentCode;

    public Department() {
    }

    public Department(Long departmentId, String departmentName, String departmentAddress, int departmentCode) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.departmentAddress = departmentAddress;
        this.departmentCode = departmentCode;
    }

    public Department(String departmentName, String departmentAddress, int departmentCode) {
        this.departmentName = departmentName;
        this.departmentAddress = departmentAddress;
        this.departmentCode = departmentCode;
    }

    public long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentAddress() {
        return departmentAddress;
    }

    public void setDepartmentAddress(String departmentAddress) {
        this.departmentAddress = departmentAddress;
    }

    public int getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(int departmentCode) {
        this.departmentCode = departmentCode;
    }

    @Override
    public String toString() {
        return "Department{" +
                "deaprtmentId=" + departmentId +
                ", departmentName='" + departmentName + '\'' +
                ", departmentAddress='" + departmentAddress + '\'' +
                ", departmentCode=" + departmentCode +
                '}';
    }
}
