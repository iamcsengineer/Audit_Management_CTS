package com.cts.AuditSeverity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.AuditSeverity.model.AuditRequestModel;
/**
 * 
 *			This is an interface which is used to communicate with the database.
 *         
 */
@Repository
public interface RequestRepository extends JpaRepository<AuditRequestModel, Integer>{

}
