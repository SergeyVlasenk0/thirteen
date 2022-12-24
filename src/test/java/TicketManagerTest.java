import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TicketManagerTest {
    @Test
    public void testFindSomeTickets() {
        Repository repo = new Repository();
        TicketManager manager = new TicketManager(repo);
        Ticket ticket1 = new Ticket(1, "KZN", "MSK", 9000, 120);
        Ticket ticket2 = new Ticket(2, "SPB", "MSK", 7000, 50);
        Ticket ticket3 = new Ticket(3, "KZN", "MSK", 8000, 110);
        Ticket ticket4 = new Ticket(4, "KZN", "EKB", 9900, 60);
        Ticket ticket5 = new Ticket(5, "KZN", "MSK", 7000, 130);
        Ticket ticket6 = new Ticket(6, "MSK", "KZN", 8500, 90);
        Ticket ticket7 = new Ticket(7, "KZN", "MSK", 9900, 100);
        Ticket ticket8 = new Ticket(8, "KZN", "VLG", 6900, 90);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);

        Ticket[] expected = {ticket5, ticket3, ticket1, ticket7};
        Ticket[] actual = manager.findAll("KZN", "MSK");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindOneTicket() {
        Repository repo = new Repository();
        TicketManager manager = new TicketManager(repo);
        Ticket ticket1 = new Ticket(1, "KZN", "MSK", 9000, 120);
        Ticket ticket2 = new Ticket(2, "SPB", "MSK", 7000, 50);
        Ticket ticket3 = new Ticket(3, "KZN", "MSK", 8000, 110);
        Ticket ticket4 = new Ticket(4, "KZN", "EKB", 9900, 60);
        Ticket ticket5 = new Ticket(5, "KZN", "MSK", 7000, 130);
        Ticket ticket6 = new Ticket(6, "MSK", "KZN", 8500, 90);
        Ticket ticket7 = new Ticket(7, "KZN", "MSK", 9900, 100);
        Ticket ticket8 = new Ticket(8, "KZN", "VLG", 6900, 90);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);

        Ticket[] expected = {ticket6};
        Ticket[] actual = manager.findAll("MSK", "KZN");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindNullTickets() {
        Repository repo = new Repository();
        TicketManager manager = new TicketManager(repo);
        Ticket ticket1 = new Ticket(1, "KZN", "MSK", 9000, 120);
        Ticket ticket2 = new Ticket(2, "SPB", "MSK", 7000, 50);
        Ticket ticket3 = new Ticket(3, "KZN", "MSK", 8000, 110);
        Ticket ticket4 = new Ticket(4, "KZN", "EKB", 9900, 60);
        Ticket ticket5 = new Ticket(5, "KZN", "MSK", 7000, 130);
        Ticket ticket6 = new Ticket(6, "MSK", "KZN", 8500, 90);
        Ticket ticket7 = new Ticket(7, "KZN", "MSK", 9900, 100);
        Ticket ticket8 = new Ticket(8, "KZN", "VLG", 6900, 90);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);

        Ticket[] expected = {};
        Ticket[] actual = manager.findAll("KZN", "SPB");

        Assertions.assertArrayEquals(expected, actual);
    }
}
