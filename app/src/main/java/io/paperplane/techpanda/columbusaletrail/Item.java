package io.paperplane.techpanda.columbusaletrail;

public class Item {

    private String mName;
    private String mAddress;
    private String mWebsite;
    private int mLogoId;


    public Item(String name, String address, String website, int logoId) {
        mName = name;
        mAddress = address;
        mWebsite = website;
        mLogoId = logoId;
    }


    public String getName() {
        return mName;
    }

    public String getAddress() {
        return mAddress;
    }

    public String getWebsite() {
        return mWebsite;
    }

    public int getLogoId() {
        return mLogoId;
    }
}
