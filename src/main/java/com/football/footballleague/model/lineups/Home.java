
package com.football.footballleague.model.lineups;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "starting_lineups",
    "substitutes",
    "coach",
    "missing_players"
})
@Generated("jsonschema2pojo")
public class Home {

    @JsonProperty("starting_lineups")
    public List<StartingLineup> startingLineups = null;
    @JsonProperty("substitutes")
    public List<Substitute> substitutes = null;
    @JsonProperty("coach")
    public List<Coach> coach = null;
    @JsonProperty("missing_players")
    public List<Object> missingPlayers = null;

}
