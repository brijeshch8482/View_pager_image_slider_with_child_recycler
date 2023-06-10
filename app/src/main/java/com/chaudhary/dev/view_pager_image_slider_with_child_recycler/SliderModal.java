package com.chaudhary.dev.view_pager_image_slider_with_child_recycler;

public class SliderModal {

    private String imgUrl;
    private int backgroundDrawable;

    public SliderModal() {

    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public SliderModal(String imgUrl, int backgroundDrawable) {
        this.imgUrl = imgUrl;
        this.backgroundDrawable = backgroundDrawable;
    }

    public int getBackgroundDrawable() {
        return backgroundDrawable;
    }

    public void setBackgroundDrawable(int backgroundDrawable) {
        this.backgroundDrawable = backgroundDrawable;
    }
}
