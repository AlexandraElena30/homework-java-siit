package com.siit.homeworks.homework10.cinema1;

public class CinemaReservationService {
    public static void main(String[] args) {
        CinemaReservationService service = new CinemaReservationService();
        Cinema c1 = new Cinema("Cinema1");

        service.fillSeats(c1);
        service.addReservation(c1, "A01");
        service.addReservation(c1, "A05");
        service.addReservation(c1, "A05");
        service.cancelReservation(c1, "A05");


        service.addReservation(c1, "J10");
        service.printSeats(c1);
    }

    public void fillSeats(Cinema c) {
        char ch = 'A';
        int row = 0;
        for (int i = 1; i <= 100; i++) {
            if (row == 10) {
                ch = (char) (ch + 1);
                row = 0;
            }
            row++;
            if (i % 10 == 0) {
                c.getSeats().put(ch + "10", new Seat(ch + "10"));
            } else {
                c.getSeats().put(ch + "0" + (i % 10), new Seat(ch + "0" + (i % 10)));
            }
        }
    }

    public void printSeats(Cinema c) {
        boolean emptySeats[] = new boolean[100];
        String temp;
        int nr;
        for (String name : c.getSeats().keySet()) {
            String key = name;
            if (c.getSeats().get(name).isReserved() == true) {
                temp = c.getSeats().get(name).getSeatNumber();
                nr = 10 * ('J' - temp.charAt(0)) + Integer.parseInt(temp.substring(1, temp.length())) - 1;

                emptySeats[nr] = true;
            }
            //System.out.println(key + " ");
        }

        System.out.println();
        System.out.println("1 2 3 4 5 6 7 8 9 10");
        int row = 0;
        char ch = 'J';
        for (int i = 0; i < 100; i++) {
            if (i % 10 == 0 && i != 0) {
                System.out.println(ch);
                ch--;
            }
            if (emptySeats[i] == false)
                System.out.print("O ");
            else
                System.out.print("X ");
        }
        System.out.println(ch);

    }

    public boolean addReservation(Cinema c, String s) {

        if (c.getSeats().get(s).isReserved() == false) {
            c.getSeats().replace(s, new Seat(s, true));
            System.out.println("The seat " + s + " has been reserved.");
            return true;
        }
        System.out.println("The seat " + s + " is reserved.Choose another one.");
        return false;
    }

    public boolean cancelReservation(Cinema c, String s) {

        if (c.getSeats().get(s).isReserved() == true) {
            c.getSeats().replace(s, new Seat(s, false));
            System.out.println("The seat " + s + " reservation was cancelled");
            return true;

        }
        System.out.println("The seat " + s + " wasn't reserved previously.");
        return false;
    }


}
