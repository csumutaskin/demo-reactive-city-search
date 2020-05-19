package com.csumut.demo.reactivecitysearch.repo;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.csumut.demo.reactivecitysearch.model.City;

/**
 * Can be considered as data layer for City Database.
 * 
 * @author umut
 */
public class CityRepository
{
  private CityRepository()
  {
  }

  /**
   * Returns existing cities data.
   * 
   * @return existing cities data in alphabetical order wrt name field.
   */
  public static Set<City> getCityData()
  {
    return Stream.of(new City("Adana", 1), new City("Adiyaman", 2), new City("Afyon", 3), new City("Agri", 4), new City("Amasya", 5), new City("Ankara", 6), new City("Antalya", 7), new City("Artvin", 8), new City("Aydin", 9), new City("Balikesir", 10)).collect(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(City::getName, String.CASE_INSENSITIVE_ORDER))));
  }
}
