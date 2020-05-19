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
    return Stream.of(new City("Adana", 1), new City("Adiyaman", 2), new City("Afyon", 3), new City("Agri", 4), new City("Amasya", 5), new City("Ankara", 6), new City("Antalya", 7), new City("Artvin", 8), new City("Aydin", 9), new City("Balikesir", 10), new City("Bilecik", 11), new City("Bingol", 12), new City("Bitlis", 13), new City("Bolu", 14), new City("Burdur", 15), new City("Bursa", 16),
        new City("Canakkale", 17), new City("Cankiri", 18), new City("Corum", 19), new City("Denizli", 20), new City("Diyarbakir", 21), new City("Edirne", 22), new City("Elazig", 23), new City("Erzincan", 24), new City("Erzurum", 25), new City("Eskisehir", 26), new City("Gaziantep", 27), new City("Giresun", 28), new City("Gumushane", 29), new City("Hakkari", 30), new City("Hatay", 31),
        new City("Isparta", 32), new City("Icel", 33), new City("Istanbul", 34), new City("Izmir", 35), new City("Kars", 36), new City("Kastamonu", 37), new City("Kayseri", 38), new City("Kirklareli", 39), new City("Kirsehir", 40), new City("Kocaeli", 41), new City("Konya", 42), new City("Kutahya", 43), new City("Malatya", 44), new City("Manisa", 45), new City("Kahramanmaras", 46),
        new City("Mardin", 47), new City("Mugla", 48), new City("Mus", 49), new City("Nevsehir", 50), new City("Nigde", 51), new City("Ordu", 52), new City("Rize", 53), new City("Sakarya", 54), new City("Samsun", 55), new City("Siirt", 56), new City("Sinop", 57), new City("Sivas", 58), new City("Tekirdag", 59), new City("Tokat", 60), new City("Trabzon", 61), new City("Tunceli", 62),
        new City("Sanliurfa", 63), new City("Usak", 64), new City("Van", 65), new City("Yozgat", 66), new City("Zonguldak", 67), new City("Aksaray", 68), new City("Bayburt", 69), new City("Karaman", 70), new City("Kirikkale", 71), new City("Batman", 72), new City("Sirnak", 73), new City("Bartin", 74), new City("Ardahan", 75), new City("Igdir", 76), new City("Yalova", 77), new City("Karabuk", 78),
        new City("Kilis", 79), new City("Osmaniye", 80), new City("Duzce", 81)).collect(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(City::getName, String.CASE_INSENSITIVE_ORDER))));
  }
}
