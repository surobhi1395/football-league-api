package com.football.footballleague.model.teams;

import lombok.Data;

import java.util.List;

@Data
public class Root{
    public String team_key;
    public String team_name;
    public String team_badge;
    public List<Player> players;
    public List<Coach> coaches;
}