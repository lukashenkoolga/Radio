package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {


    @Test
    void ShowNumberRadioStations() {
        Radio radio= new Radio();
        assertEquals(10, radio.getNumberRadioStations());
    }

    @Test
    void ShowNumberRadioStations4() {
        Radio radio= new Radio(4);
        assertEquals(4, radio.getNumberRadioStations());
    }

    @Test
    void ShowNumberRadioStations54() {
        Radio radio= new Radio(54);
        assertEquals(54, radio.getNumberRadioStations());
    }


    @Test
    public void setCurrentRadioStation5() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);
        assertEquals(5, radio.getCurrentRadioStation());
    }

    @Test
    public void setCurrentRadioStation11() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(11);
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void setCurrentRadioStationMinus1() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-1);
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void setCurrentRadioStation0() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void setCurrentRadioStation1() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(1);
        assertEquals(1, radio.getCurrentRadioStation());
    }

    @Test
    void clickNextStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(6);
        radio.clickNextStation();
        assertEquals(7, radio.getCurrentRadioStation());
    }

    @Test
    void clickNextStation1() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(1);
        radio.clickNextStation();
        assertEquals(2, radio.getCurrentRadioStation());
    }

    @Test
    void clickNextStationMax() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.clickNextStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    void clickNextStation3() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.clickNextStation();
        assertEquals(1, radio.getCurrentRadioStation());
    }

    @Test
    void clickNextStation8() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(12);
        radio.clickNextStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    void clickNextStation9() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-1);
        radio.clickNextStation();
        assertEquals(1, radio.getCurrentRadioStation());
    }

    @Test
    void clickPrevStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(6);
        radio.clickPrevStation();
        assertEquals(5, radio.getCurrentRadioStation());
    }

    @Test
    void clickPrevStation2() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-1);
        radio.clickPrevStation();
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    void clickPrevStationMin() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.clickPrevStation();
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    void clickPrevStation4() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(1);
        radio.clickPrevStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    void clickPlusVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.clickPlusVolume();
        assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    void clickPlusVolume1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.clickPlusVolume();
        assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    void clickPlusVolumeMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.clickPlusVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void clickPlusVolume3() {
        Radio radio = new Radio();
        radio.setCurrentVolume(110);
        radio.clickPlusVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void clickMinusVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.clickMinusVolume();
        assertEquals(4, radio.getCurrentVolume());
    }

    @Test
    void clickMinusVolumeMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.clickMinusVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void clickMinusVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.clickMinusVolume();
        assertEquals(99, radio.getCurrentVolume());
    }

    @Test
    void clickMinusVolume3() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.clickMinusVolume();
        assertEquals(expected, actual);
    }
}