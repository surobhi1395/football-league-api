package com.football.footballleague.service;

import com.football.footballleague.model.Competition;
import com.football.footballleague.model.Country;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public interface LeagueService {

   public List<Country> getListOfData();

   public List<Competition> getListById();

}
