package org.csystem.service.patience.data.entity;

import javax.persistence.*;
import java.time.LocalDateTime;


public class DoctorAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "doctor_account_id")
    public int id;

    public String name;

    public String surname;

    public double age;

    public String address;

    public String email;

    public String phoneNumber;

    public LocalDateTime loginTime;

    public LocalDateTime logoutTime;

    public LocalDateTime registerTime;
}
