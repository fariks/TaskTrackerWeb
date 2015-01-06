package model.enums;

import java.io.Serializable;

public enum UserGrants implements Serializable {
    REQUEST,      // 1
    TASK_READ,    // 2
    TASK_EXECUTE, // 4
    TASK_MODIFY,  // 8
    TASK_CREATE   // 16
}
