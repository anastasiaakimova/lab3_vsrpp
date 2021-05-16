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

    @OneToMany(mappedBy = "group", cascade = {CascadeType.ALL}, orphanRemoval = true, fetch = FetchType.EAGER)
    private Set<Students> students;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Groups groups = (Groups) o;
        return Objects.equals(grName, groups.grName) && Objects.equals(students, groups.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), grName, students);
    }

    @Override
    public String toString() {
        return "Group{" +
                "grName='" + grName + '\'' +
                ", students=" + students +
                '}';
    }
}
