package com.example.user.model;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Role {
    ADMIN,
    DEVELOPER,
    TESTER,
    SYSTEM_ANALYST,
    TEAM_LEAD;

    @JsonValue
    public String getName() {
        return this.name();
    }
}
