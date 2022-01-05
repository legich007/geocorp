package geocorp.persistence.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum PointType {
    PP("Пункт полигонометрии"),
    TRG("ТРГ");

    private String value;

    PointType(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }
}
