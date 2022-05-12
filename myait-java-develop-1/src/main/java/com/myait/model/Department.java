package com.myait.model;

import javax.persistence.Entity; 
import javax.persistence.Id;

@Entity
public class Department {
    
    @Id
    private int deptid;
    private String deptname;
    private String depttype;
    
    public Department() {
        super();
    }

    public Department(int deptid, String deptname, String depttype) {
        super();
        this.deptid = deptid;
        this.deptname = deptname;
        this.depttype = depttype;
    }

    public int getDeptid() {
        return deptid;
    }

    public void setDeptid(int deptid) {
        this.deptid = deptid;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public String getDepttype() {
        return depttype;
    }

    public void setDepttype(String depttype) {
        this.depttype = depttype;
    }

    @Override
    public String toString() {
        return "Department [deptid=" + deptid + ", deptname=" + deptname + ", depttype=" + depttype + ", getDeptid()="
                + getDeptid() + ", getDeptname()=" + getDeptname() + ", getDepttype()=" + getDepttype()
                + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
                + "]";
    }
    
    
    
    
    

}