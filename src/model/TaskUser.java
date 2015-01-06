package model;

import model.enums.TaskUserRelation;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class TaskUser implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @Column(unique = true, nullable = false)
    private Task task;

    @ManyToOne
    @Column(unique = true, nullable = false)
    private User user;

    @Enumerated(EnumType.ORDINAL)
    private TaskUserRelation relation;

    public TaskUser() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public TaskUserRelation getRelation() {
        return relation;
    }

    public void setRelation(TaskUserRelation relation) {
        this.relation = relation;
    }
}



