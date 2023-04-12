public class Monster {

    private String name;
    private int damage;
    private int life;

    public Monster(String name, int damage, int life) {
        this.name = name;
        this.damage = damage;
        this.life = life;

    };

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return this.damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;

    }

    public int getLife() {
        return this.life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public void attack(Monster name) {
        name.setLife(name.getLife() - this.damage);
        if (name.getLife() > 0) {
            System.out.println(this.name + " has " + name.getLife() + " points remaining.");
        } else {
            System.out.println(this.name + " is KO!");
        }
        ;
    }
}