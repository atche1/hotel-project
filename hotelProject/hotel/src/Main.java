import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void makeAReservation() {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList();
        for (int i = 101; i <= 105; i++) {
            numbers.add(i);
        }
        System.out.println("ROOM NUMBERS: " + numbers + " ");
        System.out.println("Enter room number: ");
        int roomNumber = input.nextInt();
        if (roomNumber == 101 || roomNumber == 102 || roomNumber == 103 || roomNumber == 104 || roomNumber == 105){
            System.out.println("Start date: ");
            String startDate = input.next();
            System.out.println("End date: ");
            String endDate = input.next();
            System.out.println("Enter notes: ");
            String notesText = input.next();
            System.out.println("Reservation was created!");

        }
        else{
            System.out.println("Room number " + roomNumber + " is not available!");
        }
        if (roomNumber == 101){
            numbers.remove(0);
        }
        else if (roomNumber == 102){
            numbers.remove(1);
        }
        else if (roomNumber == 103){
            numbers.remove(2);
        }
        else if (roomNumber == 104){
            numbers.remove(3);
        }
        else if (roomNumber == 105){
            numbers.remove(4);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please select what you want to do (1 - Make a reservation; 2- List free rooms; 3 - Checkout room; 4 - Stats; 5 - Find a room; 6 - Update a room)");
        System.out.print("Enter your choice: ");
        int choiceNumber = input.nextInt();
        if (choiceNumber == 1){
            makeAReservation();
        }

    }
}