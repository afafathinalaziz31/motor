package com.app.service_motor.controller;

import com.app.service_motor.model.ServiceMotor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ServiceMotorController {

    @Autowired
    com.app.service_motor.service.ServiceMotorService serviceMotorService;
    @Autowired
    com.app.service_motor.repository.ServiceMotorRepository serviceMotorRepository;

    @GetMapping(path = "/service")
    public ResponseEntity<Object> getByStatus(String status){
        HashMap<String, Object> response= new HashMap<>();

        List<com.app.service_motor.model.ServiceMotor> serviceMotors = serviceMotorService.getByStatus(status);
        System.out.println(status);
        response.put("message", "success");
        response.put("data",serviceMotors);
        return ResponseEntity.ok().body(response);
    }
    @PostMapping("/service")
    public ResponseEntity<Object> store(@RequestBody com.app.service_motor.model.ServiceMotor serviceMotor){
        HashMap<String, Object> response = new HashMap<>();
        com.app.service_motor.model.ServiceMotor store = serviceMotorService.store(serviceMotor);
        response.put("message", "success");
        response.put("data", store);
        return ResponseEntity.ok().body(response);
    }

    @PutMapping("/service/{id}/update_status")
    public ResponseEntity<Object> editStatus(@PathVariable("id") int service_motor_id,
                                                @RequestBody ServiceMotor serviceMotor){
        HashMap<String, Object> response = new HashMap<>();
        com.app.service_motor.model.ServiceMotor editStatus = serviceMotorService.editStatus(service_motor_id, serviceMotor);
        response.put("message", "status");
        response.put("data", editStatus);
        return ResponseEntity.ok().body(response);
    }
}
