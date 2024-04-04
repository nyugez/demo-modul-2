package data;

import util.iMenu;

public class Student implements iMenu {
    @Override
    public void menu() {
        System.out.println("Student Menu");
    }

    public void choiceBook() {
        System.out.println("Selecting a book to borrow...");
    }
}