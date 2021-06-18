package com.example.myjamaat_sp;

public class ModelMasjid {
    int id;
    String name;
    String fazr;
    String zuhr;
    String asr;
    String maghrib;
    String esha;
    boolean isActive;

    public ModelMasjid(int id, String name, boolean isActive, String fazr, String zuhr, String asr, String maghrib, String esha) {
        this.id = id;
        this.name = name;
        this.fazr = fazr;
        this.zuhr = zuhr;
        this.asr = asr;
        this.maghrib = maghrib;
        this.esha = esha;
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        return "ModelMasjid{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", fazr='" + fazr + '\'' +
                ", zuhr='" + zuhr + '\'' +
                ", asr='" + asr + '\'' +
                ", maghrib='" + maghrib + '\'' +
                ", esha='" + esha + '\'' +
                ", isActive=" + isActive +
                '}';
    }


    public String toStorableString() {
        return id +
                "," + name +
                "," + isActive +
                "," + fazr +
                "," + zuhr +
                "," + asr +
                "," + maghrib +
                "," + esha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFazr() {
        return fazr;
    }

    public void setFazr(String fazr) {
        this.fazr = fazr;
    }

    public String getZuhr() {
        return zuhr;
    }

    public void setZuhr(String zuhr) {
        this.zuhr = zuhr;
    }

    public String getAsr() {
        return asr;
    }

    public void setAsr(String asr) {
        this.asr = asr;
    }

    public String getMaghrib() {
        return maghrib;
    }

    public void setMaghrib(String maghrib) {
        this.maghrib = maghrib;
    }

    public String getEsha() {
        return esha;
    }

    public void setEsha(String esha) {
        this.esha = esha;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }




}
