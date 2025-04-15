package com.xworkz.poster.hierarchical;

public class Database extends Server {
    void query() {
        System.out.println("Executing database query");
    }

    public static void main(String[] args) {
        Database db = new Database();
        db.connect();
        db.query();
    }
}
