package com.technology.carrot.photogallery;

/**
 * Created by Administrator on 2018/1/24.
 */

public class GalleryItem {
    private String mCaption;
    private String mId;

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public String getCaption() {
        return mCaption;
    }

    public void setCaption(String caption) {
        mCaption = caption;
    }

    private String mUrl;

    @Override
    public String toString() {
        return mCaption;
    }
}
