package com.app.service_motor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ServiceMotorService {
    @Autowired
    com.app.service_motor.repository.ServiceMotorRepository serviceMotorRepository;

    public List<com.app.service_motor.model.ServiceMotor> getByStatus(String status){
        List<com.app.service_motor.model.ServiceMotor> get = serviceMotorRepository.findByStatus(status);
        return get;
    }

    public com.app.service_motor.model.ServiceMotor store(com.app.service_motor.model.ServiceMotor serviceMotor){
        Date date = Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentDate = dateFormat.format(date);

        serviceMotor.setCreated_at(currentDate);
        serviceMotor.setUpdated_at(currentDate);
        serviceMotor.setStatus("WAITING");
        serviceMotor.setIs_deleted(false);

        com.app.service_motor.model.ServiceMotor store = serviceMotorRepository.save(serviceMotor);
        return store;
    }

    public com.app.service_motor.model.ServiceMotor editStatus(int service_motor_id, com.app.service_motor.model.ServiceMotor serviceMotor){
        Optional<com.app.service_motor.model.ServiceMotor> getId = serviceMotorRepository.findById(service_motor_id);
        com.app.service_motor.model.ServiceMotor editServiceMotor = getId.get();

        Date date = Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentDate = dateFormat.format(date);

        editServiceMotor.setStatus(serviceMotor.getStatus());
        editServiceMotor.setUpdated_at(currentDate);

        com.app.service_motor.model.ServiceMotor editStatus = serviceMotorRepository.save(editServiceMotor);
        return editStatus;
    }
}
