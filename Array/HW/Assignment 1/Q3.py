def removeDamagedTickets(tickets, t):
    occurrence_count = 0
    new_tickets = []
    for val in tickets:
        if val == t:
            if occurrence_count % 2 == 0:
                occurrence_count += 1
                continue
            occurrence_count += 1
        new_tickets.append(val)

    while len(new_tickets) < len(tickets):
        new_tickets.append(0)

    return new_tickets


if __name__ == "__main__":
    tickets = [4, 9, 4, 2, 4, 7, 4, 0]
    t = 4

    print(removeDamagedTickets(tickets, t))
