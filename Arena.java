public class Arena {
    public static void main(String[] args) {

        Monster monster1 = new Monster("Guigui", 6, 21);

        Monster monster2 = new Monster("Di", 3, 18);
        // Monster maxime = new Monster("Maxime", 3, 11);
        // Monster jibé = new Monster("Jibé", 8, 17);
        while (monster1.getLife() > 0 && monster2.getLife() > 0) {

            monster1.attack(monster2);
            if (monster2.getLife() <= 0) {

            }
            monster1.attack(monster2);

        }

    }

}