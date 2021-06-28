package com.company.Train;

import java.util.UUID;

public abstract class Train {
    private UUID id;
    private final double costPerMonth;
    private final TypeOfTrain typeOfTrain;

    public Train(double costPerMonth, TypeOfTrain typeOfTrain) {
        this.id = UUID.randomUUID();
        this.costPerMonth = costPerMonth;
        this.typeOfTrain = typeOfTrain;
    }

    public double getCostPerMonth() {
        return costPerMonth;
    }

    public double getRevenuePerMonth() {
        return 0;
    }

    public double getRevenue(double years) {
        return 0;
    }

    public TypeOfTrain getTypeOfTrain() {
        return typeOfTrain;
    }



}
