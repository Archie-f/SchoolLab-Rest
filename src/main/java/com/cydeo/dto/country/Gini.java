
package com.cydeo.dto.country;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "2019"
})
@Generated("jsonschema2pojo")
public class Gini {

    @JsonProperty("2019")
    private Float _2019;

    @JsonProperty("2019")
    public Float get2019() {
        return _2019;
    }

    @JsonProperty("2019")
    public void set2019(Float _2019) {
        this._2019 = _2019;
    }

}
