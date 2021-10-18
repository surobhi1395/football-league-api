package com.football.footballleague.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Country {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "country_id",
            "country_name",
            "country_logo"
    })

        @JsonProperty("country_id")
        public String countryId;
        @JsonProperty("country_name")
        public String countryName;
        @JsonProperty("country_logo")
        public String countryLogo;

}
