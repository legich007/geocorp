package com.kulankhin.demo.persistence.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ProjectStatus {
    NEW("Новый"),
    IN_PROGRESS("В работе"),
    CLOSED("Закрыт");

    //TODO: Заменить на реальные значения

    private String value;

    ProjectStatus(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }
}
