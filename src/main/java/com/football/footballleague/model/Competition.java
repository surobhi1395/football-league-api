package com.football.footballleague.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import javax.annotation.Generated;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "country_id",
        "country_name",
        "league_id",
        "league_name",
        "league_season",
        "league_logo",
        "country_logo"
})
@Generated("jsonschema2pojo")
public class Competition {

    @JsonProperty("country_id")
    public String countryId;
    @JsonProperty("country_name")
    public String countryName;
    @JsonProperty("league_id")
    public String leagueId;
    @JsonProperty("league_name")
    public String leagueName;
    @JsonProperty("league_season")
    public String leagueSeason;
    @JsonProperty("league_logo")
    public String leagueLogo;
    @JsonProperty("country_logo")
    public String countryLogo;

}