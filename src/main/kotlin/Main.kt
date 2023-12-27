import java.util.*

fun main() {
    val car1 = Car("Test",123)
    val car2 = Car("Test1",456)
   // car1.name = "123"
    println(car1.name)

    println("Hello")
    val x: Int = 100
   // x = 200
    var y: Int = 200
    y = 300
    var z = 300
  //  val (a,b) = readln().split(" ").map{ it.toInt() }
  //  val a1 = readln().toInt()
 //   val a2 = readln().toInt()
  //  println("$a $b")
   // println("a="+a+", b="+b)
  //  println("a=${a+100}, b=${b+100*2}")
    val scanner = Scanner(System.`in`)
  //  val b1 = scanner.nextInt()
  //  val c1 = scanner.nextInt()

    val r = sum(1,2)

    // NPE - Null Pointer Exception
    var s : String? = "Test"
    s = null
    var p : Int? = 0
    p = null

    val result = if(s != null) s.length else -2

    val result2 = s?.length ?: -1

   // val k = readln().toInt()
    val k =100
    when(k) {
        1 -> println("123123")
        2,3 -> println("456456")
        else -> println("234234")
    }
    val a = 2
    val b = 3
    when {
        (x>1 && y==3) -> { var f = 0; println("123123123") }
        (a==3 || b>-1) -> { println("234234") }
    }
    repeat(4) {
        println("123123")
    }
    val numbers = 1..10 // range
    for(i in numbers) {

    }
    for(i in 10 downTo 0 step 3) {
        println("i="+i)
    }
    for(i in 1..<100) {

    }
    val names = arrayOf("Ivan","Petr","Oleg")
    for(n in names) {
        println(n)
    }
    for(i in names.indices) {
        if(i % 2 == 0) {
            println(names[i])
        }
    }

    val f = { var p=0; p++; println("!!!") }
    f()
    val f1 : () -> Unit = { var p=0; p++; println("!!!") }
    val f2: (Int, Int) -> Int = { a: Int, b: Int ->
        if(a>4 || b==3) {
            200 * (a + b)
        } else {
            6
        }
    }
    println(f2(100,200)) // 6
    val result_ = bigFun(1)(1,2,3)
    val result2_ = bigFun(2)(3,4,5) // 100
}

fun bigFun(key: Int) : (Int, Int, Int) -> Int {
    when(key) {
        1 -> return { a ,b , c -> a*a+b*b+c} // lambda function
        2 -> return fun(a, b, c) = 100  // anonym function
        else -> return fun (a, b, c) = 0
    }
}


fun sum(a: Int, b: Int) : Int {
    return a+b
}
fun sum2(a: Int, b: Int) = a+b
