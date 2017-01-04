package Module5;

import java.util.Date;

/**
 * Created by aleks_000 on 04.01.2017.
 */
public class TripAdvisorAPI implements API {
    public Room[]rooms;

    public TripAdvisorAPI() {
        Date date = new Date();
        rooms= new Room[5];
        rooms[0] = new Room(121, 150, 2, date, "Hilton", "New York");
        rooms[1] = new Room(96302741, 150, 1, date, "The Cosmopolitan", "Лас-Вегас");
        rooms[2] = new Room(1961, 200, 1, date, "Drury Plaza ", "Сан-Антонио");
        rooms[3] = new Room(2643, 150, 2, date, "Universal's Cabana Bay Beach Resort", "Орландо");
        rooms[4] = new Room(365134, 250, 2, date, "Burj Al Arab", "Дубай");

    }

    @Override
    public Room[] findRooms(int price, int person, String city, String hotel) {
        return new Room[0];
    }

    @Override
    public Room[] getRooms() {
        return new Room[0];
    }
}
