package com.accp.model;

import java.util.List;

public class Kht {
    private Integer khid;

    private String khname;

    private List<Sht> shts;
    
    
    
    public List<Sht> getShts() {
		return shts;
	}

	public void setShts(List<Sht> shts) {
		this.shts = shts;
	}

	public Integer getKhid() {
        return khid;
    }

    public void setKhid(Integer khid) {
        this.khid = khid;
    }

    public String getKhname() {
        return khname;
    }

    public void setKhname(String khname) {
        this.khname = khname;
    }
}