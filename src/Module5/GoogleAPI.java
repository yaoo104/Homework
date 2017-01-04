package Module5;

import java.util.Date;

/**
 * Created by aleks_000 on 04.01.2017.
 */
public class GoogleAPI implements API {
    public Room[] rooms;

    public GoogleAPI() {
        Date date = new Date();
        rooms = new Room[5];
        rooms[0] = new Room(9638541, 550, 1, date, "The Cosmopolitan", "Лас-Вегас");
        rooms[1] = new Room(36487952, 220, 2, date, "Burj Al Arab", "Дубай");
        rooms[2] = new Room(35862, 140, 2, date, "KharkivPalace", "Kharkiv");
        rooms[3] = new Room(156, 170, 2, date, "Hilton", "New York");
        rooms[4] = new Room(2175, 140, 2, date, "Universal's ", "Орландо");

    }

    @Override
    public Room[] findRooms(int price, int person, String city, String hotel) {
        return new Room[0];
    }

    @Override
    public Room[] getRooms() {
        return new Room[0];
    }

    @Override
    public Room[] getAll() {
        return new Room[0];
    }
}
