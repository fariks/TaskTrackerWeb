package model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class User implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private Integer grants;

    @OneToMany
    private List<TaskUser> taskUsers;

    public User()
    {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGrants() {
        return grants;
    }

    public void setGrants(Integer grants) {
        this.grants = grants;
    }

    public List<TaskUser> getTaskUsers() {
        return taskUsers;
    }

    public void setTaskUsers(List<TaskUser> taskUsers) {
        this.taskUsers = taskUsers;
    }
}

