package com.sportslivebuzz.apis.services;
import java.util.List;
import java.util.Map;

import com.sportslivebuzz.apis.entities.SportMatch;

public interface MatchService {
    //get all sportmatches
    List<SportMatch> getAllSportsMatches();
    //get all live sportsmatches
    List<SportMatch> getAllLiveSportsMatches();
    //get tournament pointTable
    List<Map<String,String>> getPointsTable();
}
