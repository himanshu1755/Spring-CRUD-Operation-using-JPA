package com.crudOperation.project.repository;

import com.crudOperation.project.model.EmployeeEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository
        extends CrudRepository<EmployeeEntity, Long> {

}
