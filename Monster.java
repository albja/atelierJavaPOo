
public class Monster {

    private String name; // nom du monstre
    private int damage; // dégats effectués par le monstre
    private int life; // points de vie du monstre

    public Monster(
            String name,
            int damageParam,
            int life) {
        this.name = name;
        this.damage = damageParam;
        this.life = life;
    }

    public String getName() {
        return this.name;
    }

    public int getDamage() {
        return this.damage;
    }

    public int getLife() {
        return this.life;
    }

    public void setName(String newValue) {
        this.name = newValue;
    }

    public void setDamage(int newValue) {
        this.damage = newValue;
    }

    public void setLife(int newValue) {
        this.life = newValue;
    }

    public void attack(Monster opponent) {

        // monstreA.attack(monstreB);

        // this => monstreA
        // opponent => monstreB

        // l’attribut life du monstre adverse doit se voir soustrait la valeur de
        // l'attribut damage de l'instance en cours.

        // opponent.life -= this.damage
        // opponent.life = 2; // interdit puisque life est private

        int currentOpponentLife = opponent.getLife();
        int newOpponentLife = currentOpponentLife - this.getDamage();

        opponent.setLife(newOpponentLife);

        if (newOpponentLife > 0) {
            // {name} has {life} points remaining.
            System.out.println(opponent.getName() + " has " + newOpponentLife + " points remaining");
        } else {
            // {name} is KO!
            System.out.println(opponent.getName() + " is KO!");
        }

    }

}