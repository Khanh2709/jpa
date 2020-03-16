package com.example.demo;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "department")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer depId;

    @Column(name = "dep_name", length = 20)
    private String depName;

    @OneToMany(mappedBy = "department",fetch = FetchType.LAZY)
    private List<Employee> employeeList;
    public Integer getDepId()
    {
        return depId;
    }

    public void setDepId(Integer depId)
    {
        this.depId = depId;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
    public Department(){

    }
    public Department(String depName) {
        super();
        this.depName = depName;
    }
}
