package com.csumut.demo.reactivecitysearch.dao;

import java.time.Duration;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.stereotype.Repository;

import com.csumut.demo.reactivecitysearch.model.City;
import com.csumut.demo.reactivecitysearch.repo.CityRepository;

import reactor.core.publisher.Flux;

/**
 * City data retrieval methods reside here.
 * 
 * @author umut
 */
@Repository
public class CityDao
{
  /**
   * Returns Flux Object of cities whose names are in between fromString (included) and toString (excluded)
   * 
   * @param  fromString starting string (included boundary)
   * @param  toString   ending string (excluded boundary)
   * @return            Flux Object of cities that matches the given criteria.
   */
  public Flux<City> getCities(String fromString, String toString)
  {
    TreeSet<City> cities = (TreeSet<City>) CityRepository.getCityData();
    Set<City> userWishSet = cities.subSet(new City(fromString, -1), new City(toString, -1));
    return Flux.fromIterable(userWishSet).delaySequence(Duration.ofMillis(200l));
  }
}
