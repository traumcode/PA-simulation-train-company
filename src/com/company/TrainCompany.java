package com.company;


import com.company.Train.Freight;
import com.company.Train.IC;
import com.company.Train.Passenger;
import com.company.Train.Train;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TrainCompany {
    private List<Train> trainList;

    public TrainCompany() {
        this.trainList = new ArrayList<>();

        trainList.add(new Passenger());
        trainList.add(new Passenger());

        trainList.add(new IC());
        trainList.add(new IC());

        trainList.add(new Freight());
        trainList.add(new Freight());

    }

    public double calculateRevenue(int months){
        return 0;
    }

    public int numberOfTrains() {
        return trainList.size();
    }

    public List<Train> getTrainList() {
        return trainList;
    }
}
