package op;

public class AdvertisingEntity {
    private int imageId;
    private int displayType;
    private String ossFileName;
    private int imageFormat;
    private String beginTime;
    private String endTime;
    private int displayTime;

    public AdvertisingEntity(int displayType, String ossFileName, int imageFormat, String beginTime, String endTime, int displayTime) {
        this.displayType = displayType;
        this.ossFileName = ossFileName;
        this.imageFormat = imageFormat;
        this.beginTime = beginTime;
        this.endTime = endTime;
        this.displayTime = displayTime;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public int getDisplayType() {
        return displayType;
    }

    public void setDisplayType(int displayType) {
        this.displayType = displayType;
    }

    public String getOssFileName() {
        return ossFileName;
    }

    public void setOssFileName(String ossFileName) {
        this.ossFileName = ossFileName;
    }

    public int getImageFormat() {
        return imageFormat;
    }

    public void setImageFormat(int imageFormat) {
        this.imageFormat = imageFormat;
    }

    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public int getDisplayTime() {
        return displayTime;
    }

    public void setDisplayTime(int displayTime) {
        this.displayTime = displayTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AdvertisingEntity that = (AdvertisingEntity) o;

        if (imageId != that.imageId) return false;
        if (displayType != that.displayType) return false;
        if (imageFormat != that.imageFormat) return false;
        if (displayTime != that.displayTime) return false;
        if (ossFileName != null ? !ossFileName.equals(that.ossFileName) : that.ossFileName != null) return false;
        if (beginTime != null ? !beginTime.equals(that.beginTime) : that.beginTime != null) return false;
        if (endTime != null ? !endTime.equals(that.endTime) : that.endTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = imageId;
        result = 31 * result + displayType;
        result = 31 * result + (ossFileName != null ? ossFileName.hashCode() : 0);
        result = 31 * result + imageFormat;
        result = 31 * result + (beginTime != null ? beginTime.hashCode() : 0);
        result = 31 * result + (endTime != null ? endTime.hashCode() : 0);
        result = 31 * result + displayTime;
        return result;
    }
}
