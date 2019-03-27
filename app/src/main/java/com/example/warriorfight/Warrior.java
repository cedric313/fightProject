package com.example.warriorfight;

public abstract class Warrior {

    private String name;
    private int attackWarrior;
    private int life;

    public Warrior(String name, int attackWarrior){
        this.name = name;
        this.attackWarrior = attackWarrior;
        this.life = 100;

    }

    public String getName(){
        return this.name;
    }

    public int getLife(){
        return this.life;
    }

    public int getAttackWarrior() {
        return attackWarrior;
    }


    public void setName(String name){
        this.name = name;
    }

    public void setAttackWarrior(int attackWarrior) {
        this.attackWarrior = attackWarrior;
    }


    public void setLife(int life){
        this.life = life;
    }

    public boolean isKo(){
        return (getLife() <= 0);
    }

    public void takeHit(int attackEnnemy){
        setLife(getLife() - attackEnnemy );
    }

    /*public void takeHit(Warrior ennemy){
        setLife(getLife() - ennemy.getAttackWarrior());
    }*/
}
