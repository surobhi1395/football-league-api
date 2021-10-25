package com.football.footballleague.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import javax.annotation.Generated;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "country_name",
        "league_id",
        "league_name",
        "team_id",
        "team_name",
        "overall_promotion",
        "overall_league_position",
        "overall_league_payed",
        "overall_league_W",
        "overall_league_D",
        "overall_league_L",
        "overall_league_GF",
        "overall_league_GA",
        "overall_league_PTS",
        "home_league_position",
        "home_promotion",
        "home_league_payed",
        "home_league_W",
        "home_league_D",
        "home_league_L",
        "home_league_GF",
        "home_league_GA",
        "home_league_PTS",
        "away_league_position",
        "away_promotion",
        "away_league_payed",
        "away_league_W",
        "away_league_D",
        "away_league_L",
        "away_league_GF",
        "away_league_GA",
        "away_league_PTS",
        "league_round",
        "team_badge",
        "fk_stage_key",
        "stage_name"
})
@Generated("jsonschema2pojo")
public class Standing {

    @JsonProperty("country_name")
    public String countryName;
    @JsonProperty("league_id")
    public String leagueId;
    @JsonProperty("league_name")
    public String leagueName;
    @JsonProperty("team_id")
    public String teamId;
    @JsonProperty("team_name")
    public String teamName;
    @JsonProperty("overall_promotion")
    public String overallPromotion;
    @JsonProperty("overall_league_position")
    public String overallLeaguePosition;
    @JsonProperty("overall_league_payed")
    public String overallLeaguePayed;
    @JsonProperty("overall_league_W")
    public String overallLeagueW;
    @JsonProperty("overall_league_D")
    public String overallLeagueD;
    @JsonProperty("overall_league_L")
    public String overallLeagueL;
    @JsonProperty("overall_league_GF")
    public String overallLeagueGF;
    @JsonProperty("overall_league_GA")
    public String overallLeagueGA;
    @JsonProperty("overall_league_PTS")
    public String overallLeaguePTS;
    @JsonProperty("home_league_position")
    public String homeLeaguePosition;
    @JsonProperty("home_promotion")
    public String homePromotion;
    @JsonProperty("home_league_payed")
    public String homeLeaguePayed;
    @JsonProperty("home_league_W")
    public String homeLeagueW;
    @JsonProperty("home_league_D")
    public String homeLeagueD;
    @JsonProperty("home_league_L")
    public String homeLeagueL;
    @JsonProperty("home_league_GF")
    public String homeLeagueGF;
    @JsonProperty("home_league_GA")
    public String homeLeagueGA;
    @JsonProperty("home_league_PTS")
    public String homeLeaguePTS;
    @JsonProperty("away_league_position")
    public String awayLeaguePosition;
    @JsonProperty("away_promotion")
    public String awayPromotion;
    @JsonProperty("away_league_payed")
    public String awayLeaguePayed;
    @JsonProperty("away_league_W")
    public String awayLeagueW;
    @JsonProperty("away_league_D")
    public String awayLeagueD;
    @JsonProperty("away_league_L")
    public String awayLeagueL;
    @JsonProperty("away_league_GF")
    public String awayLeagueGF;
    @JsonProperty("away_league_GA")
    public String awayLeagueGA;
    @JsonProperty("away_league_PTS")
    public String awayLeaguePTS;
    @JsonProperty("league_round")
    public String leagueRound;
    @JsonProperty("team_badge")
    public String teamBadge;
    @JsonProperty("fk_stage_key")
    public String fkStageKey;
    @JsonProperty("stage_name")
    public String stageName;

}