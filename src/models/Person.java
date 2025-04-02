package models;

public class Person {
    
    private String name;
    private int age;

    public Person (){                                                   //el constructor se ejecuta para instanciar la clase (lo de new Person), new Person ejecuta lo de public Person y el mensaje
        //constructor vacio para no recibir args
        System.out.println("Clase persona creada");
    }
    //public Person(String name, int age){
    //    System.out.println("Como puse new persona con los dos argumentos ahora sale este mensaje");
    //}

    public Person(String name, int age){  //este constructor inicializa mis variables
        this.name=name;
        this.age=age;

    }

    public String getName(){    // esto se hace porq los atributos son privados, se hace para acceder desde otros archivos"
        return name;
    }

    //Setter
    public void setName(String name){
        this.name=name;
    }                           //

    public int getAge() {       //con ctrl + . podemos crear constructores y estos que se llaman getter and setter (o algo asi)
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString(){
        return "La papu persona [nombre: " + name + ", edad: " + age +"]";
    }

    
}
