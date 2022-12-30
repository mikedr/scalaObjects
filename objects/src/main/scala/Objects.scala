object Objects extends App{

  object Person {
    val N_EYES = 2
    def canFly: Boolean = false
  }
  class Person(val name: String) {

  }

  println(Person.N_EYES)
  println(Person.canFly)

  val robert = new Person("Robert")
  println(robert.name)
}
