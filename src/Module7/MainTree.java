package Module7;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by aleks_000 on 18.01.2017.
 */
public class MainTree {
    public static void main(String[] args) {

        User user0 = new User(1, "Alex", "Ivanov", "Dnepr", 5000);
        User user1 = new User(2, "Ruslan", "Chacha", "Kyiv", 10000);
        User user2 = new User(3, "Pavel", "Baklajan", "Chernovci", 3000);
        User user3 = new User(4, "Lenya", "Beeer", "Kriviy Rig", 0);
        User user4 = new User(5, "Evgeniy", "Rusakov", "Zaporizhya", 554);
        User user5 = new User(6, "Vasya", "Pypkin", "Kiev", 9550);
        User user6 = new User(7, "Petya", "Petrov", "Kharkov", 2232);
        User user7 = new User(8, "Andrey", "Sidorov", "Lviv", 23000);
        User user8 = new User(9, "Alexandr", "Baar", "Amsterdam", 100000);
        User user9 = new User(10, "Ygin", "Siiza", "NewYork", 50000);

        Set<Order> list = new TreeSet<>();

        list.add(new Order(1, 200, Currency.USD, "Item0", "Indificator0", user0));
        list.add(new Order(2, 1000, Currency.USD, "Item1", "Indificato1", user1));
        list.add(new Order(3, 2000, Currency.USD, "Item2", "Indificator2", user2));
        list.add(new Order(4, 20, Currency.USD, "Item3", "Indificator3", user3));
        list.add(new Order(5, 200, Currency.EUR, "Item4", "Indificator4", user4));
        list.add(new Order(6, 50, Currency.EUR, "Item5", "Indificator5", user5));
        list.add(new Order(7, 900, Currency.USD, "Item6", "Indificator6", user6));
        list.add(new Order(8, 8000, Currency.USD, "Item7", "Indificator7", user7));
        list.add(new Order(9, 71233, Currency.USD, "Item8", "Indificator8", user8));
        list.add(new Order(10, 144, Currency.USD, "Item9", "Indificator9", user9));

        checkForPetrov(list);

        Iterator<Order> iterator = list.iterator();
        System.out.println(iterator.next());

        delUsd(list);
    }

    private static void delUsd(Set<Order> list) {
        Iterator<Order> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getCurrency().equals(Currency.USD)) {
                iterator.remove();
            }
        }
    }

    private static void checkForPetrov(Set<Order> list) {
        for (Order order : list) {
            if (order.getUser().getLastName().equals("Petrov")) {
                System.out.println("Petrov не найден");
            }

        }
    }
}
