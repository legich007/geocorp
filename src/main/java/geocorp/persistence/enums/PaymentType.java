package geocorp.persistence.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum PaymentType {

    WITH_NDS("с НДС"),
    WITHOUT_NSD("без НДС"),
    CASH("наличные");

    private String value;

    PaymentType(String str) {
      value = str;
    }

    @JsonValue
    public String getValue(){
        return value;
    }
}
