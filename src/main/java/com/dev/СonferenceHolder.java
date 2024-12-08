package com.dev;

import java.util.ArrayList;

public class СonferenceHolder {
    private String Place;
    private ArrayList<ClerksInfo> clerksInfo;

    public СonferenceHolder(String Place) {
        this.Place = Place;
        this.clerksInfo = new ArrayList<>();
    }

    public void addGuest(ClerksInfo clerksInfo) {
        this.clerksInfo.add(clerksInfo);
    }
    public ArrayList<ClerksInfo> getCars() {
        return clerksInfo;
    }

    public void displayAllGuest() {
        System.out.println("The list of invitees to our conference in " + Place + " includes:");
        for (ClerksInfo clerksInfo : clerksInfo) {
            clerksInfo.displayCarInfo();
            System.out.println("*********************");
        }
    }

    public ArrayList<ClerksInfo> searchGuestByBank(String Bank) {
        ArrayList<ClerksInfo> foundClerksInfo = new ArrayList<>();
        for (ClerksInfo clerksInfo : clerksInfo) {
            if (clerksInfo.getName().equalsIgnoreCase(Bank)) {
                foundClerksInfo.add(clerksInfo);
            }
        }
        return foundClerksInfo;
    }
}