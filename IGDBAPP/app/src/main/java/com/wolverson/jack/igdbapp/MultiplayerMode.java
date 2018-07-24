
package com.wolverson.jack.igdbapp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MultiplayerMode {

    @SerializedName("platform")
    @Expose
    private int platform;
    @SerializedName("offlinecoop")
    @Expose
    private boolean offlinecoop;
    @SerializedName("onlinecoop")
    @Expose
    private boolean onlinecoop;
    @SerializedName("lancoop")
    @Expose
    private boolean lancoop;
    @SerializedName("campaigncoop")
    @Expose
    private boolean campaigncoop;
    @SerializedName("splitscreenonline")
    @Expose
    private boolean splitscreenonline;
    @SerializedName("splitscreen")
    @Expose
    private boolean splitscreen;
    @SerializedName("dropin")
    @Expose
    private boolean dropin;
    @SerializedName("offlinecoopmax")
    @Expose
    private int offlinecoopmax;
    @SerializedName("onlinecoopmax")
    @Expose
    private int onlinecoopmax;
    @SerializedName("onlinemax")
    @Expose
    private int onlinemax;
    @SerializedName("offlinemax")
    @Expose
    private int offlinemax;

    public int getPlatform() {
        return platform;
    }

    public void setPlatform(int platform) {
        this.platform = platform;
    }

    public boolean isOfflinecoop() {
        return offlinecoop;
    }

    public void setOfflinecoop(boolean offlinecoop) {
        this.offlinecoop = offlinecoop;
    }

    public boolean isOnlinecoop() {
        return onlinecoop;
    }

    public void setOnlinecoop(boolean onlinecoop) {
        this.onlinecoop = onlinecoop;
    }

    public boolean isLancoop() {
        return lancoop;
    }

    public void setLancoop(boolean lancoop) {
        this.lancoop = lancoop;
    }

    public boolean isCampaigncoop() {
        return campaigncoop;
    }

    public void setCampaigncoop(boolean campaigncoop) {
        this.campaigncoop = campaigncoop;
    }

    public boolean isSplitscreenonline() {
        return splitscreenonline;
    }

    public void setSplitscreenonline(boolean splitscreenonline) {
        this.splitscreenonline = splitscreenonline;
    }

    public boolean isSplitscreen() {
        return splitscreen;
    }

    public void setSplitscreen(boolean splitscreen) {
        this.splitscreen = splitscreen;
    }

    public boolean isDropin() {
        return dropin;
    }

    public void setDropin(boolean dropin) {
        this.dropin = dropin;
    }

    public int getOfflinecoopmax() {
        return offlinecoopmax;
    }

    public void setOfflinecoopmax(int offlinecoopmax) {
        this.offlinecoopmax = offlinecoopmax;
    }

    public int getOnlinecoopmax() {
        return onlinecoopmax;
    }

    public void setOnlinecoopmax(int onlinecoopmax) {
        this.onlinecoopmax = onlinecoopmax;
    }

    public int getOnlinemax() {
        return onlinemax;
    }

    public void setOnlinemax(int onlinemax) {
        this.onlinemax = onlinemax;
    }

    public int getOfflinemax() {
        return offlinemax;
    }

    public void setOfflinemax(int offlinemax) {
        this.offlinemax = offlinemax;
    }

}
