package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BinarySearchTest {

    @Test
    public void emptyArray_returnsMinusOne() {
        BinarySearch binarySearch = new BinarySearch();
        assertEquals(-1, binarySearch.search(new int[] {}, 5));
    }

    @Test
    public void singleElement_found() {
        BinarySearch binarySearch = new BinarySearch();
        assertEquals(0, binarySearch.search(new int[] { 3 }, 3));
    }

    @Test
    public void multiple_goRight_found() {
        BinarySearch binarySearch = new BinarySearch();
        assertEquals(4, binarySearch.search(new int[] { 1, 3, 5, 7, 9 }, 9));
    }

    @Test
    public void multiple_goLeft_notFound() {
        BinarySearch binarySearch = new BinarySearch();
        assertEquals(-1, binarySearch.search(new int[] { 2, 4, 6, 8 }, 5));
    }

    @Test
    public void immediate_goLeft_once() {
        BinarySearch binarySearch = new BinarySearch();
        assertEquals(-1, binarySearch.search(new int[] { 1, 3, 5 }, 2));
    }
}