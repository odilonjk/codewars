//  Problem: https://www.codewars.com/kata/5648b12ce68d9daa6b000099
object NumberOfPeopleInTheBus {
  def number(busStops: List[(Int, Int)]): Int = busStops.map(p => p._1 - p._2).sum
}