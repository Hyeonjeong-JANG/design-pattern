package ex07factory;

import ex07factory.lib.DB;
import ex07factory.lib.Driver;

public class App {
    public static void main(String[] args) {
        DBFactory factory = DBFactory.getInstance();
        DB oralceDB = factory.createDB(Driver.MARIA); // DB, MaraiDB
        oralceDB.execute("select");
    }
}