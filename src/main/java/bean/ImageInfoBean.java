package bean;

import java.util.Date;

public class ImageInfoBean {
    private DisplayTypeEnum displayType;
    private ImageTypeEnum imageType;
    private String imageLoadePath;
    private String beginTime;
    private String endTime;
    private int displayTime;

    public ImageInfoBean(String imageLoadePathNoTypeName,  ImageTypeEnum imageType, DisplayTypeEnum displayType, String beginTime, String endTime, int displayTime) {
        this.displayType = displayType;
        this.imageType = imageType;
        this.imageLoadePath = imageLoadePathNoTypeName;
        this.beginTime = beginTime;
        this.endTime = endTime;
        this.displayTime = displayTime;
    }

    public DisplayTypeEnum getDisplayType() {
        return displayType;
    }

    public ImageTypeEnum getImageType() {
        return imageType;
    }

    public String getImageLoadePath() {
        return imageLoadePath;
    }

    public String getBeginTime() {
        return beginTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public int getDisplayTime() {
        return displayTime;
    }

    public enum DisplayTypeEnum {
        SETTING_BACKGROUND("SETTING_BACKGROUND",0),MAP_PAGE("MAP_PAGE",100);

        private String typeName;
        private int serverNumber;
        DisplayTypeEnum(String typeName, int serverNumber) {
            this.typeName=typeName;
            this.serverNumber=serverNumber;
        }

        public int getServerNumber() {
            return serverNumber;
        }

        public String getTypeName() {
            return typeName;
        }
    }

    public enum ImageTypeEnum {
        JPG("JPG",0),PNG("PNG",100),GIF("GIF",2);

        private String typeName;
        private int serverNumber;
        ImageTypeEnum(String typeName, int serverNumber) {
            this.typeName=typeName;
            this.serverNumber=serverNumber;
        }

        public int getServerNumber() {
            return serverNumber;
        }

        public String getTypeName() {
            return typeName;
        }
    }
}
