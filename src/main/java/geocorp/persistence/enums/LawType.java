package geocorp.persistence.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum LawType {
    LTD("ООО"),
    AO("AO"),
    IP("ИП"),
    INDIVIDUAL("Физическое лицо");

    private String value;

    LawType(String str) {
        value = str;
    }

    @JsonValue
    public String getValue() {
        return value;
    }
}
