"""Problem 6 sum square difference
The sum of the squares of the first ten natural numbers is,
12 + 22 + ... + 102 = 385

The square of the sum of the first ten natural numbers is,
(1 + 2 + ... + 10)2 = 552 = 3025

Hence the difference between the sum of the squares of the first ten natural numbers 
and the square of the sum is 3025 − 385 = 2640.

Find the difference between the sum of the squares of the first 
one hundred natural numbers and the square of the sum."""
def sumSquares(n):
   if n == 1:
       return 1
   else:
       return (n ** 2) + sumSquares(n - 1)

def add(n):
   if n == 0:
       return 0
   else:
       return n + add(n - 1) 

print (add(100) ** 2) - sumSquares(100)
