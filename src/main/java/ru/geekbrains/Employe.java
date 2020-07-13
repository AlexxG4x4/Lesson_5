package ru.geekbrains;

class Employe {

   private String fullName;
   private String position;
   private String eMail;
   private String phoneNumber;
   private int salary;
   private int age;

    public Employe(String fullName, String position, String eMail, String phoneNumber, int salary, int age){
       this.fullName = fullName;
       this.position = position;
       this.eMail = eMail;
       this.phoneNumber = phoneNumber;
       this.salary = salary;
       this.age = age;
    }

    public int getAge() {
       return age;
    }
    @Override
    public String toString(){
       return
    "=====================" + '\n' +
         "ФИО - " + fullName + '\n' +
         "Должность - " + position + '\n' +
         "E-mail - " + eMail +'\n' +
         "Зарплата - " + salary + '\n' +
         "Возраст - " + age + "\n" +
    "=====================" + "\n";
    }
}

