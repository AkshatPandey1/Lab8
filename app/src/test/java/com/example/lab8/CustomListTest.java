package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    private static CustomList cityAdapter;

    @BeforeAll
    public static void setUp() {
        ArrayList<City> cityDataList = new ArrayList<>();
        cityDataList.add(new City("Edmonton", "AB"));
        cityDataList.add(new City("Vancouver", "BC"));
        cityDataList.add(new City("Toronto", "ON"));
        cityDataList.add(new City("Hamilton", "ON"));
        cityDataList.add(new City("Calgary", "AB"));
        cityDataList.add(new City("Waterloo", "ON"));
        cityAdapter = new CustomList(null, cityDataList);
    }

    @Test
    public void testGetCount() {
        assertEquals(6, cityAdapter.getCount());
    }

    @Test
    public void testAddCity() {
        cityAdapter.addCity(new City("Montreal", "QC"));
        assertEquals(7, cityAdapter.getCount());
    }

    @Test
    public void testIsCityInList() {
        assertTrue(cityAdapter.isCityInList(new City("Edmonton", "AB")));
    }

    @Test
    public void testIsCityNotInList() {
        assertFalse(cityAdapter.isCityInList(new City("AP", "AP")));
    }

    @Test
    public void deleteCity() {
        cityAdapter.deleteCity(3);
        assertEquals(7, cityAdapter.getCount());
    }
}
