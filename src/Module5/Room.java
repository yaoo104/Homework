package Module5;

import sun.util.calendar.BaseCalendar;

import java.util.Date;

/**
 * Created by aleks_000 on 04.01.2017.
 */
public class Room{
    private long id;
    private int price;
    private int person;
    private Date dateAvailableFrom;
    private String hotelName;
    private String cityName;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Room room = (Room) o;

        if (price != room.price) return false;
        if (person != room.person) return false;
        return cityName.equals(room.cityName);

    }

    @Override
    public int hashCode() {
        int result = price;
        result = 31 * result + person;
        result = 31 * result + cityName.hashCode();
        return result;
    }

    public Room (long id, int price, int person, Date dateAvailableFrom, String hotelName, String cityName) {
        this.id = id;
        this.price = price;
        this.person = person;
        this.dateAvailableFrom = dateAvailableFrom;
        this.hotelName = hotelName;
        this.cityName = cityName;

    }

        public long getId () {
            return id;
        }

    public void setId(long id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setPerson(int person) {
        this.person = person;
    }

    public void setDateAvailableFrom(Date dateAvailableFrom) {
        this.dateAvailableFrom = dateAvailableFrom;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getPerson() {
        return person;
    }

    public Date getDateAvailableFrom() {
        return dateAvailableFrom;
    }

    public String getHotelName() {
        return hotelName;
    }

    public String getCityName() {
        return cityName;
    }
}


