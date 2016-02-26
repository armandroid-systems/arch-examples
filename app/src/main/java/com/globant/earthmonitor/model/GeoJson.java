
package com.globant.earthmonitor.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeoJson implements Parcelable {


    private String type;
    private Metadata metadata;
    private List<Feature> features = new ArrayList<Feature>();
    private List<Double> bbox = new ArrayList<Double>();
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
     *     The metadata
     */
    public Metadata getMetadata() {
        return metadata;
    }

    /**
     * 
     * @param metadata
     *     The metadata
     */
    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    /**
     * 
     * @return
     *     The features
     */
    public List<Feature> getFeatures() {
        return features;
    }

    /**
     * 
     * @param features
     *     The features
     */
    public void setFeatures(List<Feature> features) {
        this.features = features;
    }

    /**
     * 
     * @return
     *     The bbox
     */
    public List<Double> getBbox() {
        return bbox;
    }

    /**
     * 
     * @param bbox
     *     The bbox
     */
    public void setBbox(List<Double> bbox) {
        this.bbox = bbox;
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
        dest.writeParcelable(this.metadata, 0);
        dest.writeTypedList(features);
        dest.writeList(this.bbox);
    }

    public GeoJson() {
    }

    protected GeoJson(Parcel in) {
        this.type = in.readString();
        this.metadata = in.readParcelable(Metadata.class.getClassLoader());
        this.features = in.createTypedArrayList(Feature.CREATOR);
        this.bbox = new ArrayList<Double>();
        in.readList(this.bbox, List.class.getClassLoader());
    }

    public static final Parcelable.Creator<GeoJson> CREATOR = new Parcelable.Creator<GeoJson>() {
        public GeoJson createFromParcel(Parcel source) {
            return new GeoJson(source);
        }

        public GeoJson[] newArray(int size) {
            return new GeoJson[size];
        }
    };
}
