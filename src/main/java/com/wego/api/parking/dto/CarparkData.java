package com.wego.api.parking.dto;

import java.util.ArrayList;
import java.util.List;

public class CarparkData {
    private List<CarparkInfo> carpark_info = new ArrayList<>();
    private String carpark_number;
    private String update_datetime;

    public CarparkData() {
    }

    public List<CarparkInfo> getCarpark_info() {
        return carpark_info;
    }

    public void setCarpark_info(List<CarparkInfo> carpark_info) {
        this.carpark_info = carpark_info;
    }

    public String getCarpark_number() {
        return carpark_number;
    }

    public void setCarpark_number(String carpark_number) {
        this.carpark_number = carpark_number;
    }

    public String getUpdate_datetime() {
        return update_datetime;
    }

    public void setUpdate_datetime(String update_datetime) {
        this.update_datetime = update_datetime;
    }
}
