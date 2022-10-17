
package com.col.filterassignment.model;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "symbol"
})
@Generated("jsonschema2pojo")
@Data
public class Fjd {

    @JsonProperty("name")
    public String name;
    @JsonProperty("symbol")
    public String symbol;

}
