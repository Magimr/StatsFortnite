package com.example.statsfortnite;

import java.util.List;

public class Player {
    private boolean cached;
    private String uid;
    private String username;
    private String platform;
    private long timestamp;
    private String window;
    private long response;
    private List<Stats> stats;
    private List<Totals> totals;

    public boolean isCached() {
        return cached;
    }

    public void setCached(boolean cached) {
        this.cached = cached;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getWindow() {
        return window;
    }

    public void setWindow(String window) {
        this.window = window;
    }

    public long getResponse() {
        return response;
    }

    public void setResponse(long response) {
        this.response = response;
    }

    public List<Stats> getStats() {
        return stats;
    }

    public void setStats(List<Stats> stats) {
        this.stats = stats;
    }

    public List<Totals> getTotals() {
        return totals;
    }

    public void setTotals(List<Totals> totals) {
        this.totals = totals;
    }
}
