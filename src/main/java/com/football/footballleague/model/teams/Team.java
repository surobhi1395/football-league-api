package com.football.footballleague.model.teams;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import javax.annotation.Generated;
import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "team_key",
        "team_name",
        "team_badge",
        "players",
        "coaches"
})
@Generated("jsonschema2pojo")
public class Team {

    @JsonProperty("team_key")
    public String teamKey;
    @JsonProperty("team_name")
    public String teamName;
    @JsonProperty("team_badge")
    public String teamBadge;
    @JsonProperty("players")
    public List<Player> players = null;
    @JsonProperty("coaches")
    public List<Coach> coaches = null;

}