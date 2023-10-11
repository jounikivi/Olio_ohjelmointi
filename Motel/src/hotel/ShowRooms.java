package hotel;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;


public class ShowRooms {

  private ArrayList<Room> rooms;

  public ShowRooms() throws IOException {
    rooms = new ArrayList<>();
    readRoomList();
  }

  public void readRoomList() throws IOException {
    File file = new File("RoomList.txt");
    int roomNumber;
    int numberOfGuests;

    try (java.io.BufferedReader br = new java.io.BufferedReader(new java.io.FileReader(file))) {
      while ((roomNumber = Integer.parseInt(br.readLine())) != -1) {
        numberOfGuests = Integer.parseInt(br.readLine());
        rooms.add(new Room(roomNumber, numberOfGuests));
      }
    }
  }

  public void printRooms() {
    System.out.println("Motellin huoneet");
    System.out.println("Huonenumero | Asukasluku");
    for (Room room : rooms) {
      System.out.println(room.getRoomNumber() + " | " + room.getNumberOfGuests());
    }
  }

  public static void main(String[] args) throws IOException {
    ShowRooms showRooms = new ShowRooms();
    showRooms.printRooms();
  }
}

class Room {

  private int roomNumber;
  private int numberOfGuests;

  public Room(int roomNumber, int numberOfGuests) {
    this.roomNumber = roomNumber;
    this.numberOfGuests = numberOfGuests;
  }

  public int getRoomNumber() {
    return roomNumber;
  }

  public void setRoomNumber(int roomNumber) {
    this.roomNumber = roomNumber;
  }

  public int getNumberOfGuests() {
    return numberOfGuests;
  }

  public void setNumberOfGuests(int numberOfGuests) {
    this.numberOfGuests = numberOfGuests;
  }
}


