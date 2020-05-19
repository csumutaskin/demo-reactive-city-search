package com.csumut.demo.reactivecitysearch.validator;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

/**
 * Validator class for city searching on name column alphabetically.
 * 
 * @author umut
 */
@Component
public class UserInputValidator
{
  /**
   * Validates given parameters in order to make a healthy city name search.
   * 
   * @param  fromString               starting prefix string of search utility.
   * @param  toString                 ending prefix string of search utility.
   * @return                          true if given input is appropriate.
   * @throws IllegalArgumentException for inappropriate parameters
   */
  public boolean validateUserInput(String fromString, String toString)
  {
    if (StringUtils.isBlank(fromString))
    {
      throw new IllegalArgumentException("City search starting index can not be null or empty string.");
    }
    if (toString != null && fromString.compareTo(toString) > 0)
    {
      throw new IllegalArgumentException("Search begin index can not be lexicographically greater than search end index.");
    }
    return true;
  }
}
