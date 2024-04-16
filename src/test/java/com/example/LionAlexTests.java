package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionAlexTests {
    @Mock
    private Feline feline;
    private LionAlex lionAlex;
    private final List<String> expectedFriends = List.of("Марти", "Глория", "Мелман");

    @Test
    public void testGetKittens() throws Exception {
        lionAlex = new LionAlex(feline);
        int actual = lionAlex.getKittens();

        int expectedLionChildren = 0;
        assertEquals("Количество лвят не соответствует ожидаемому",
                expectedLionChildren, actual);
    }

    @Test
    public void testGetFriends() throws Exception {
        lionAlex = new LionAlex(feline);
        List<String> actual = lionAlex.getFriends();

        assertEquals("Список друзей не соответствует ожидаемому",
                expectedFriends, actual);
    }

    @Test
    public void testGetPlaceOfLiving() throws Exception {
        lionAlex = new LionAlex(feline);
        String actual = lionAlex.getPlaceOfLiving();

        String expectedPlace = "Нью-Йоркский зоопарк";
        assertEquals("Некорректное место проживания льва",
                expectedPlace,actual);
    }
}