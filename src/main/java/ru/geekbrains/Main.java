package ru.geekbrains;

public class Main {
    public static void main(String[] args) {
        Employe[] employe = new Employe[5];
        employe[0] = new Employe("Ivanov Ivan Ivanovich", "Engineer", "ivanov@gmail.com", "+79856541213", 10500, 36);
        employe[1] = new Employe("Kozlov Fedor Petrovich", "Manager", "kozlov@mail.ru", "+79652365654", 30000, 50);
        employe[2] = new Employe("Joly Angelina", "Actor", "A-Joly@yandex.ru", "+42564858512", 1000000, 45);
        employe[3] = new Employe("Pit Bred", "Actor", "Pitty@gmail.com", "+8921562114", 2000000, 53);
        employe[4] = new Employe("Kopylova Nadejda Petrovna", "Secretary", "Kopylova_n_p@mail.ru", "+7961565458", 5000, 56);

        getEmployeesInfo(employe);
    }
    public static void getEmployeesInfo (Employe[] employees) {
        for (Employe e : employees) {
            if (e.getAge() > 40) {
                System.out.println(e.toString());
            }
        }
    }
}