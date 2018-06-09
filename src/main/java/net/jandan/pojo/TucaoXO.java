package net.jandan.pojo;

public class TucaoXO {
    private Integer tucaoId;

    private String ipAddr;

    public Integer getTucaoId() {
        return tucaoId;
    }

    public void setTucaoId(Integer tucaoId) {
        this.tucaoId = tucaoId;
    }

    public String getIpAddr() {
        return ipAddr;
    }

    public void setIpAddr(String ipAddr) {
        this.ipAddr = ipAddr == null ? null : ipAddr.trim();
    }
}