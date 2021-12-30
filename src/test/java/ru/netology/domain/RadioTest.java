package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void setCurrentRadioStation5() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(5);
        int expected = 5;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void setCurrentRadioStation11() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(11);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void setCurrentRadioStationMinus1() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(-1);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void setCurrentRadioStation0() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void setCurrentRadioStation1() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(1);
        int expected = 1;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void setCurrentRadioStation9() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);
        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }


    @Test
    void clickNextStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(5);
        int expected = 6;
        int actual = radio.clickNextStation();
        assertEquals(expected, actual);
    }

    @Test
    void clickNextStation1() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);
        int expected = 1;
        int actual = radio.clickNextStation();
        assertEquals(expected, actual);
    }

    @Test
    void clickNextStation2() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(8);
        int expected = 9;
        int actual = radio.clickNextStation();
        assertEquals(expected, actual);
    }

    @Test
    void clickPrevStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(5);
        int expected = 4;
        int actual = radio.clickPrevStation();
        assertEquals(expected, actual);
    }


    @Test
    void clickPrevStation2() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(-1);
        int expected = 9;
        int actual = radio.clickPrevStation();
        assertEquals(expected, actual);
    }

    @Test
    void clickPrevStation3() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);
        int expected = 9;
        int actual = radio.clickPrevStation();
        assertEquals(expected, actual);
    }


    @Test
    void clickPlusVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(3);
        int expected = 4;
        int actual = radio.clickPlusVolume();
        assertEquals(expected, actual);
    }

    @Test
    void clickPlusVolume1() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        int expected = 1;
        int actual = radio.clickPlusVolume();
        assertEquals(expected, actual);
    }


    @Test
    void clickPlusVolume2() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);
        int expected = 10;
        int actual = radio.clickPlusVolume();
        assertEquals(expected, actual);
    }



    @Test
    void clickMinusVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(5);
        int expected = 4;
        int actual = radio.clickMinusVolume();
        assertEquals(expected, actual);
    }

    @Test
    void clickMinusVolume1() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        int expected = 0;
        int actual = radio.clickMinusVolume();
        assertEquals(expected, actual);
    }

    @Test
    void clickMinusVolume2() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);
        int expected = 9;
        int actual = radio.clickMinusVolume();
        assertEquals(expected, actual);
    }
    @Test
    void clickMinusVolume3() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.clickMinusVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void clickMinusVolume4(){
        Radio rad = new Radio();

        rad.setCurrentVolume(15);
        int expected = 0;
        int actual = rad.clickMinusVolume();
        assertEquals(expected, actual);
    }
}
