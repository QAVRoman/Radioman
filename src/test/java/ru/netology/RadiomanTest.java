package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadiomanTest {

    @Test
    void getCurrentWave() {
        Radioman run = new Radioman();
        run.getCurrentWave();
        int expected = 0;
        int actual = run.getCurrentWave();
        assertEquals(expected, actual);
    }

    @Test
    void setCurrentWave() {
        Radioman run = new Radioman();
        run.setCurrentWave(1);
        int expected = 1;
        int actual = run.getCurrentWave();
        assertEquals(expected, actual);
    }

    @Test
    void next() {
        Radioman run = new Radioman();
        run.setCurrentWave(9);
        run.next();
        int expected = 0;
        int actual = run.getCurrentWave();
        assertEquals(expected, actual);
    }

    @Test
    void prev() {
        Radioman run = new Radioman();
        run.setCurrentWave(9);
        run.prev();
        int expected = 8;
        int actual = run.getCurrentWave();
        assertEquals(expected, actual);
    }

    @Test
    void getCurrentVolume() {
        Radioman run = new Radioman();
        run.getCurrentVolume();
        int expected = 0;
        int actual = run.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void setCurrentVolume() {
        Radioman run = new Radioman();
        run.setCurrentVolume(11);
        int expected = 0;
        int actual = run.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void increaseVolume() {
        Radioman run = new Radioman();
        run.setCurrentVolume(10);
        run.increaseVolume();
        int expected = 10;
        int actual = run.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void LowVolume() {
        Radioman run = new Radioman();
        run.setCurrentVolume(10);
        run.lowVolume();
        int expected = 9;
        int actual = run.getCurrentVolume();
        assertEquals(expected, actual);
    }

}