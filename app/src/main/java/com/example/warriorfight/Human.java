package com.example.warriorfight;

public class Human extends Warrior implements Attack {

    public Human(String name , int attackWarrior){
        super(name, attackWarrior);
    }

    public void takeHit(int attackEnnemy){
        setLife(getLife() - attackEnnemy );
    }


    public void spell(){
        setAttackWarrior(30);
    }


    public void cac(){
        setAttackWarrior(60);
    }


    public void distance(){
        setAttackWarrior(20);
    }


}
