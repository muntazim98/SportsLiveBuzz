package com.sportslivebuzz.apis.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sportslivebuzz.apis.entities.SportMatch;
import com.sportslivebuzz.apis.services.MatchService;

import lombok.AllArgsConstructor;
import lombok.Data;
@RestController
@RequestMapping("/sportsmatch")
@Data
@AllArgsConstructor
public class MatchController {
    private MatchService _Service;

//get sportsLiveMAtches
@GetMapping("/live")
public ResponseEntity<List<SportMatch>> getAllLiveMatches()
{
    return new ResponseEntity<>(this._Service.getAllLiveSportsMatches(),HttpStatus.OK);
}
@GetMapping("/all")
public ResponseEntity<List<SportMatch>> getAllMatches()
{
    return new ResponseEntity<>(this._Service.getAllSportsMatches(),HttpStatus.OK);
}
}
