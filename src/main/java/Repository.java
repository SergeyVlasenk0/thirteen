public class Repository {

    private Ticket[] tickets = new Ticket[0];

    public Ticket[] findAll() {

        return tickets;
    }

    public void add(Ticket ticket) {
        Ticket[] tmp = new Ticket[tickets.length + 1];
        for (int i = 0; i < tickets.length; i++) {
            tmp[i] = tickets[i];
        }
        tmp[tmp.length - 1] = ticket;
        tickets = tmp;

    }

    public void remove(int removeId) {

        if (findById(removeId) == null) {
            throw new NotFoundException(removeId);
        }

        Ticket[] tmp = new Ticket[tickets.length - 1];
        int indexCopyTo = 0;
        for (Ticket ticket : tickets) {
            if (ticket.getId() != removeId) {
                tmp[indexCopyTo] = ticket;
                indexCopyTo++;
            }
        }
        tickets = tmp;
    }

    public Ticket findById(int id) {
        for (Ticket ticket : tickets) {
            if (ticket.getId() == id) {
                return ticket;
            }
        }
        return null;
    }
}

