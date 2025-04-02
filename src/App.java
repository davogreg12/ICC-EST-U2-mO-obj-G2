import controllers.ManagePeople;
import models.Person;

public class App {
    public static void main(String[] args) throws Exception {  
        
        
        Person person = new Person("Facundo",999999); //aqui como ponemos los dos argumentos  sale el segundo mensaje (si dejara vacio el new person() entonces se imprimiria nombre: null y edad: 0)
        System.out.println();
        System.out.println(person); //si en persona.java no estuviera el @override no se imprimiria el "papu persona...", se imprimiria: models.Person@2f92e0f4
        System.out.println(person.getName());
        ManagePeople mG = new ManagePeople();
        System.out.println();
        mG.sortPeopleByAge(); //aqui se ejecuta el metodo sortPeopleByAge de la clase ManagePeople, que a su vez llama al metodo SortByAge de la clase BubbleSort
        System.out.println();
        mG.sortPeopleByName(); //aqui se ejecuta el metodo sortPeopleByName de la clase ManagePeople, que a su vez llama al metodo sortByname de la clase BubbleSort
        System.out.println();
        mG.sortPeopleByName2(); //aqui se ejecuta el metodo sortPeopleByName2 de la clase ManagePeople, que a su vez llama al metodo sortByname de la clase BubbleSort


        
        //Person persona = new Person(); //aqui sale el primer mensaje porq no puse argumentos como en person.java ((public Person(){ aqui el mensaje } ))
    }
}
