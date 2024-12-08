package com.dev;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class CarList {
    public static void main(String[] args) {
        Distributor store = new Distributor("Low cost cars and Super-ZAZ");

        MonsterCar monsterCar1 = new MonsterCar("Rolls-Royce", "Spectre", 2024, 650000, "White");
        MonsterCar monsterCar2 = new MonsterCar("Porsche ", "911 GT3 RS PDK ", 2024, 270000, "White");
        MonsterCar monsterCar3 = new MonsterCar("Rolls-Royce", "Cullinan", 2019, 384999, "White");
        MonsterCar monsterCar4 = new MonsterCar("Rolls-Royce", "Ghost ", 2021, 490000, "Black");
        MonsterCar monsterCar5 = new MonsterCar("Lamborghini", "Urus S 60th Anniversary", 2024, 470000, "Black");
        MonsterCar monsterCar6 = new MonsterCar("Ferrari", "SF90", 2022, 649000, "Red");
        MonsterCar monsterCar7 = new MonsterCar("ZAZ", "Tavriya 1st generation", 1993, 150, "Green");

        store.addCar(monsterCar1);
        store.addCar(monsterCar2);
        store.addCar(monsterCar3);
        store.addCar(monsterCar4);
        store.addCar(monsterCar5);
        store.addCar(monsterCar6);
        store.addCar(monsterCar7);
        store.displayAllCars();

        store.searchCarByMake("ZAZ");
    }
}