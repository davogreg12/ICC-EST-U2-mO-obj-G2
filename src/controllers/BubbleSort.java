package controllers;

import models.Person;

public class BubbleSort {

    public void SortByAge(Person[] people) {
        for(int i=0;i<people.length-1;i++){
            for(int j=0;j<people.length-1 - i;j++){
                if(people[j].getAge() > people[j+1].getAge()){
                    //System.out.println("Comparando: " + people[j].getAge() + " y " + people[j+1].getAge());
                    //intercambiar
                    Person temp = people[j];
                    people[j]=people[j+1];
                    people[j+1]=temp;
                }
                
            }
        }
    }
    
    public void sortByname(Person[] people){
        for(int i=0;i<people.length-1;i++){
            for(int j=0;j<people.length-1 - i;j++){
                if(people[j].getName().compareTo(people[j+1].getName()) > 0){  //si ponems <0 seria al reves .o.
                    //System.out.println("Comparando: " + people[j].getAge() + " y " + people[j+1].getAge());
                    //intercambiar
                    Person temp = people[j];
                    people[j]=people[j+1];
                    people[j+1]=temp;
                }
                
            }
        }
    }

    public void sortByname2(Person[] people){
        for(int i=0;i<people.length-1;i++){
            for(int j=0;j<people.length-1 - i;j++){
                if(people[j].getName().compareTo(people[j+1].getName()) < 0){
                    //System.out.println("Comparando: " + people[j].getAge() + " y " + people[j+1].getAge());
                    //intercambiar
                    Person temp = people[j];
                    people[j]=people[j+1];
                    people[j+1]=temp;
                }
                
            }
        }
    }
    
}