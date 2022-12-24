public class Ticket implements Comparable<Ticket>{
    private int id;
    private String from;
    private String to;
    private int price;
    private int time;

    public Ticket(int id, String from, String to, int price, int time) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.price = price;
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public int getPrice() {
        return price;
    }

    public int getTime() {
        return time;
    }

    @Override
    public int compareTo(Ticket o) {
        return price - o.price;
    }
}
