package Module6;

/**
 * Created by aleks_000 on 06.01.2017.
 */
public class Main {
    public static void main(String[] args) {
        User[] users = new User[4];
        users[0]= new User(1, "Brill", "Nice", 3638, 94876);
        users[1]= new User(2, "Edward", "White", 3346, 15865);
        users[2]= new User(3, "Bob", "Singlar", 3563, 7346);
        users[3]= new User(1, "Alex", "Bukowski", 3700, 7547);


        for (User user : UserUtils.uniqueUsers(users)){
            System.out.println(user.getFirstName());
        }
        for (User user : UserUtils.usersWithContitionalBalance(users, 7000))
            System.out.println(user.getFirstName());
    }
    
}
