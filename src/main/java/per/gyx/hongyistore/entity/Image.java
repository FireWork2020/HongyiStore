package per.gyx.hongyistore.entity;

import java.util.Date;

public class Image {
    private int clotheID;
    private String remoteUrl;
    private String kind;

    public int getClotheID() {
        return clotheID;
    }

    public void setClotheID(int clotheID) {
        this.clotheID = clotheID;
    }

    public String getRemoteUrl() {
        return remoteUrl;
    }

    public void setRemoteUrl(String remoteUrl) {
        this.remoteUrl = remoteUrl;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }
}
