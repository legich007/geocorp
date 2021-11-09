package geocorp.persistence.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ProjectStatus {
    NEW("Новый"),
    IN_PROGRESS("В работе"),
    CLOSED("Закрыт");

    private String value;

    ProjectStatus(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }
}
