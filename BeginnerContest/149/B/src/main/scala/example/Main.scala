object Main extends App {
  import io.StdIn._
  val inputs = readLine().split(' ')
  val a1 = inputs(0).toLong
  val b1 = inputs(1).toLong
  val K = inputs(2).toLong
  val (a2, b2) = if (a1 >= K) {
    (a1 - K, b1)
  } else if (a1 + b1 >= K) {
    (0L, b1 - (K - a1))
  } else {
    (0L, 0L)
  }
  println(s"$a2 $b2")
}
