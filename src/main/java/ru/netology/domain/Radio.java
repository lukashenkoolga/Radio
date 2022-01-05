package ru.netology.domain;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > 9) {
            return;
        }
        if (currentRadioStation <= 0) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int clickNextStation() {

        if (currentRadioStation < 9) {
            currentRadioStation = currentRadioStation + 1;
        }
        else {
            currentRadioStation = 0;
        }
        if (currentRadioStation == 9) {
            currentRadioStation = 9;
        }

        return currentRadioStation;
    }

    public int clickPrevStation() {
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        }
        else {
            currentRadioStation = 9;
        }
        if (currentRadioStation == 0) {
            currentRadioStation = 0;
        }
        return currentRadioStation;
    }


    public void setCurrentVolume(int currentVolume) {

        if (currentVolume > 10) {
            return;
        }
        if (currentVolume < 0) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int clickPlusVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume == 10) {
            currentVolume = currentVolume;
        }
        return currentVolume;
    }

    public int clickMinusVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume == 0) {
            currentVolume = currentVolume;
        }
        return currentVolume;
    }

}