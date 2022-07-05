package com.cognizant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.model.ProjectManager;
/**
 * 
 * This is an interface which is used to communicate with the database.
 *
 *  JpaRepository
 */
@Repository
public interface ManagerRepository extends JpaRepository<ProjectManager, String> {

}
