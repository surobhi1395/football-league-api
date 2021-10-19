package com.football.footballleague.model;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "country_id",
        "country_name",
        "country_logo"
})
@Generated("jsonschema2pojo")
public class Country {

        @JsonProperty("country_id")
        public String countryId;
        @JsonProperty("country_name")
        public String countryName;
        @JsonProperty("country_logo")
        public String countryLogo;

}