
package com.col.filterassignment.model;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "official",
    "common"
})
@Generated("jsonschema2pojo")
@Data
public class Zho {

    @JsonProperty("official")
    public String official;
    @JsonProperty("common")
    public String common;

}