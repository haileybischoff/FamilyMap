package model;

import com.google.android.gms.maps.model.Marker;

/**
 * Created by haileybischoff on 12/14/17.
 */

public class Filter {
    private String eventType;
    private String filterName;
    private String filterDescription;
    private boolean on;

    public Filter(String eventType, String filterName, String filterDescription) {
        this.eventType = eventType;
        this.filterName = filterName;
        this.filterDescription = filterDescription;
        on = true;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getFilterName() {
        return filterName;
    }

    public void setFilterName(String filterName) {
        this.filterName = filterName;
    }

    public String getFilterDescription() {
        return filterDescription;
    }

    public void setFilterDescription(String filterDescription) {
        this.filterDescription = filterDescription;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }
}
