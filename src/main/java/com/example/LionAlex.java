package com.example;

import java.util.List;

public class LionAlex extends Lion {

    private final List<String> friends = List.of("Марти", "Глория", "Мелман");

    public LionAlex(Feline feline) throws Exception {
        super("Самец", feline); // Passing "Самец" as the sex parameter
    }

    @Override
    public int getKittens() {
        return 0;
    }

    public List<String> getFriends() {
        return friends;
    }

    public String getPlaceOfLiving() {
        String placeOfLiving;
        placeOfLiving = "Нью-Йоркский зоопарк";
        return placeOfLiving;
    }
}
