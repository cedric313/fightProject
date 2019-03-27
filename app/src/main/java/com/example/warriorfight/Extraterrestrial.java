package com.example.warriorfight;

public class Extraterrestrial extends Warrior implements Attack {

    public Extraterrestrial(String name , int attackWarrior){
        super(name, attackWarrior);
    }

    public void takeHit(int attackEnnemy){
        setLife(getLife() - attackEnnemy );
    }


    public void spell(){
        setAttackWarrior(20);
    }


    public void cac(){
        setAttackWarrior(80);
    }


    public void distance(){
        setAttackWarrior(5);
    }



}
