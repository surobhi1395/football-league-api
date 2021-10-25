
package com.football.footballleague.model.lineups;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "lineup_player",
    "lineup_number",
    "lineup_position",
    "player_key"
})
@Generated("jsonschema2pojo")
public class Substitute__1 {

    @JsonProperty("lineup_player")
    public String lineupPlayer;
    @JsonProperty("lineup_number")
    public String lineupNumber;
    @JsonProperty("lineup_position")
    public String lineupPosition;
    @JsonProperty("player_key")
    public String playerKey;

}
