package com.xworkz.Thursday;

public class Runnermain {

    public static void main(String[] args) {

        Clip[] clips = {
                new Clip(Colour.RED),
                new Clip(Colour.BLUE),
                new Clip(Colour.GREEN),
                new Clip(Colour.BLACK)
        };

        Pushpa pushpa = new Pushpa();
        pushpa.useClip(clips);

        Ticket ticket = new Ticket(TicketType.VIP, 500.0);
        Cricket cricket = new Cricket(ticket);
        Brush brush = new Brush(Colour.BLUE);

        Virat virat = new Virat(brush, clips, ticket, cricket);
    }
}