package com.company.Train;

public class Passenger extends PassengerTrain {
    public Passenger() {
        super(1000, TypeOfTrain.PASSENGER, 1.50);
    }


    @Override
    public double getRevenue(double years) {
        return super.getRevenue(years);
    }

    @Override
    public double getTicketCost() {
        return super.getTicketCost();
    }
}
