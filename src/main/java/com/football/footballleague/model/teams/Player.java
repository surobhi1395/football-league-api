package com.football.footballleague.model.teams;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import javax.annotation.Generated;
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "player_key",
        "player_id",
        "player_image",
        "player_name",
        "player_number",
        "player_country",
        "player_type",
        "player_age",
        "player_match_played",
        "player_goals",
        "player_yellow_cards",
        "player_red_cards",
        "player_injured",
        "player_substitute_out",
        "player_substitutes_on_bench",
        "player_assists",
        "player_is_captain",
        "player_shots_total",
        "player_goals_conceded",
        "player_fouls_committed",
        "player_tackles",
        "player_blocks",
        "player_crosses_total",
        "player_interceptions",
        "player_clearances",
        "player_dispossesed",
        "player_saves",
        "player_inside_box_saves",
        "player_duels_total",
        "player_duels_won",
        "player_dribble_attempts",
        "player_dribble_succ",
        "player_pen_comm",
        "player_pen_won",
        "player_pen_scored",
        "player_pen_missed",
        "player_passes",
        "player_passes_accuracy",
        "player_key_passes",
        "player_woordworks",
        "player_rating"
})
@Generated("jsonschema2pojo")
public class Player {

    @JsonProperty("player_key")
    public Long playerKey;
    @JsonProperty("player_id")
    public String playerId;
    @JsonProperty("player_image")
    public String playerImage;
    @JsonProperty("player_name")
    public String playerName;
    @JsonProperty("player_number")
    public String playerNumber;
    @JsonProperty("player_country")
    public String playerCountry;
    @JsonProperty("player_type")
    public String playerType;
    @JsonProperty("player_age")
    public String playerAge;
    @JsonProperty("player_match_played")
    public String playerMatchPlayed;
    @JsonProperty("player_goals")
    public String playerGoals;
    @JsonProperty("player_yellow_cards")
    public String playerYellowCards;
    @JsonProperty("player_red_cards")
    public String playerRedCards;
    @JsonProperty("player_injured")
    public String playerInjured;
    @JsonProperty("player_substitute_out")
    public String playerSubstituteOut;
    @JsonProperty("player_substitutes_on_bench")
    public String playerSubstitutesOnBench;
    @JsonProperty("player_assists")
    public String playerAssists;
    @JsonProperty("player_is_captain")
    public String playerIsCaptain;
    @JsonProperty("player_shots_total")
    public String playerShotsTotal;
    @JsonProperty("player_goals_conceded")
    public String playerGoalsConceded;
    @JsonProperty("player_fouls_committed")
    public String playerFoulsCommitted;
    @JsonProperty("player_tackles")
    public String playerTackles;
    @JsonProperty("player_blocks")
    public String playerBlocks;
    @JsonProperty("player_crosses_total")
    public String playerCrossesTotal;
    @JsonProperty("player_interceptions")
    public String playerInterceptions;
    @JsonProperty("player_clearances")
    public String playerClearances;
    @JsonProperty("player_dispossesed")
    public String playerDispossesed;
    @JsonProperty("player_saves")
    public String playerSaves;
    @JsonProperty("player_inside_box_saves")
    public String playerInsideBoxSaves;
    @JsonProperty("player_duels_total")
    public String playerDuelsTotal;
    @JsonProperty("player_duels_won")
    public String playerDuelsWon;
    @JsonProperty("player_dribble_attempts")
    public String playerDribbleAttempts;
    @JsonProperty("player_dribble_succ")
    public String playerDribbleSucc;
    @JsonProperty("player_pen_comm")
    public String playerPenComm;
    @JsonProperty("player_pen_won")
    public String playerPenWon;
    @JsonProperty("player_pen_scored")
    public String playerPenScored;
    @JsonProperty("player_pen_missed")
    public String playerPenMissed;
    @JsonProperty("player_passes")
    public String playerPasses;
    @JsonProperty("player_passes_accuracy")
    public String playerPassesAccuracy;
    @JsonProperty("player_key_passes")
    public String playerKeyPasses;
    @JsonProperty("player_woordworks")
    public String playerWoordworks;
    @JsonProperty("player_rating")
    public String playerRating;

}