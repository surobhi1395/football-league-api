
package com.football.footballleague.model.lineups;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "home",
    "away"
})
@Generated("jsonschema2pojo")
public class Lineup {

    @JsonProperty("home")
    public Home home;
    @JsonProperty("away")
    public Away away;

}
