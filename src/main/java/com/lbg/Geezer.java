package com.lbg;

public class Geezer {

    public Geezer(){
        this.setAge(35);
        this.setName("Tom Skinner");
        this.setFavCatchPhrase("Bosh");
        this.setFavPub("Dinos Cafe");
        this.setMealsEaten([null]);


    }

    private int age;
    private String name;
    private String favPub;

    private String[] mealsEaten;
    private String favCatchPhrase;
    private int stellasConsumed;

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return this.age;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String getFavPub() {
        return favPub;
    }

    public void setFavPub(String favPub) {
        this.favPub = favPub;
    }

    public String getFavCatchPhrase() {
        return favCatchPhrase;
    }

    public void setFavCatchPhrase(String favCatchPhrase) {
        this.favCatchPhrase = favCatchPhrase;
    }
    public String[] getMealsEaten() {
        return mealsEaten;
    }

    public void setMealsEaten(String[] mealsEaten) {
        this.mealsEaten = mealsEaten;
    }
}
