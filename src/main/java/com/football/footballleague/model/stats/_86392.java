
package com.football.footballleague.model.stats;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "statistics",
    "statistics_1half",
    "player_statistics"
})
@Generated("jsonschema2pojo")
public class _86392 {

    @JsonProperty("statistics")
    public List<Statistic> statistics = null;
    @JsonProperty("statistics_1half")
    public List<Object> statistics1half = null;
    @JsonProperty("player_statistics")
    public List<PlayerStatistic> playerStatistics = null;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(_86392 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("statistics");
        sb.append('=');
        sb.append(((this.statistics == null)?"<null>":this.statistics));
        sb.append(',');
        sb.append("statistics1half");
        sb.append('=');
        sb.append(((this.statistics1half == null)?"<null>":this.statistics1half));
        sb.append(',');
        sb.append("playerStatistics");
        sb.append('=');
        sb.append(((this.playerStatistics == null)?"<null>":this.playerStatistics));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
