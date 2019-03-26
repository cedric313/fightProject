package com.example.warriorfight;

public abstract class Warrior {

    private int attack;
    private int life;

    public Warrior(int attack){
        this.attack = attack;
        this.life = 100;
    }

    public int getAttack(){
        return this.attack;
    }

    public int getLife(){
        return this.life;
    }

    public void setAttack(int attack){
        this.attack = attack;
    }

    public void setLife(int life){
        this.life = life;
    }

    public void takeHit(int attackAdversaire){
        setLife(getLife() - attackAdversaire);
    }

    public void takeHit(Warrior ennemy){
        setLife(getLife() - ennemy.getAttack());
    }
}
