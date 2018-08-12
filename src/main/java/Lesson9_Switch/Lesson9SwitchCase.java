package Lesson9_Switch;

public class Lesson9SwitchCase {
    public static void main(String[] args) {
        int month = 3;
        String season;

        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "Зима";
                break;
            case 3:
            case 4:
            case 5:
                season = "Весна";
                break;
            case 6:
            case 7:
            case 8:
                season = "Лето";
                break;
            case 9:
            case 10:
            case 11:
                season = "Осень";
                break;
            default:
                season = "Invalid value";

        }

        System.out.println("season is " + season);

    }
}
