package com.football.footballleague.service;

import com.football.footballleague.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

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

    @Override
    public List<Country> getListOfData() {
        String url = baseUrl + apiKey;
        ResponseEntity<Country[]> restTemplateForEntity = restTemplate.getForEntity(url, Country[].class);
        if(!ObjectUtils.isEmpty(restTemplateForEntity)){
            Country[] body = restTemplateForEntity.getBody();
            return Arrays.asList(body);
        }
        return Collections.emptyList();
    }
}
