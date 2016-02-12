
package com.globant.earthmonitor.model;

import java.util.HashMap;
import java.util.Map;

public class Properties {

    private Double mag;
    private String place;
    private long time;
    private long updated;
    private Integer tz;
    private String url;
    private String detail;
    private Object felt;
    private Object cdi;
    private Object mmi;
    private Object alert;
    private String status;
    private Integer tsunami;
    private Integer sig;
    private String net;
    private String code;
    private String ids;
    private String sources;
    private String types;
    private Integer nst;
    private Double dmin;
    private Double rms;
    private double gap;
    private String magType;
    private String type;
    private String title;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The mag
     */
    public Double getMag() {
        return mag;
    }

    /**
     * 
     * @param mag
     *     The mag
     */
    public void setMag(Double mag) {
        this.mag = mag;
    }

    /**
     * 
     * @return
     *     The place
     */
    public String getPlace() {
        return place;
    }

    /**
     * 
     * @param place
     *     The place
     */
    public void setPlace(String place) {
        this.place = place;
    }

    /**
     * 
     * @return
     *     The time
     */
    public long getTime() {
        return time;
    }

    /**
     * 
     * @param time
     *     The time
     */
    public void setTime(long time) {
        this.time = time;
    }

    /**
     * 
     * @return
     *     The updated
     */
    public long getUpdated() {
        return updated;
    }

    /**
     * 
     * @param updated
     *     The updated
     */
    public void setUpdated(long updated) {
        this.updated = updated;
    }

    /**
     * 
     * @return
     *     The tz
     */
    public Integer getTz() {
        return tz;
    }

    /**
     * 
     * @param tz
     *     The tz
     */
    public void setTz(Integer tz) {
        this.tz = tz;
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
     *     The detail
     */
    public String getDetail() {
        return detail;
    }

    /**
     * 
     * @param detail
     *     The detail
     */
    public void setDetail(String detail) {
        this.detail = detail;
    }

    /**
     * 
     * @return
     *     The felt
     */
    public Object getFelt() {
        return felt;
    }

    /**
     * 
     * @param felt
     *     The felt
     */
    public void setFelt(Object felt) {
        this.felt = felt;
    }

    /**
     * 
     * @return
     *     The cdi
     */
    public Object getCdi() {
        return cdi;
    }

    /**
     * 
     * @param cdi
     *     The cdi
     */
    public void setCdi(Object cdi) {
        this.cdi = cdi;
    }

    /**
     * 
     * @return
     *     The mmi
     */
    public Object getMmi() {
        return mmi;
    }

    /**
     * 
     * @param mmi
     *     The mmi
     */
    public void setMmi(Object mmi) {
        this.mmi = mmi;
    }

    /**
     * 
     * @return
     *     The alert
     */
    public Object getAlert() {
        return alert;
    }

    /**
     * 
     * @param alert
     *     The alert
     */
    public void setAlert(Object alert) {
        this.alert = alert;
    }

    /**
     * 
     * @return
     *     The status
     */
    public String getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 
     * @return
     *     The tsunami
     */
    public Integer getTsunami() {
        return tsunami;
    }

    /**
     * 
     * @param tsunami
     *     The tsunami
     */
    public void setTsunami(Integer tsunami) {
        this.tsunami = tsunami;
    }

    /**
     * 
     * @return
     *     The sig
     */
    public Integer getSig() {
        return sig;
    }

    /**
     * 
     * @param sig
     *     The sig
     */
    public void setSig(Integer sig) {
        this.sig = sig;
    }

    /**
     * 
     * @return
     *     The net
     */
    public String getNet() {
        return net;
    }

    /**
     * 
     * @param net
     *     The net
     */
    public void setNet(String net) {
        this.net = net;
    }

    /**
     * 
     * @return
     *     The code
     */
    public String getCode() {
        return code;
    }

    /**
     * 
     * @param code
     *     The code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 
     * @return
     *     The ids
     */
    public String getIds() {
        return ids;
    }

    /**
     * 
     * @param ids
     *     The ids
     */
    public void setIds(String ids) {
        this.ids = ids;
    }

    /**
     * 
     * @return
     *     The sources
     */
    public String getSources() {
        return sources;
    }

    /**
     * 
     * @param sources
     *     The sources
     */
    public void setSources(String sources) {
        this.sources = sources;
    }

    /**
     * 
     * @return
     *     The types
     */
    public String getTypes() {
        return types;
    }

    /**
     * 
     * @param types
     *     The types
     */
    public void setTypes(String types) {
        this.types = types;
    }

    /**
     * 
     * @return
     *     The nst
     */
    public Integer getNst() {
        return nst;
    }

    /**
     * 
     * @param nst
     *     The nst
     */
    public void setNst(Integer nst) {
        this.nst = nst;
    }

    /**
     * 
     * @return
     *     The dmin
     */
    public Double getDmin() {
        return dmin;
    }

    /**
     * 
     * @param dmin
     *     The dmin
     */
    public void setDmin(Double dmin) {
        this.dmin = dmin;
    }

    /**
     * 
     * @return
     *     The rms
     */
    public Double getRms() {
        return rms;
    }

    /**
     * 
     * @param rms
     *     The rms
     */
    public void setRms(Double rms) {
        this.rms = rms;
    }

    /**
     * 
     * @return
     *     The gap
     */
    public double getGap() {
        return gap;
    }

    /**
     * 
     * @param gap
     *     The gap
     */
    public void setGap(double gap) {
        this.gap = gap;
    }

    /**
     * 
     * @return
     *     The magType
     */
    public String getMagType() {
        return magType;
    }

    /**
     * 
     * @param magType
     *     The magType
     */
    public void setMagType(String magType) {
        this.magType = magType;
    }

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

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
