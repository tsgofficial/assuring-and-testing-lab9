package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BinarySearchTest {

    @Test
    public void emptyArray_returnsMinusOne() {
        assertEquals(-1, BinarySearch.search(new int[] {}, 5));
    }

    @Test
    public void singleElement_found() {
        assertEquals(0, BinarySearch.search(new int[] { 3 }, 3));
    }

    @Test
    public void multiple_goRight_found() {
        assertEquals(4, BinarySearch.search(new int[] { 1, 3, 5, 7, 9 }, 9));
    }

    @Test
    public void multiple_goLeft_notFound() {
        assertEquals(-1, BinarySearch.search(new int[] { 2, 4, 6, 8 }, 5));
    }
}