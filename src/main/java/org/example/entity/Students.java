package org.example.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "students")
public class Students extends AbstractEntity {
    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "phone_number")
    private String phoneNumber;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "group_id", nullable = false)
    private Groups group;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public Groups getGroup() {
        return group;
    }

    public void setGroup(Groups group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", group=" + group +
                '}';
    }
}
