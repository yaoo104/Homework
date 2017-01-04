package Module5;

/**
 * Created by aleks_000 on 04.01.2017.
 */
public interface DAO {
    Room save(Room room);
    boolean delete(Room room);
    Room update(Room room);
    Room findById(long id);
}
