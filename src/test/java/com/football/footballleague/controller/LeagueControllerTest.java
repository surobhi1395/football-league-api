package com.football.footballleague.controller;

import static org.mockito.Mockito.when;

import com.football.footballleague.model.Competition;
import com.football.footballleague.model.Country;
import com.football.footballleague.model.Standing;
import com.football.footballleague.model.teams.Root;
import com.football.footballleague.service.LeagueService;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@ContextConfiguration(classes = {LeagueController.class})
@ExtendWith(SpringExtension.class)
class LeagueControllerTest {
    @Autowired
    private LeagueController leagueController;

    @MockBean
    private LeagueService leagueService;

    @Test
    void testGetDataById() throws Exception {
        when(this.leagueService.getListById()).thenReturn(new ArrayList<Competition>());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/listById");
        MockMvcBuilders.standaloneSetup(this.leagueController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    @Test
    void testGetList() throws Exception {
        when(this.leagueService.getListOfData()).thenReturn(new ArrayList<Country>());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/getList");
        MockMvcBuilders.standaloneSetup(this.leagueController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    @Test
    void testGetStandingList() throws Exception {
        when(this.leagueService.getStandings()).thenReturn(new ArrayList<Standing>());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/getStandings");
        MockMvcBuilders.standaloneSetup(this.leagueController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    @Test
    void testGetTeamList() throws Exception {
        when(this.leagueService.getTeamData()).thenReturn(new ArrayList<Root>());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/getTeams");
        MockMvcBuilders.standaloneSetup(this.leagueController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }
}

