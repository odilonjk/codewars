//  Problem: https://www.codewars.com/kata/55a2d7ebe362935a210000b2
object FindTheSmallestIntegerInTheArray {

  def findSmallestInt(nums:List[Int]):Int = nums.reduceLeft(_ min _)

}