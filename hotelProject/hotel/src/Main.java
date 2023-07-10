import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void updateARoom() {
        Scanner input = new Scanner(System.in);
        String[] roomNo101 = {"No","Sea"};
        String[] roomNo102 = {"Yes","Sea","Cot"};
        String[] roomNo103 = {"No","Garden"};
        String[] roomNo104 = {"Yes","Mountain"};
        String[] roomNo105 = {"No","Mountain"};
        System.out.println("Do you want breakfast? - answer with Yes or No.");
        String breakfastAnswer = input.next();
        System.out.println("Do you need a cot? - if you need answer with Cot and if you do not need answer with No.");
        String cotAnswer = input.next();
        System.out.println("What do you want to see from your room? - answer with Sea, Garden or mountain.");
        String viewAnswer = input.next();
        for (int i = 0; i < roomNo101.length; i++) {
            if (breakfastAnswer.equals(roomNo101[i])){
                System.out.println("Room without breakfast: 101");
            }
            else if (cotAnswer.equals(roomNo101[i])){
                System.out.println("Room with cot: 101");
            }
            else if (viewAnswer.equals(roomNo101[i])){
                System.out.println("Room with view of the sea: 101");
            }
        }
        for (int i = 0; i < roomNo102.length; i++) {
            if (breakfastAnswer.equals(roomNo102[i])){
                System.out.println("Room with breakfast: 102");
            }
            else if (cotAnswer.equals(roomNo102[i])){
                System.out.println("Room with cot: 102");
            }
            else if (viewAnswer.equals(roomNo102[i])){
                System.out.println("Room with view of the sea: 102");
            }
        }
        for (int i = 0; i < roomNo103.length; i++) {
            if (breakfastAnswer.equals(roomNo103[i])){
                System.out.println("Room without breakfast: 103");
            }
            else if (cotAnswer.equals(roomNo103[i])){
                System.out.println("Room with cot: 103");
            }
            else if (viewAnswer.equals(roomNo103[i])){
                System.out.println("Room with view of the garden: 103");
            }
        }
        for (int i = 0; i < roomNo104.length; i++) {
            if (breakfastAnswer.equals(roomNo104[i])){
                System.out.println("Room with breakfast: 104");
            }
            else if (cotAnswer.equals(roomNo104[i])){
                System.out.println("Room with cot: 104");
            }
            else if (viewAnswer.equals(roomNo104[i])){
                System.out.println("Room with view of the mountain: 104");
            }
        }
        for (int i = 0; i < roomNo105.length; i++) {
            if (breakfastAnswer.equals(roomNo105[i])){
                System.out.println("Room without breakfast: 105");
            }
            else if (cotAnswer.equals(roomNo104[i])){
                System.out.println("Room with cot: 105");
            }
            else if (viewAnswer.equals(roomNo104[i])){
                System.out.println("Room with view of the mountain: 105");
            }
        }



    }

    public static void listFreeRooms(int number) {
        ArrayList<Integer> numbers = new ArrayList();

    }

    public static void findARoom() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of beds: ");
        int numOfBeds = input.nextInt();
        System.out.print("Enter start date: ");
        String startDate = input.next();
        String[] startElements = startDate.split("\\.");
        int startDays = Integer.parseInt(startElements[0]);
        System.out.println("Enter end date: ");
        String endDate = input.next();
        String[] endElements = endDate.split("\\.");
        int endDays = Integer.parseInt(endElements[0]);
        int nOfTimes = endDays - startDays;
        if (numOfBeds > 1 && numOfBeds <= 3 || nOfTimes > 1 && nOfTimes <= 3){
            System.out.println("Available rooms:");
            System.out.println("~102~");
            System.out.println("~103~");
        }
        else if (numOfBeds == 1 || nOfTimes == 1){
            System.out.println("Available rooms:");
            System.out.println("~101~");
        }
        else
        {
            System.out.println("Available rooms:");
            System.out.println("~104~");
            System.out.println("~105~");
        }
    }

    public static void makeStats() {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Start date: ");
        String startDate = input.next();
        String[] startElements = startDate.split("\\.");
        int startDays = Integer.parseInt(startElements[0]);
        System.out.println("End date: ");
        String endDate = input.next();
        String[] endElements = endDate.split("\\.");
        int endDays = Integer.parseInt(endElements[0]);
        int nOfTimes = endDays - startDays;
        System.out.println("This shows you how many times a room is used in " + nOfTimes + " days.");
            int randomNumber = random.nextInt(nOfTimes);
        for (int i = 101; i <=105 ; i++) {
            randomNumber = random.nextInt(nOfTimes);
            System.out.println(i + ": " + randomNumber);
        }
        }

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
            List<String> information = new ArrayList<>();
            information.add("Room number: " + roomNumber);
            information.add("Start date: " + startDate);
            information.add("End date: " + endDate);
            information.add("Notes: " + notesText);
            System.out.println(information);
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
        System.out.println("Please select what you want to do (1 - Make a reservation; 2- List free rooms; 3 - Checkout room; 4 - Stats; 5 - Find a room; 6 - Update a room; 7 - End)");
        System.out.print("Enter your choice: ");
        int choiceNumber = input.nextInt();
        if (choiceNumber == 1){
            makeAReservation();
        }
        if (choiceNumber == 4){
            makeStats();
        }
        if (choiceNumber == 5){
            findARoom();
        }
        if (choiceNumber == 6){
            updateARoom();
        }
        while(choiceNumber != 7){
            System.out.println("Please select what you want to do (1 - Make a reservation; 2- List free rooms; 3 - Checkout room; 4 - Stats; 5 - Find a room; 6 - Update a room; 7 - End)");
            System.out.print("Enter your choice: ");
            choiceNumber = input.nextInt();
            if (choiceNumber == 1){
                makeAReservation();
            }
            if (choiceNumber == 4){
                makeStats();
            }
            if (choiceNumber == 5){
                findARoom();
            }
            if (choiceNumber == 6){
                updateARoom();
            }

        }
    }
}