package com.csumut.demo.reactivecitysearch.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csumut.demo.reactivecitysearch.dao.CityDao;
import com.csumut.demo.reactivecitysearch.model.City;
import com.csumut.demo.reactivecitysearch.validator.UserInputValidator;

import reactor.core.publisher.Flux;

/**
 * City service methods reside here.
 * 
 * @author umut
 */
@Service
public class CityService
{
  @Autowired
  private CityDao cityDao;

  @Autowired
  private UserInputValidator userInputValidator;

  /**
   * Get cities in between strings given as parameters.
   * 
   * @param  fromString starting string (included boundary)
   * @param  toString   ending string (excluded boundary)
   * @return            city stream that match the criteria
   */
  public Flux<City> getCities(String fromString, String toString)
  {
    userInputValidator.validateUserInput(fromString, toString);
    return cityDao.getCities(fromString, toString);
  }
}
