package com.brands.cardgu.ui.home;

public class CountryModel {
    private int imageResource;
    private int iconResource;

    private String casinoBrand,casinorating,review;


    public CountryModel(int imageResource, int iconResource, String casinoBrand, String casinorating, String review) {
        this.imageResource = imageResource;
        this.iconResource = iconResource;
        this.casinoBrand = casinoBrand;
        this.casinorating = casinorating;
        this.review = review;
    }

    public int getImageResource() {
        return imageResource;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }

    public int getIconResource() {
        return iconResource;
    }

    public void setIconResource(int iconResource) {
        this.iconResource = iconResource;
    }

    public String getCasinoBrand() {
        return casinoBrand;
    }

    public void setCasinoBrand(String casinoBrand) {
        this.casinoBrand = casinoBrand;
    }

    public String getCasinorating() {
        return casinorating;
    }

    public void setCasinorating(String casinorating) {
        this.casinorating = casinorating;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }
}
