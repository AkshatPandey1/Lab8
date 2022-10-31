package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    private static ArrayList<City> cityDataList;
    private static CustomList cityAdapter;

    @BeforeAll
    public static void setUp() {
        cityDataList = new ArrayList<>();
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
        assertEquals(true, cityAdapter.isCityInList(new City("Edmonton", "AB")));
    }

    @Test
    public void testIsCityNotInList() {
        assertEquals(false, cityAdapter.isCityInList(new City("Montreal", "QC")));
    }

    @Test
    public void deleteCity() {
        assertEquals("Edmonton", cityAdapter.getItem(0).getCityName());
    }

}
