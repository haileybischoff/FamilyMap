package model;

import com.google.android.gms.maps.model.LatLng;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by haileybischoff on 12/14/17.
 */

public class Event {
    private String descendant;
    private String eventID;
    private String personID;
    private LatLng position;
    private String country;
    private String city;
    private String eventType;
    private String year;

    public Event(String descendant, String eventID, String personID, double latitude, double longitude, String country, String city, String eventType, String year) {
        this.descendant = descendant;
        this.eventID = eventID;
        this.personID = personID;
        this.position = new LatLng(latitude, longitude);
        this.country = country;
        this.city = city;
        this.eventType = eventType;
        this.year = year;
    }

    public static Event getEventInfo(JSONObject root) throws JSONException {
        String aDescendant = root.getString("descendant");
        String aEventID = root.getString("eventID");
        String aPersonID = root.getString("personID");
        double aLatitude = root.getDouble("latitude");
        double aLongitude = root.getDouble("longitude");
        String aCountry = root.getString("country");
        String aCity = root.getString("city");
        String aEventType = root.getString("eventType");
        String aYear = root.getString("year");

        Event newEvent = new Event(aDescendant, aEventID, aPersonID, aLatitude, aLongitude, aCountry, aCity, aEventType, aYear);

        return newEvent;
    }

    public String getDescendant() {
        return descendant;
    }

    public void setDescendant(String descendant) {
        this.descendant = descendant;
    }

    public String getEventID() {
        return eventID;
    }

    public void setEventID(String eventID) {
        this.eventID = eventID;
    }

    public String getPersonID() {
        return personID;
    }

    public void setPersonID(String personID) {
        this.personID = personID;
    }

    public LatLng getPosition() {
        return position;
    }

    public void setPosition(LatLng position) {
        this.position = position;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
