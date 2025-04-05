class MovieTicket {
    String movieName;
    String seatType;
    double price;

    MovieTicket() {
        this.movieName = "Not Selected";
        this.seatType = "Regular";
        this.price = 10.0;
    }

    MovieTicket(String movieName) {
        this.movieName = movieName;
        this.seatType = "Regular";
        this.price = 10.0;
    }

    MovieTicket(String movieName, String seatType, double price) {
        this.movieName = movieName;
        this.seatType = seatType;
        this.price = price;
    }

    void display() {
        System.out.println("Movie: " + movieName);
        System.out.println("Seat Type: " + seatType);
        System.out.println("Price: $" + price);
    }

    public static void main(String[] args) {
        MovieTicket t1 = new MovieTicket();
        MovieTicket t2 = new MovieTicket("Inception");
        MovieTicket t3 = new MovieTicket("Avatar", "VIP", 25.0);

        t1.display();
        t2.display();
        t3.display();
    }
}