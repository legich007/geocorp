package geocorp.persistence.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum GeodesyType {

    TAH("Тахеометр"),
    GNSS("GNSS"),
    MIXED("Смешанный");

    private String value;

    GeodesyType(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

}
