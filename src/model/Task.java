package model;

import model.enums.TaskStatus;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
public class Task implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private Integer parentID;

    @Enumerated(EnumType.ORDINAL)
    private TaskStatus status;

    private Integer priority;

    private Date startDate;

    private Date endDate;

    private String description;

    @OneToMany
    private List<TaskUser> taskUsers;

    public Task() {
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getParentID() {
        return parentID;
    }

    public void setParentID(Integer parentID) {
        this.parentID = parentID;
    }

    public TaskStatus getStatus() //todo for BD
    {
        return status;
    }

    public void setStatus(TaskStatus status) //todo for BD
    {
        this.status = status;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setId(Integer taskID) {
        this.id = taskID;
    }

    public List<TaskUser> getTaskUsers() {
        return taskUsers;
    }

    public void setTaskUsers(List<TaskUser> taskUsers) {
        this.taskUsers = taskUsers;
    }

    @Override
    public String toString() {
        return "Task : " + name + ", ID = " + id;
    }
}
