package com.Youcode.Exercice1;

public class test {
    public static void main(String[] args) {


    //5 Employees
        Employee Employee1 = new Employee("Employee1", "Employee1", "Casablanca", 1995, 6000);
        Employee Employee2 = new Employee("Employee2", "Employee2", "Casablanca", 1995, 6000);
        Employee Employee3 = new Employee("Employee3", "Employee3", "Casablanca", 1995, 6000);
        Employee Employee4 = new Employee("Employee1", "Employee4", "Casablanca", 1995, 6000);
        Employee Employee5 = new Employee("Employee1", "Employee5", "Casablanca", 1995, 6000);

    //2 Chefs
        Chef Chef1 = new Chef("Chef1","Chef1", "Casa", 1993, 8000, "Securite");
        Chef Chef2 = new Chef("Chef2","Chef2", "Casa", 1993, 8000, "Technique");

    //1 Directeur
        Directeur Directeur1 = new Directeur("Directeur1","Directeur1", "Casa", 1990, 10000, "Technique", "XML");


    //Output
        Directeur1.Afficher();



    }
}
