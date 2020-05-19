package com.csumut.demo.reactivecitysearch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.csumut.demo.reactivecitysearch.model.City;
import com.csumut.demo.reactivecitysearch.service.CityService;

import reactor.core.publisher.Flux;

/**
 * Rest Controller for city operations. Only read rest end points exist for demo purposes.
 * 
 * @author umut
 */
@RestController
@RequestMapping(value = "/city", produces = MediaType.APPLICATION_STREAM_JSON_VALUE)
@ResponseBody
public class CityController
{
  @Autowired
  private CityService cityService;

  /**
   * Returns cities between given user Strings (alphabetical order)
   * 
   * @param  fromString city names starting from (included)
   * @param  toString   city names to (excluded)
   * @return            stream of cities that match the given user criteria.
   */
  @GetMapping(value = "/getBetween/{fromString}/{toString}")
  public Flux<City> getCitiesBetweenLetters(@PathVariable(value = "fromString") String fromString, @PathVariable("toString") String toString)
  {
    return cityService.getCities(fromString, toString);
  }
}
