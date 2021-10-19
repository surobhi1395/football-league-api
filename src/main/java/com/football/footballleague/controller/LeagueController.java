package com.football.footballleague.controller;

import com.football.footballleague.model.Competition;
import com.football.footballleague.model.Country;
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

}
