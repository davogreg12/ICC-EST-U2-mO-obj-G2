package controllers;

import views.viewConsole;
import models.Person;

public class ManagePeople {

    private viewConsole vista;
    private BubbleSort sorting;
    private Person[] people;

    public ManagePeople() {
        //instancia de clases
        this.vista = new viewConsole();
        this.sorting = new BubbleSort();

        //instancia de variables
        this.people = new Person[5];  //creacion 5 espacios
        this.people[0] = new Person("Alice",30);
        this.people[1] = new Person("Bob",25);
        this.people[2] = new Person("Charlie",35);
        this.people[3] = new Person("David", 20);
        this.people[4] = new Person("Eve",28);

        vista.showMessage("CLASE MANAGE PEOPLE CREAR");
        vista.printPeopleList(people); //esta parte es clave para imprimir la lista anterior, por eso se imprime luego del anterior mensaje
    }
    
    public void sortPeopleByAge(){
        vista.showMessage("---Personas por edad---");
        sorting.SortByAge(people);
        vista.printPeopleList(people);


    }
    public void sortPeopleByName(){
        vista.showMessage("---Personas por nombre (de mayor a menor)---");
        sorting.sortByname(people);
        vista.printPeopleList(people);
    }
    public void sortPeopleByName2(){
        vista.showMessage("---Personas por nombre (de menor a mayor)---");
        sorting.sortByname(people);
        vista.printPeopleList(people);
    }
}
