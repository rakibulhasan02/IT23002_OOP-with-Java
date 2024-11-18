public class Ch1Ex10 {
    public static void main(String[] args) {
        double kilometers=14;
        double totalMinutes=45+30.0/60;
        double totalHours=totalMinutes/60.0;
        double kilometersToMiles=1.6;
        double miles =kilometers/kilometersToMiles;
        double averageSpeed =miles/totalHours;
        System.out.println("The average speed is "+averageSpeed+" miles per hour");

    }
}
