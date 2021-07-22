public class BonusMilesService {
    public int calculate(int price) {
       /* int amountTickets = 2;
        int costTicket = 10_000;
        int total = amountTickets * costTicket;*/
        int miles = price / 20;
        System.out.println(miles);
        return miles;
    }
}
