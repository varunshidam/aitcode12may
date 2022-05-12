package com.myait.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myait.model.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer>{

}
