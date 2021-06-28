package com.company;

import com.company.Train.*;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        TrainCompany RATB = new TrainCompany();
        List<Train> trainList = RATB.getTrainList();

        for (Train train : trainList) {
            System.out.println(train.getTypeOfTrain());
            System.out.println(train.getRevenue(2));
        }


    }
}
