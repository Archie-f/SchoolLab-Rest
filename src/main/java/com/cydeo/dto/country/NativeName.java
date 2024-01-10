
package com.cydeo.dto.country;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ukr"
})
@Generated("jsonschema2pojo")
public class NativeName {

    @JsonProperty("ukr")
    private Ukr ukr;

    @JsonProperty("ukr")
    public Ukr getUkr() {
        return ukr;
    }

    @JsonProperty("ukr")
    public void setUkr(Ukr ukr) {
        this.ukr = ukr;
    }

}
