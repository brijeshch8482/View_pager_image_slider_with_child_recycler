package com.chaudhary.dev.viewpagerimagesliderwithchildrecycler;

public class ViewPagerSliderModal {

    private String imgUrl;
    private int backgroundDrawable;

    public ViewPagerSliderModal () {

    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public ViewPagerSliderModal (String imgUrl, int backgroundDrawable) {
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
