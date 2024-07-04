package com.skoti.designpatterns.prototype;

public class NetworkConnection implements Cloneable{

    private String ip;
    private String data;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void loadHugeData() throws InterruptedException {
        Thread.sleep(5000);
        this.data = "Huge data loaded";
    }

    @Override
    public String toString() {
        return "NetworkConnection{" +
                "ip='" + ip + '\'' +
                ", data='" + data + '\'' +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
       return super.clone();
    }
}
