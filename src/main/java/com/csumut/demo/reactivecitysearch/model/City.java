package com.csumut.demo.reactivecitysearch.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * Sample city model.
 * 
 * @author umut
 */
public class City
{
  private String name;
  private int carLicensePlateNumber;

  public City(String name, int carLicensePlateNumber)
  {
    this.name = name;
    this.carLicensePlateNumber = carLicensePlateNumber;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public int getCarLicensePlateNumber()
  {
    return carLicensePlateNumber;
  }

  public void setCarLicensePlateNumber(int carLicensePlateNumber)
  {
    this.carLicensePlateNumber = carLicensePlateNumber;
  }

  @Override
  public int hashCode()
  {
    return new HashCodeBuilder().append(this.carLicensePlateNumber).append(this.name).toHashCode();
  }

  @Override
  public boolean equals(Object toCompare)
  {
    if (!(toCompare instanceof City))
    {
      return false;
    }
    if (this == toCompare)
    {
      return true;
    }
    City second = (City) toCompare;
    return new EqualsBuilder().append(this.carLicensePlateNumber, second.getCarLicensePlateNumber()).append(this.name, second.getName()).isEquals();
  }
}
