package com.football.footballleague.service;

import com.football.footballleague.model.Competition;
import com.football.footballleague.model.Country;
import com.football.footballleague.model.Players;
import com.football.footballleague.model.teams.Coach;
import com.football.footballleague.model.teams.Player;
import com.football.footballleague.model.teams.Root;
import com.football.footballleague.model.teams.Team;
import org.springframework.boot.autoconfigure.cache.CacheProperties;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public interface LeagueService {

   public List<Country> getListOfData();

   public List<Competition> getListById();

   public List<Root> getTeamData();

   public List<Players> getPlayersData();

}
