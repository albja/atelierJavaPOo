public class Arena {

    public static void main(String[] args) {

        Monster monstreA = new Monster("Monstre A", 2, 12);
        Monster monstreB = new Monster("Monstre B", 3, 9);

        // jusqu'à ce que 1 des 2 soit ko
        // Tant que les 2 ne sont pas KO

        while (monstreA.getLife() > 0 && monstreB.getLife() > 0) {

            monstreB.attack(monstreA);

            if (monstreA.getLife() > 0) {
                monstreA.attack(monstreB);
            }

        }

        System.out.println("Fin du combat.");

    }

}