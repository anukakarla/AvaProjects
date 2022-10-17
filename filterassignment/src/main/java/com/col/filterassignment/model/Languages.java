
package com.col.filterassignment.model;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "eng",
    "fij",
    "hif"
})
@Data
@Generated("jsonschema2pojo")
public class Languages {

    @JsonProperty("eng")
    public String eng;
    @JsonProperty("fij")
    public String fij;
    @JsonProperty("hif")
    public String hif;

}
