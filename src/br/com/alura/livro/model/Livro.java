package br.com.alura.livro.model;

import java.util.Scanner;

public class Livro {
    private String title = "XXX XXX";
    private String author = "AAAA AAAA";
    private double year = 1.954;

    public double getYear() {
        return year;
    }

    public void setYear(double year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    //Technique specifications
    public void specifications(){
        System.out.println("The title of book is: " + title +
                "\nThe author of book is: " + author +
                "\nThe year of book is: " + year);
    }

    //Show if its a new release
    public void newRelease(){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the year of book");
        double newYear = input.nextDouble();

        if (year < newYear){
            System.out.println("The book is not a new release");
        } else {
            System.out.println("The book is a new release");
        }
    }
}
