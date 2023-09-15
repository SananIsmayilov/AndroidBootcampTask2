fun main(args: Array<String>) {
    val task2 = Task2()

    //1: km change Mile
    val mile = task2.km_ch_mile(3.0)
    println("$mile")

    //2 : Area calculates
    task2.area(5.0,3.0)

    //3 : Factorial
    val fact = task2.factorial(5)
    println("${fact}")

    //4 : search char
    task2.searchchar("Salam",'a')

    //5 : Parking Pay
    val pay = task2.parkingpay(3)
    println("$pay")

}