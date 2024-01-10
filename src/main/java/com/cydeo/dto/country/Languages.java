
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
public class Languages {

    @JsonProperty("ukr")
    private String ukr;

    @JsonProperty("ukr")
    public String getUkr() {
        return ukr;
    }

    @JsonProperty("ukr")
    public void setUkr(String ukr) {
        this.ukr = ukr;
    }

}
