package com.example.android1dz5;

public class Model {
    private int flag;
    private String firstTV, secondTV;

    public Model(int flag, String firstTV, String secondTV) {
        this.flag = flag;
        this.firstTV = firstTV;
        this.secondTV = secondTV;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public String getFirstTV() {
        return firstTV;
    }

    public void setFirstTV(String firstTV) {
        this.firstTV = firstTV;
    }

    public String getSecondTV() {
        return secondTV;
    }

    public void setSecondTV(String secondTV) {
        this.secondTV = secondTV;
    }
}
