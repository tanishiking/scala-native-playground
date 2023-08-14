import scala.scalanative.runtime.struct

object Main {
  @struct class SC1(val b: Int)

  def main(args: Array[String]): Unit = {
    val x = new SC1(5)
    println(x.b)
  }
}
