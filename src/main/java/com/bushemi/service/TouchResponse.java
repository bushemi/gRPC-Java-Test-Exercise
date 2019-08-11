package com.bushemi.service;

public class TouchResponse {
    private final int code;
    private final int timout;

    public TouchResponse(int code, int timout) {
        this.code = code;
        this.timout = timout;
    }

    public int getCode() {
        return code;
    }

    public int getTimout() {
        return timout;
    }

    @Override
    public String toString() {
        return "TouchResponse{" +
                "code=" + code +
                ", timout=" + timout +
                '}';
    }
}
