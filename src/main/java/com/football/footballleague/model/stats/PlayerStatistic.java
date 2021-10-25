
package com.football.footballleague.model.stats;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "player_name",
    "player_key",
    "team_name",
    "player_number",
    "player_position",
    "player_is_captain",
    "player_is_subst",
    "player_shots_total",
    "player_shots_on_goal",
    "player_goals",
    "player_goals_conceded",
    "player_minus_goals",
    "player_assists",
    "player_offsides",
    "player_fouls_drawn",
    "player_fouls_commited",
    "player_tackles",
    "player_blocks",
    "player_total_crosses",
    "player_acc_crosses",
    "player_interceptions",
    "player_clearances",
    "player_dispossesed",
    "player_saves",
    "player_punches",
    "player_saves_inside_box",
    "player_duels_total",
    "player_duels_won",
    "player_aerials_won",
    "player_dribble_attempts",
    "player_dribble_succ",
    "player_dribbled_past",
    "player_yellowcards",
    "player_redcards",
    "player_pen_score",
    "player_pen_miss",
    "player_pen_save",
    "player_pen_committed",
    "player_pen_won",
    "player_hit_woodwork",
    "player_passes",
    "player_passes_acc",
    "player_key_passes",
    "player_minutes_played",
    "player_rating",
    "match_id"
})
@Generated("jsonschema2pojo")
public class PlayerStatistic {

