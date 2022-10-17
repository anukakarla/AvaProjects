
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
@Generated("jsonschema2pojo")
@Data
public class NativeName {

    @JsonProperty("eng")
    public Eng eng;
    @JsonProperty("fij")
    public Fij fij;
    @JsonProperty("hif")
    public Hif hif;

}
