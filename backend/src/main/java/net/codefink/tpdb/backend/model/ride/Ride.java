package net.codefink.tpdb.backend.model.ride;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import net.codefink.tpdb.backend.model.Park;

import java.util.UUID;


@MappedSuperclass
public abstract class Ride {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;
  private String name;
  @ManyToOne
  private Park park;
  private String parkZone;
  private String category;

  private String manufacturer;
  private String status;
  private String latitude;
  private String longitude;
  private int funRating;
  private int thrillRating;
  private int themeRating;


  //Technical Data
  private String duration; //TODO needs Time Type for minutes
  private String capacity;
  private String restraint;
  private boolean hydraulicRestraint;

  //Safety restrictions
  private String lengthUnAccompanied;
  private String lengthAccompanied;
  private String lengthProhibited;


  //additional information
  private boolean fastPass;
  private boolean singleRider;
  private boolean presShow;
  private boolean testSeat;
  private String operatingPeriod;
  private boolean indoor;
  private boolean barrierFree;
  private boolean virtualReality;
  private boolean surcharge;
  private String backPackHandling;
  private boolean babySwitch;

  //Needs refactoring to subclasses

  //Technical Data



  //Train information
  private  boolean bigBoySeats;
  private String numberOfTrains;
  private String numberOfCarsPerTrain;
  private String numberOfRowsPerCar;
  private String seatsPerRow;



}
