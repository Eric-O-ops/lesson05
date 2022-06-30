import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        for (Hero getHero:createHeroes()) {
            System.out.println("Health hero: [" + getHero.getHealth() +  "] Damage: [" + getHero.getDamage() + "] Ability: ["
                    + getHero.getAbility() + "]");
        }
        System.out.println();

        Boss boss = new Boss();
        boss.setAbility("Immunity to fire");
        boss.setDamage(200);
        boss.setHealth(500);
        System.out.println("Health Boss: [" + boss.getHealth()+ "] Damage: [" + boss.getDamage() + "] Ability: ["
                + boss.getAbility() + "]");


    }

    public static Hero[] createHeroes(){
        Hero magic = new Hero(100,70);
        Hero golem = new Hero(250, 20,"Block 5% of damage boss");
        Hero thor = new Hero(170, 50,"Can stun enemy");

         Hero[] heroes = {magic, golem,thor};


        return heroes;

    }
}