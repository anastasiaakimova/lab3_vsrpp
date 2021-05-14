package org.example.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "groups")
public class Groups extends AbstractEntity{
    private Long id;
    private int groupId;
    private String grName;

    @OneToMany(mappedBy = "groups", cascade = {CascadeType.ALL}, orphanRemoval = true)
    private Set<Students> studentsSet;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @Column(name = "group_id", nullable = false)
    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    @Basic
    @Column(name = "gr_name", nullable = true, length = 45)
    public String getGrName() {
        return grName;
    }

    public void setGrName(String grName) {
        this.grName = grName;
    }

    public Set<Students> getStudentsSet() {
        return studentsSet;
    }

    public void setStudentsSet(Set<Students> studentsSet) {
        this.studentsSet = studentsSet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Groups groups = (Groups) o;

        if (groupId != groups.groupId) return false;
        if (grName != null ? !grName.equals(groups.grName) : groups.grName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = groupId;
        result = 31 * result + (grName != null ? grName.hashCode() : 0);
        return result;
    }
}