    @JsonProperty("player_name")
    public String playerName;
    @JsonProperty("player_key")
    public String playerKey;
    @JsonProperty("team_name")
    public String teamName;
    @JsonProperty("player_number")
    public String playerNumber;
    @JsonProperty("player_position")
    public String playerPosition;
    @JsonProperty("player_is_captain")
    public String playerIsCaptain;
    @JsonProperty("player_is_subst")
    public String playerIsSubst;
    @JsonProperty("player_shots_total")
    public String playerShotsTotal;
    @JsonProperty("player_shots_on_goal")
    public String playerShotsOnGoal;
    @JsonProperty("player_goals")
    public String playerGoals;
    @JsonProperty("player_goals_conceded")
    public String playerGoalsConceded;
    @JsonProperty("player_minus_goals")
    public String playerMinusGoals;
    @JsonProperty("player_assists")
    public String playerAssists;
    @JsonProperty("player_offsides")
    public String playerOffsides;
    @JsonProperty("player_fouls_drawn")
    public String playerFoulsDrawn;
    @JsonProperty("player_fouls_commited")
    public String playerFoulsCommited;
    @JsonProperty("player_tackles")
    public String playerTackles;
    @JsonProperty("player_blocks")
    public String playerBlocks;
    @JsonProperty("player_total_crosses")
    public String playerTotalCrosses;
    @JsonProperty("player_acc_crosses")
    public String playerAccCrosses;
    @JsonProperty("player_interceptions")
    public String playerInterceptions;
    @JsonProperty("player_clearances")
    public String playerClearances;
    @JsonProperty("player_dispossesed")
    public String playerDispossesed;
    @JsonProperty("player_saves")
    public String playerSaves;
    @JsonProperty("player_punches")
    public String playerPunches;
    @JsonProperty("player_saves_inside_box")
    public String playerSavesInsideBox;
    @JsonProperty("player_duels_total")
    public String playerDuelsTotal;
    @JsonProperty("player_duels_won")
    public String playerDuelsWon;
    @JsonProperty("player_aerials_won")
    public String playerAerialsWon;
    @JsonProperty("player_dribble_attempts")
    public String playerDribbleAttempts;
    @JsonProperty("player_dribble_succ")
    public String playerDribbleSucc;
    @JsonProperty("player_dribbled_past")
    public String playerDribbledPast;
    @JsonProperty("player_yellowcards")
    public String playerYellowcards;
    @JsonProperty("player_redcards")
    public String playerRedcards;
    @JsonProperty("player_pen_score")
    public String playerPenScore;
    @JsonProperty("player_pen_miss")
    public String playerPenMiss;
    @JsonProperty("player_pen_save")
    public String playerPenSave;
    @JsonProperty("player_pen_committed")
    public String playerPenCommitted;
    @JsonProperty("player_pen_won")
    public String playerPenWon;
    @JsonProperty("player_hit_woodwork")
    public String playerHitWoodwork;
    @JsonProperty("player_passes")
    public String playerPasses;
    @JsonProperty("player_passes_acc")
    public String playerPassesAcc;
    @JsonProperty("player_key_passes")
    public String playerKeyPasses;
    @JsonProperty("player_minutes_played")
    public String playerMinutesPlayed;
    @JsonProperty("player_rating")
    public String playerRating;
    @JsonProperty("match_id")
    public String matchId;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PlayerStatistic.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("playerName");
        sb.append('=');
        sb.append(((this.playerName == null)?"<null>":this.playerName));
        sb.append(',');
        sb.append("playerKey");
        sb.append('=');
        sb.append(((this.playerKey == null)?"<null>":this.playerKey));
        sb.append(',');
        sb.append("teamName");
        sb.append('=');
        sb.append(((this.teamName == null)?"<null>":this.teamName));
        sb.append(',');
        sb.append("playerNumber");
        sb.append('=');
        sb.append(((this.playerNumber == null)?"<null>":this.playerNumber));
        sb.append(',');
        sb.append("playerPosition");
        sb.append('=');
        sb.append(((this.playerPosition == null)?"<null>":this.playerPosition));
        sb.append(',');
        sb.append("playerIsCaptain");
        sb.append('=');
        sb.append(((this.playerIsCaptain == null)?"<null>":this.playerIsCaptain));
        sb.append(',');
        sb.append("playerIsSubst");
        sb.append('=');
        sb.append(((this.playerIsSubst == null)?"<null>":this.playerIsSubst));
        sb.append(',');
        sb.append("playerShotsTotal");
        sb.append('=');
        sb.append(((this.playerShotsTotal == null)?"<null>":this.playerShotsTotal));
        sb.append(',');
        sb.append("playerShotsOnGoal");
        sb.append('=');
        sb.append(((this.playerShotsOnGoal == null)?"<null>":this.playerShotsOnGoal));
        sb.append(',');
        sb.append("playerGoals");
        sb.append('=');
        sb.append(((this.playerGoals == null)?"<null>":this.playerGoals));
        sb.append(',');
        sb.append("playerGoalsConceded");
        sb.append('=');
        sb.append(((this.playerGoalsConceded == null)?"<null>":this.playerGoalsConceded));
        sb.append(',');
        sb.append("playerMinusGoals");
        sb.append('=');
        sb.append(((this.playerMinusGoals == null)?"<null>":this.playerMinusGoals));
        sb.append(',');
        sb.append("playerAssists");
        sb.append('=');
        sb.append(((this.playerAssists == null)?"<null>":this.playerAssists));
        sb.append(',');
        sb.append("playerOffsides");
        sb.append('=');
        sb.append(((this.playerOffsides == null)?"<null>":this.playerOffsides));
        sb.append(',');
        sb.append("playerFoulsDrawn");
        sb.append('=');
        sb.append(((this.playerFoulsDrawn == null)?"<null>":this.playerFoulsDrawn));
        sb.append(',');
        sb.append("playerFoulsCommited");
        sb.append('=');
        sb.append(((this.playerFoulsCommited == null)?"<null>":this.playerFoulsCommited));
        sb.append(',');
        sb.append("playerTackles");
        sb.append('=');
        sb.append(((this.playerTackles == null)?"<null>":this.playerTackles));
        sb.append(',');
        sb.append("playerBlocks");
        sb.append('=');
        sb.append(((this.playerBlocks == null)?"<null>":this.playerBlocks));
        sb.append(',');
        sb.append("playerTotalCrosses");
        sb.append('=');
        sb.append(((this.playerTotalCrosses == null)?"<null>":this.playerTotalCrosses));
        sb.append(',');
        sb.append("playerAccCrosses");
        sb.append('=');
        sb.append(((this.playerAccCrosses == null)?"<null>":this.playerAccCrosses));
        sb.append(',');
        sb.append("playerInterceptions");
        sb.append('=');
        sb.append(((this.playerInterceptions == null)?"<null>":this.playerInterceptions));
        sb.append(',');
        sb.append("playerClearances");
        sb.append('=');
        sb.append(((this.playerClearances == null)?"<null>":this.playerClearances));
        sb.append(',');
        sb.append("playerDispossesed");
        sb.append('=');
        sb.append(((this.playerDispossesed == null)?"<null>":this.playerDispossesed));
        sb.append(',');
        sb.append("playerSaves");
        sb.append('=');
        sb.append(((this.playerSaves == null)?"<null>":this.playerSaves));
        sb.append(',');
        sb.append("playerPunches");
        sb.append('=');
        sb.append(((this.playerPunches == null)?"<null>":this.playerPunches));
        sb.append(',');
        sb.append("playerSavesInsideBox");
        sb.append('=');
        sb.append(((this.playerSavesInsideBox == null)?"<null>":this.playerSavesInsideBox));
        sb.append(',');
        sb.append("playerDuelsTotal");
        sb.append('=');
        sb.append(((this.playerDuelsTotal == null)?"<null>":this.playerDuelsTotal));
        sb.append(',');
        sb.append("playerDuelsWon");
        sb.append('=');
        sb.append(((this.playerDuelsWon == null)?"<null>":this.playerDuelsWon));
        sb.append(',');
        sb.append("playerAerialsWon");
        sb.append('=');
        sb.append(((this.playerAerialsWon == null)?"<null>":this.playerAerialsWon));
        sb.append(',');
        sb.append("playerDribbleAttempts");
        sb.append('=');
        sb.append(((this.playerDribbleAttempts == null)?"<null>":this.playerDribbleAttempts));
        sb.append(',');
        sb.append("playerDribbleSucc");
        sb.append('=');
        sb.append(((this.playerDribbleSucc == null)?"<null>":this.playerDribbleSucc));
        sb.append(',');
        sb.append("playerDribbledPast");
        sb.append('=');
        sb.append(((this.playerDribbledPast == null)?"<null>":this.playerDribbledPast));
        sb.append(',');
        sb.append("playerYellowcards");
        sb.append('=');
        sb.append(((this.playerYellowcards == null)?"<null>":this.playerYellowcards));
        sb.append(',');
        sb.append("playerRedcards");
        sb.append('=');
        sb.append(((this.playerRedcards == null)?"<null>":this.playerRedcards));
        sb.append(',');
        sb.append("playerPenScore");
        sb.append('=');
        sb.append(((this.playerPenScore == null)?"<null>":this.playerPenScore));
        sb.append(',');
        sb.append("playerPenMiss");
        sb.append('=');
        sb.append(((this.playerPenMiss == null)?"<null>":this.playerPenMiss));
        sb.append(',');
        sb.append("playerPenSave");
        sb.append('=');
        sb.append(((this.playerPenSave == null)?"<null>":this.playerPenSave));
        sb.append(',');
        sb.append("playerPenCommitted");
        sb.append('=');
        sb.append(((this.playerPenCommitted == null)?"<null>":this.playerPenCommitted));
        sb.append(',');
        sb.append("playerPenWon");
        sb.append('=');
        sb.append(((this.playerPenWon == null)?"<null>":this.playerPenWon));
        sb.append(',');
        sb.append("playerHitWoodwork");
        sb.append('=');
        sb.append(((this.playerHitWoodwork == null)?"<null>":this.playerHitWoodwork));
        sb.append(',');
        sb.append("playerPasses");
        sb.append('=');
        sb.append(((this.playerPasses == null)?"<null>":this.playerPasses));
        sb.append(',');
        sb.append("playerPassesAcc");
        sb.append('=');
        sb.append(((this.playerPassesAcc == null)?"<null>":this.playerPassesAcc));
        sb.append(',');
        sb.append("playerKeyPasses");
        sb.append('=');
        sb.append(((this.playerKeyPasses == null)?"<null>":this.playerKeyPasses));
        sb.append(',');
        sb.append("playerMinutesPlayed");
        sb.append('=');
        sb.append(((this.playerMinutesPlayed == null)?"<null>":this.playerMinutesPlayed));
        sb.append(',');
        sb.append("playerRating");
        sb.append('=');
        sb.append(((this.playerRating == null)?"<null>":this.playerRating));
        sb.append(',');
        sb.append("matchId");
        sb.append('=');
        sb.append(((this.matchId == null)?"<null>":this.matchId));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
