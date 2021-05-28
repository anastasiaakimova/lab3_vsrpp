package org.example.entity;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "faculty", schema = "university")
@AttributeOverride(name = "id", column = @Column(name = "faculty_id"))
public class Faculty extends AbstractEntity {

    @Column(unique = true)
    private String name;

    @Column(name = "phone_number")
    private String phoneNumber;

    @ManyToOne(targetEntity = Groups.class, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "group_id", nullable = false)
    private Groups groups;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Groups getGroups() {
        return groups;
    }

    public void setGroups(Groups groups) {
        this.groups = groups;
    }
}
