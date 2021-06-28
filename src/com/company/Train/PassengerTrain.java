package com.company.Train;

import java.util.Random;

public abstract class PassengerTrain extends Train {
    private int numberOfPassengers;
    private final double ticketCost;

    public PassengerTrain(double costPerMonth, TypeOfTrain typeOfTrain, double ticketCost) {
        super(costPerMonth, typeOfTrain);
        this.ticketCost = ticketCost;
        this.numberOfPassengers = getNumberOfPassengersDaily();
    }

    public int getNumberOfPassengersDaily() {
        Random random = new Random();
        return random.nextInt(250 - 115) + 115;
    }

    public double getTicketCost() {
        return ticketCost;
    }


    public int getNumberOfPassengersPerYear() {
        return numberOfPassengers * 365;
    }

    @Override
    public double getRevenue(double years) {
        double revenue = 0;
        revenue -= getCostPerMonth() * 12;

        double twentyPercentOfPassengers = (0.20 * getNumberOfPassengersPerYear()) * (getTicketCost() + 2);
        double eightyPercentOfPassengers = (0.80 * getNumberOfPassengersPerYear()) * getTicketCost();

        revenue += twentyPercentOfPassengers;
        revenue += eightyPercentOfPassengers;

        return revenue * years;

    }
}
