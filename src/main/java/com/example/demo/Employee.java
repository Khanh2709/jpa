package com.example.demo;

import javax.persistence.*;



@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Integer empId;

    @Column(name = "emp_name")
    private String empName;

    @Column(name = "emp_phone")
    private String empPhone;

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpPhone() {
        return empPhone;
    }

    public void setEmpPhone(String empPhone) {
        this.empPhone = empPhone;
    }
    @ManyToOne
    @JoinColumn(name= "deptid")
    private Department department;

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
    public Employee() {
    }

    public Employee(String empName, String empPhone) {
        super();
        this.empName = empName;
        this.empPhone = empPhone;
    }

}
