
package com.globant.earthmonitor.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;
import java.util.Map;

public class Feature implements Parcelable {

    private String type;
    private Properties properties;
    private Geometry geometry;
    private String id;
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
     *     The properties
     */
    public Properties getProperties() {
        return properties;
    }

    /**
     * 
     * @param properties
     *     The properties
     */
    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    /**
     * 
     * @return
     *     The geometry
     */
    public Geometry getGeometry() {
        return geometry;
    }

    /**
     * 
     * @param geometry
     *     The geometry
     */
    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }

    /**
     * 
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
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
        dest.writeParcelable(this.properties, flags);
        dest.writeParcelable(this.geometry, flags);
        dest.writeString(this.id);
    }

    public Feature() {
    }

    protected Feature(Parcel in) {
        this.type = in.readString();
        this.properties = in.readParcelable(Properties.class.getClassLoader());
        this.geometry = in.readParcelable(Geometry.class.getClassLoader());
        this.id = in.readString();
    }

    public static final Parcelable.Creator<Feature> CREATOR = new Parcelable.Creator<Feature>() {
        public Feature createFromParcel(Parcel source) {
            return new Feature(source);
        }

        public Feature[] newArray(int size) {
            return new Feature[size];
        }
    };
}
