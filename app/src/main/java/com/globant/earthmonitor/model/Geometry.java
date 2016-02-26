
package com.globant.earthmonitor.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Geometry implements Parcelable {

    private String type;
    private List<Double> coordinates = new ArrayList<Double>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The type
     */
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 
     * @return
     *     The coordinates
     */
    public List<Double> getCoordinates() {
        return coordinates;
    }

    /**
     * 
     * @param coordinates
     *     The coordinates
     */
    public void setCoordinates(List<Double> coordinates) {
        this.coordinates = coordinates;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.type);
        dest.writeList(this.coordinates);
    }

    public Geometry() {
    }

    protected Geometry(Parcel in) {
        this.type = in.readString();
        this.coordinates = new ArrayList<Double>();
        in.readList(this.coordinates, List.class.getClassLoader());
    }

    public static final Parcelable.Creator<Geometry> CREATOR = new Parcelable.Creator<Geometry>() {
        public Geometry createFromParcel(Parcel source) {
            return new Geometry(source);
        }

        public Geometry[] newArray(int size) {
            return new Geometry[size];
        }
    };
}
