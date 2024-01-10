
package com.cydeo.dto.country;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UAH"
})
@Generated("jsonschema2pojo")
public class Currencies {

    @JsonProperty("UAH")
    private Uah uah;

    @JsonProperty("UAH")
    public Uah getUah() {
        return uah;
    }

    @JsonProperty("UAH")
    public void setUah(Uah uah) {
        this.uah = uah;
    }

}
