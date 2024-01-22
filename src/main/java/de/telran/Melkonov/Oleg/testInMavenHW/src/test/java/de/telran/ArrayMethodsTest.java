package de.telran;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;


class ArrayMethodsTest {


    @Test
    public void equalElementsSearch() {
        int[] array1 = {1,2,5,5,8,9,7,10};
        int[] array2 = {1,0,6,15,6,4,7,0};
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1,7));
        ArrayList<Integer> actual = Main.equalElementsSearch(array1, array2);
        Assert.assertEquals("incorrect result", expected, actual);
    }

    @Test
    public void equalElementsDelete() {
        int[] arr = {0,3,-2,4,3,2};
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(0,3,-2,4,2));
        ArrayList<Integer> actual = Main.equalElementsDelete(arr);
        Assert.assertEquals("incorrect result", expected, actual);
    }
}