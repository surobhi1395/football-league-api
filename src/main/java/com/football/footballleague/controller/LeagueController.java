package com.football.footballleague.controller;

import com.football.footballleague.model.Competition;
import com.football.footballleague.model.Country;
import com.football.footballleague.model.Players;
import com.football.footballleague.model.Standing;
import com.football.footballleague.model.lineups.Lineups;
import com.football.footballleague.model.stats.Statistics;
import com.football.footballleague.model.teams.Coach;
import com.football.footballleague.model.teams.Player;
import com.football.footballleague.model.teams.Root;
import com.football.footballleague.model.teams.Team;
import com.football.footballleague.service.LeagueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LeagueController {

   @Autowired
   private LeagueService leagueService;

   @GetMapping("/getList")
   public List<Country> getList(){
      return leagueService.getListOfData();
   }

   @GetMapping("/listById")
   public List<Competition> getDataById(){
      return leagueService.getListById();
   }

   @GetMapping("/getTeams")
   public List<Root> getTeamList(){
      return leagueService.getTeamData();
   }

   @GetMapping("/getPlayer")
   public List<Players> getPlayersDetail(){
      return leagueService.getPlayersData();
   }

   @GetMapping("/getStandings")
   public List<Standing> getStandingList(){
      return leagueService.getStandings();
   }

   @GetMapping("/getLineUp")
   public Lineups getLineUpDetails(){
      return leagueService.getLineUps();
   }

   @GetMapping("/getStats")
   public Statistics getStats(){
      return leagueService.getStatsDetails();
   }

}
