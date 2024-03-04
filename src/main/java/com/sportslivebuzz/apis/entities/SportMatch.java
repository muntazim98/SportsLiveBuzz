package com.sportslivebuzz.apis.entities;


import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "sports_matches")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SportMatch {
    
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int matchId;
private String teamHeading;
private String matchNumberVenue;
private String battingTeam;
private String battingTeamScore;
private String bowlingTeam;
private String bowlingTeamScore;
private String liveText;
private String matchLink;
private String textComplete;
private MatchStatus status;
private Date date=new Date();
// set the match status according to textComplete
public void setMatchStatus()
{
    this.status=textComplete.isBlank()?MatchStatus.LIVE:MatchStatus.COMPLETED;
}
}
