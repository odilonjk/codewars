//  Problem: https://www.codewars.com/kata/514b92a657cdc65150000006
object MultiplesOf3Or5 {   
    def solution(number: Int): Long = List.range(1, number).map(_.toLong).filter(n => n % 3 == 0 || n % 5 == 0).sum
}