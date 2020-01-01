object Main extends App {
  import io.StdIn._
  val x = readLine().toInt
  var primesUnderX: List[Int] = List.empty
  for (i <- 2 to Math.sqrt(x).toInt) {
    if (!primesUnderX.exists(p => i % p == 0)) {
      primesUnderX = i :: primesUnderX
    }
  }
  var ans = x
  while (primesUnderX.exists(p => ans % p == 0)) {
    ans += 1
  }

  println(ans)
}
