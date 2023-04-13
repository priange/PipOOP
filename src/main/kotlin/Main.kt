fun main() {
   var man=Human("Ityaku",24,67.8)
    man.eat(7)
    man.speak("I love education")
   man.birthday()

    var use=User("Priscila Evangelin","Ityaku","ityakup@gmail.com",775387676,"lovelyGod")
    use.name()

    var vehicles=Vehicle("Hilux","MDX45",2001)
vehicles.start()

var moving=Car("Hilux","MDX45",2001,"Green")
    moving.come()
    moving.start()

    var animals=Animal("Dogs","huhuhuhuuuuuu")
    animals.makeSound()

    var typies=newType("Wolves","auuuuuhhhh")
    typies.types()
    typies.makeSound()

    val dogs=Dog("dog","woof")
    dogs.tammed()
    dogs.makeSound()

    var cats=Cat("Cat","Meow")
    cats.simple()
    cats.makeSound()

    val persons=Person("Ms.Anabo Jane",43)
    persons.introduce()

    var studies=Student("Irene Apiyo",14,7)
    studies.study()


    var employed=Employee("CEO","Ms.Jane Anabo",43)
    employed.work()

}


//1. Create a class called Human with these attributes: name, age, weight. It has
//the following functions:
//- eat(foodWeight: Int) :Prints “I am eating {foodWeight} kgs of food”
//and increments the human’s weight by the weight of the food eaten
//(3 points)
class Human(var name:String,var age:Int,var weight:Double){
    fun eat(foodWeight:Int){

        println("$name is eating ${foodWeight}kgs of food")
        var measure=weight+foodWeight
//        measure++
        println(measure)
    }

//- speak(speech: String) :Prints the string passed to it (2
//points)
fun speak(speech:String){

    println(speech)
}
//- birthday( ) :Increments the human’s age by 1 (2
//points)
fun birthday(){
    var x = age
        x++
        println(x)

    }
}
//Create an instance of this human class and invoke all its functions


//2. Create a data class User with these fields: firstName, lastName, email,
//phoneNumber, password. Create an instance of User and print out any 2
//attributes

data class User(var firstName:String,var lastName:String,var email:String,var phoneNumber:Int,var password:String){
   fun name(){
       var a=firstName
       println(a)
       var b=lastName
       println(b)
   }

}
//3.Create a class called Vehicle with properties for make, model, and year.
// Write a method called start that prints "The {make} {model} is starting up."
open class Vehicle(var make:String,var model:String,var year:Int){

   open fun start(){
       println( "The $make $model is starting")

    }

}

//4.Create a class called Car that extends Vehicle and adds a property for color.
// Override the start method to print "The {color} {make} {model} is starting up."
class Car(make:String, model:String,year:Int,var colour:String):Vehicle(make,model, year){
    fun come(){
        println("The ${colour} ${make} ${model} is starting up.")

    }

    override fun start() {
        super.start()
    }

}

//Create a class called Animal with properties for species and sound. Write a method
// called makeSound that prints "{species} says {sound}."
 open class Animal(var species:String,var sound:String){
    open fun makeSound(){
        println("${species} say ${sound}")
    }

}

//5.Create a class called Animal with properties for species and sound. Write a method
// called makeSound that prints "{species} says {sound}."
class newType(species:String,sound:String):Animal(species,sound){
    fun types(){
        println("${species} says ${sound}")
    }

    override fun makeSound() {
        super.makeSound()
    }
}

//6.Create a class called Dog that extends Animal and sets species to "dog"
// and sound to "woof". Override the makeSound method to print "{species} barks {sound}."
class Dog(species:String,sound:String):Animal(species,sound){
    fun tammed(){
        println("${species} barks ${sound}")
    }

    override fun makeSound() {
        super.makeSound()
    }
}

//7.Create a class called Cat that extends Animal and sets species to "cat"
// and sound to "meow". Override the makeSound method to print "{species} meows {sound}."
class Cat(species:String,sound:String):Animal(species,sound){
    fun simple(){
        println("${species} meows ${sound}.")
    }

    override fun makeSound() {
        super.makeSound()
    }
}

//8.Create a class called Person with properties for name and age. Write a method called
// introduce that prints "Hi, my name is {name} and I am {age} years old."
open class Person(var name:String,var age:Int){
    fun introduce(){
        println("Hi my name is ${name} and I am ${age} years old.")
    }
}

//9.Create a data class called Student that extends Person and adds a property for grade.
// Write a method called study that prints "I am studying in grade {grade}."
class Student(name:String,age:Int,var grade:Int):Person(name,age){
    fun study(){
        println("I am studying in grade ${grade}")
    }
}

//10.Create a data class called Employee that extends Person and adds a property for position.
// Write a method called work that prints "I am a {position}."
class Employee(var position:String,name:String,age:Int):Person(name,age){
    fun work(){
        println("I am a ${position}")
    }

}











