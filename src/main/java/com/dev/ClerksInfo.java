package com.dev;

public class ClerksInfo {
    private String position;
    private String Bank;
    private String Name;
    private int experience;
    private String SecondName;

    public ClerksInfo(String Name, String SecondName, String position, int experience, String Bank) {

        this.position = position;
        this.experience = experience;
        this.Name = Name;
        this.SecondName = SecondName;
        this.Bank = Bank;
    }

    public String getName() {
        return Name;}
    public void setName(String name) {
        this.Name = name;}

    public String getPosition() {
        return position;}
    public void setPosition(String position) {
        this.position = position;}

    public String getBank() {
        return Bank;}
    public void setBank(String bank) {
        this.Bank = bank;}

    public String getSecondName() {
        return SecondName;}
    public void setSecondName(String secondName) {
        this.SecondName = secondName;}



    public double getExperience() {
        return experience;}
    public void setExperience(int experience) {
        this.experience = experience;}



    public void displayCarInfo() {
        System.out.println("Name: " + Name);
        System.out.println("SecondName: " + SecondName);
        System.out.println("Bank: " + Bank);
        System.out.println("Position: " + position);
        System.out.println("Experience: " + experience+ " years");
    }
}
