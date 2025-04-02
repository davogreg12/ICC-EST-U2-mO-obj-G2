package views;

import models.Person;

public class viewConsole {

    public void showMessage(String message){
        System.out.println(message);
    }

    public void printPeopleList(Person[] people){
        for (Person person : people){  //este es un for each creo
            System.out.println(person);
        }
    }
}
