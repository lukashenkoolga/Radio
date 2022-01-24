package ru.netology.domain;

public class Radio {
    private int maxVolume = 100;
    private int minVolume = 0;
    private int maxRadioStation = 9;
    private int minRadioStation = 0;
    private int currentRadioStation;
    private int numberRadioStations = 10;
    private int currentVolume;


    public Radio(int numberRadioStations) {
        this.numberRadioStations = numberRadioStations;
    }

    public Radio() {
    }

    public int getNumberRadioStations() {
        return numberRadioStations;
    }

    public void setNumberRadioStations(int numberRadioStations) {
        this.numberRadioStations = numberRadioStations;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > maxRadioStation) {
            this.currentRadioStation = maxRadioStation;
            return;
        }
        if (currentRadioStation <= minRadioStation) {
            this.currentRadioStation = minRadioStation;
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int clickNextStation() {

        if (currentRadioStation < maxRadioStation) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = minRadioStation;
        }
        return currentRadioStation;
    }

    public int clickPrevStation() {
        if (currentRadioStation > minRadioStation) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = maxRadioStation;
        }

        return currentRadioStation;
    }


    public void setCurrentVolume(int currentVolume) {

        if (currentVolume > maxVolume) {
            this.currentVolume = maxVolume;
            return;
        }
        if (currentVolume < minVolume) {
            this.currentVolume = minVolume;
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int clickPlusVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume == maxVolume) {
            currentVolume = currentVolume;
        }
        return currentVolume;
    }

    public int clickMinusVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume == minVolume) {
            currentVolume = currentVolume;
        }
        return currentVolume;
    }

}