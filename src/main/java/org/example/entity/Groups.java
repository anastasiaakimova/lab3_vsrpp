package org.example.entity;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "groups")
@AttributeOverride(name = "id", column = @Column(name = "group_id"))
public class Groups extends AbstractEntity{
    @Column(unique = true)
    private String grName;

    @OneToMany(targetEntity = Students.class, mappedBy = "students", cascade = {CascadeType.ALL}, orphanRemoval = true, fetch = FetchType.EAGER)
    private Set<Students> students;

    @OneToMany(targetEntity = Faculty.class, mappedBy = "faculty", cascade = {CascadeType.ALL}, orphanRemoval = true, fetch = FetchType.EAGER)
    private Set<Faculty> faculty;


    public String getGrName() {
        return grName;
    }

    public void setGrName(String grName) {
        this.grName = grName;
    }

    public Set<Students> getStudents() {
        return students;
    }

    public void setStudents(Set<Students> students) {
        this.students = students;
    }

    public Set<Faculty> getFaculty() {
        return faculty;
    }

    public void setFaculty(Set<Faculty> faculty) {
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return "Groups{" +
                "grName='" + grName + '\'' +
                ", students=" + students +
                ", faculty=" + faculty +
                '}';
    }
}
