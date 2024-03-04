package com.sportslivebuzz.apis.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sportslivebuzz.apis.entities.SportMatch;

public interface MatchRepository extends JpaRepository<SportMatch,Integer>{
    //to fetch the match by giving team Heading
    Optional<SportMatch> findByTeamHeading(String teamHeading);
}
