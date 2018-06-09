package net.jandan.pojo;

public class CommentXO {
    public CommentXO(Integer commentId, String ipAddr) {
        this.commentId = commentId;
        this.ipAddr = ipAddr;
    }
    public CommentXO() {

    }
    private Integer commentId;

    private String ipAddr;

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public String getIpAddr() {
        return ipAddr;
    }

    public void setIpAddr(String ipAddr) {
        this.ipAddr = ipAddr == null ? null : ipAddr.trim();
    }
}