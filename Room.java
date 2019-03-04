package hotel.management;

public class Room {
    
    private String roomType = "Standard";
    private int roomPrice = 200;
    private int roomMaxPeople = 2;
    
    public void Room(){
    roomType = "Standard";
    roomPrice = 200;
    roomMaxPeople = 2;
}
    public int getPrice() {
        return roomPrice;
    }

    public int getMaxPeople() {
        return roomMaxPeople;
    }

    public String getRoomType() {
        return roomType;
    }

    public void upgradeRoom() {
        roomType = "Premium";
        roomPrice = 300;
    }

    public void addBed() {
        roomMaxPeople++;
        roomPrice = 225;
    }
}
