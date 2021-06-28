package com.company.Train;

public class Freight extends Train{
    public Freight() {
        super(1000, TypeOfTrain.FREIGHT);
    }

    @Override
    public double getRevenue(double years) {
        double revenue = 0;
        revenue -= getCostPerMonth()*12;
        revenue += 550*12;

        double chance = (12 * 0.35)*110;
        revenue += chance;
        return revenue*years;
    }
}
