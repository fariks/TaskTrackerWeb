package model.enums;

import java.io.Serializable;

public enum TaskStatus implements Serializable
{
    PLANNED,     // 0
    CREATED,     // 1
    SPLITTED,    // 2
    ASSIGNED,    // 3
    IN_PROGRESS, // 4
    ON_HOLD,     // 5
    RESOLVED,    // 6
    CLOSED,      // 7
    REOPENED,    // 8
    CANCELLED,   // 9
    REQUESTED    // 10
}