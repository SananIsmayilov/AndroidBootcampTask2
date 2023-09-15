class Task2 {
    //km change Mile
    fun km_ch_mile(km: Double): Double {
        val mile = km * 0.621
        return mile
    }

    /* The area of the rectangle whose sides are entered as parameters and
    A method that calculates*/
    fun area(width: Double, length: Double) {
        val area = width * length
        println(area.toString())
    }

    // Factorial
    fun factorial(number: Int): Int {
        var fact = 1
        for (i in 1..number) {
            fact = fact * i
        }
        return fact
    }

    // Search char
    fun searchchar(string: String, char: Char) {
        var s = 0
        for (i in 0 until string.length) {
            if (string[i] == char) {
                s++
            }
        }
        println("$char to $string : $s")
    }

    //The method that calculates and returns the parking fee according to the parking time entered as a parameter
    /*1 saat = 50 ₺
     1 saat aşımından sonra her 1 saat , 10 ₺’dir.*/
    fun parkingpay(hour: Int): Int {
        var pay = 0
        if (hour <= 1) {
            pay = 10
        } else {
            pay = hour * 10
        }
        return pay
    }


}