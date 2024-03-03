package com.sai.StudentRepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sai.StudentEntity.StudentEntity;

@Repository
public interface StudentRepository extends CrudRepository<StudentEntity, Long> {
}
