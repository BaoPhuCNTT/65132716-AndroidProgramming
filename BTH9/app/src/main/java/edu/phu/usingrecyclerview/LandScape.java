package edu.phu.usingrecyclerview;

 class Landscape {
    private String imageFileName;
    private String caption;

    public Landscape(String imageFileName, String caption) {
        this.imageFileName = imageFileName;
        this.caption = caption;
    }

    public String getImageFileName() {
        return imageFileName;
    }

    public String getCaption() {
        return caption;
    }
}