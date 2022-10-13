package com.app.service_motor.model;

import javax.persistence.*;

@Entity
@Table(name = "service_motor")
public class ServiceMotor {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "merk")
    private String merk;

    @Column(name = "motorcycle_type")
    private String motorcycle_type;

    @Column(name = "owner")
    private String owner;

    @Column(name = "service_type")
    private String service_type;

    @Column(name = "complaint")
    private String complaint;

    @Column(name = "phone_number")
    private String phone_number;

    @Column(name = "status")
    private String status;

    @Column(name = "cost")
    private int cost;

    @Column(name = "is_deleted")
    private boolean is_deleted;

    @Column(name = "created_at")
    private String created_at;

    @Column(name = "updated_at")
    private String updated_at;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getMotorcycle_type() {
        return motorcycle_type;
    }

    public void setMotorcycle_type(String motorcycle_type) {
        this.motorcycle_type = motorcycle_type;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getService_type() {
        return service_type;
    }

    public void setService_type(String service_type) {
        this.service_type = service_type;
    }

    public String getComplaint() {
        return complaint;
    }

    public void setComplaint(String complaint) {
        this.complaint = complaint;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public boolean isIs_deleted() {
        return is_deleted;
    }

    public void setIs_deleted(boolean is_deleted) {
        this.is_deleted = is_deleted;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }
}
