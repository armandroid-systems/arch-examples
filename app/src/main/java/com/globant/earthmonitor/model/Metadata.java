
package com.globant.earthmonitor.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;
import java.util.Map;

public class Metadata implements Parcelable {

    private long generated;
    private String url;
    private String title;
    private Integer status;
    private String api;
    private Integer count;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The generated
     */
    public long getGenerated() {
        return generated;
    }

    /**
     * 
     * @param generated
     *     The generated
     */
    public void setGenerated(long generated) {
        this.generated = generated;
    }

    /**
     * 
     * @return
     *     The url
     */
    public String getUrl() {
        return url;
    }

    /**
     * 
     * @param url
     *     The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 
     * @return
     *     The title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 
     * @return
     *     The status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 
     * @return
     *     The api
     */
    public String getApi() {
        return api;
    }

    /**
     * 
     * @param api
     *     The api
     */
    public void setApi(String api) {
        this.api = api;
    }

    /**
     * 
     * @return
     *     The count
     */
    public Integer getCount() {
        return count;
    }

    /**
     * 
     * @param count
     *     The count
     */
    public void setCount(Integer count) {
        this.count = count;
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
        dest.writeLong(this.generated);
        dest.writeString(this.url);
        dest.writeString(this.title);
        dest.writeValue(this.status);
        dest.writeString(this.api);
        dest.writeValue(this.count);
    }

    public Metadata() {
    }

    protected Metadata(Parcel in) {
        this.generated = in.readLong();
        this.url = in.readString();
        this.title = in.readString();
        this.status = (Integer) in.readValue(Integer.class.getClassLoader());
        this.api = in.readString();
        this.count = (Integer) in.readValue(Integer.class.getClassLoader());
    }

    public static final Parcelable.Creator<Metadata> CREATOR = new Parcelable.Creator<Metadata>() {
        public Metadata createFromParcel(Parcel source) {
            return new Metadata(source);
        }

        public Metadata[] newArray(int size) {
            return new Metadata[size];
        }
    };
}
