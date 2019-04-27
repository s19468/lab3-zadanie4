/*
    Zadanie 4: Stworzenie klasy Date używając wzorcu.
    Autor: Rafał Tęcza
    Index: s19468
*/
package pjwstk.lab3.zadanie4;

public class Main {

    public static void main(String[] args) {
        Date date = new Date(20, 4, 2019);
        System.out.println(date);

        date.setDate(5, 2, 1535);
        System.out.println(date);
    }
}
