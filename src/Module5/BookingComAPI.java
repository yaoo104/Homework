package Module5;

import java.util.Date;

/**
 * Created by aleks_000 on 04.01.2017.
 */
public class BookingComAPI implements API {
    public Room[] rooms;

    public BookingComAPI() {
        Date date = new Date();
        rooms = new Room[5];
        rooms[0] = new Room(963852741, 150, 1, date, "The Cosmopolitan", "Лас-Вегас");
        rooms[1] = new Room(365552, 250, 2, date, "Burj Al Arab", "Дубай");
        rooms[2] = new Room(36012, 150, 2, date, "KharkivPalace", "Kharkiv");
        rooms[3] = new Room(126, 150, 2, date, "Hilton", "New York");
        rooms[4] = new Room(22543, 150, 2, date, "Universal's Cabana Bay Beach Resort", "Орландо");

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
