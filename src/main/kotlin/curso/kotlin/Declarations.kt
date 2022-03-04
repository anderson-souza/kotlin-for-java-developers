package curso.kotlin

fun main(args: Array<String>) {
    // VAL is Immutable
    // VAR is Muttable

    var number: Int = 25

    number = 10

    val employee1 = Employee("Anderson Souza", 1)
    employee1.name = "Anderson Pereira de Souza"

    val employee2: Employee
    val number2 = 100

    if (number < number2) {
        employee2 = Employee("Clara Gabriela", 2)
    } else {
        employee2 = Employee("Pedro de Lara", 3)
    }

    val employersSet: MutableList<Employee> = arrayListOf(employee1, employee2)

    employersSet[1]

    

    println(employersSet)
}

class Employee(var name: String, val id: Int)
