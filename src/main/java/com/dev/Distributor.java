package com.dev;

import java.util.ArrayList;

public class Distributor {
    private String storeName;
    private ArrayList<MonsterCar> monsterCars;

    public Distributor(String storeName) {
        this.storeName = storeName;
        this.monsterCars = new ArrayList<>();
    }

    public void addCar(MonsterCar monsterCar) {
        monsterCars.add(monsterCar);
    }
    public ArrayList<MonsterCar> getCars() {
        return monsterCars;
    }

    public void displayAllCars() {
        System.out.println("Cars available at " + storeName + ":");
        for (MonsterCar monsterCar : monsterCars) {
            monsterCar.displayCarInfo();
            System.out.println("-------------------------");
        }
    }

    public ArrayList<MonsterCar> searchCarByMake(String make) {
        ArrayList<MonsterCar> foundMonsterCars = new ArrayList<>();
        for (MonsterCar monsterCar : monsterCars) {
            if (monsterCar.getMake().equalsIgnoreCase(make)) {
                foundMonsterCars.add(monsterCar);
            }
        }
        return foundMonsterCars;
    }
}