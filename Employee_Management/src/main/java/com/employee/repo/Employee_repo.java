package com.employee.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.entity.Employee_entity;

@Repository
public interface Employee_repo extends JpaRepository<Employee_entity, Integer>{

}
