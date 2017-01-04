package Module5;

/**
 * Created by aleks_000 on 04.01.2017.
 */
public interface API {
        Room[] findRooms(int price, int person, String city, String hotel);
        Room[] getRooms();

    Room[] getAll();
}


