package com.football.footballleague.service;

import com.football.footballleague.model.Competition;
import com.football.footballleague.model.Country;
import com.football.footballleague.model.Players;
import com.football.footballleague.model.Standing;
import com.football.footballleague.model.lineups.Lineups;
import com.football.footballleague.model.stats.Statistics;
import com.football.footballleague.model.teams.Coach;
import com.football.footballleague.model.teams.Root;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class LeagueServiceImpl implements LeagueService{

    private RestTemplate restTemplate;

    @Autowired
    public LeagueServiceImpl(RestTemplate restTemplate){
        this.restTemplate=restTemplate;
    }

    @Value("${api.league.base.url}")
    private String baseUrl;

    @Value("${api.league.key}")
    private String apiKey;
    
    @Value("${api.league.competition.base.url}")
    private String competitionBaseUrl;

    @Value("${api.league.teams.base.url}")
    private String teamBaseUrl;

    @Value("${api.league.players.base.url}")
    private String playersBaseUrl;

    @Value("${api.league.standing.base.url}")
    private String standingBaseUrl;

    @Value("${api.league.lineup.base.url}")
    private String lineUpBaseUrl;

    @Value("${api.league.statistics.base.url}")
    private String statsBaseUrl;

    @Override
    public List<Country> getListOfData() {
        String url = baseUrl + apiKey;
        ResponseEntity<Country[]> restTemplateForEntity =
                restTemplate.getForEntity(url, Country[].class);
        if(!ObjectUtils.isEmpty(restTemplateForEntity)){
            Country[] body = restTemplateForEntity.getBody();
            return Arrays.asList(body);
        }
        return Collections.emptyList();
    }

    @Override
    public List<Competition> getListById() {
        String url = competitionBaseUrl + apiKey;
        ResponseEntity<Competition[]> restTemplateForEntity =
                restTemplate.getForEntity(url, Competition[].class);
        if(!ObjectUtils.isEmpty(restTemplateForEntity)){
            Competition[] body = restTemplateForEntity.getBody();
            return Arrays.asList(body);
        }
        return Collections.emptyList();
    }

    @Override
    public List<Root> getTeamData() {
        String url = teamBaseUrl + apiKey;
        ResponseEntity<Root[]> restTemplateForEntity =
                restTemplate.getForEntity(url, Root[].class);
        if(!ObjectUtils.isEmpty(restTemplateForEntity)) {
            Root[] roots = restTemplateForEntity.getBody();
            return Arrays.asList(roots);
        }
        return Collections.emptyList();
    }

    @Override
    public List<Players> getPlayersData() {
        String url = playersBaseUrl + apiKey;
        ResponseEntity<Players[]> responseEntity =
                restTemplate.getForEntity(url, Players[].class);

        if(!ObjectUtils.isEmpty(responseEntity)){
            Players[] players = responseEntity.getBody();
            return Arrays.asList(players);
        }
        return Collections.emptyList();
    }

    @Override
    public List<Standing> getStandings() {
        String url = standingBaseUrl + apiKey;
        ResponseEntity<Standing[]> responseEntity =
                restTemplate.getForEntity(url, Standing[].class);

        if (!ObjectUtils.isEmpty(responseEntity)) {
            Standing[] standings = responseEntity.getBody();
            return Arrays.asList(standings);
        }
        return Collections.emptyList();
    }

    @Override
    public Lineups getLineUps() {
        String url = lineUpBaseUrl + apiKey;
        ResponseEntity<Lineups> responseEntity =
                restTemplate.getForEntity(url, Lineups.class);
        if (!ObjectUtils.isEmpty(responseEntity)) {
            Lineups lineups = responseEntity.getBody();
            return lineups;
        }
        return null;
    }

    @Override
    public Statistics getStatsDetails() {
    String url = statsBaseUrl + apiKey;
        ResponseEntity<Statistics> responseEntity =
                restTemplate.getForEntity(url, Statistics.class);
        if (!ObjectUtils.isEmpty(responseEntity)) {
            Statistics statistics = responseEntity.getBody();
            return statistics;
        }
        return null;
    }


}
