package com.example.warriorfight;

public class Dwarf extends Warrior implements Attack {

    public Dwarf(String name, int attackWarrior){
        super(name, attackWarrior);
    }

    public void takeHit(int attackEnnemy){
        setLife(getLife() - attackEnnemy );
    }

    @Override
    public void spell(){
        setAttackWarrior(25);
    }

    @Override
    public void cac(){
        setAttackWarrior(62);
    }

    @Override
    public void distance(){
        setAttackWarrior(20);
    }


}
