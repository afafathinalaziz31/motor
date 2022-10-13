package com.app.service_motor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServiceMotorRepository extends JpaRepository<com.app.service_motor.model.ServiceMotor, Integer> {

    @Query(value = "SELECT * FROM service_motor WHERE status = ?", nativeQuery = true)
    List<com.app.service_motor.model.ServiceMotor> findByStatus(String status);
}
