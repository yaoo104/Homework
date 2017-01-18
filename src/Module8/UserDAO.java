package Module8;

import java.util.AbstractList;
import java.util.List;

/**
 * Created by aleks_000 on 18.01.2017.
 */
public class UserDAO extends AbstractDAOImpl {
    private long id;
    private String name;

    public UserDAO(long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void save(Object o) {
        super.save(o);
    }
    public long getId() {
        return id;
    }

}
