def circularPrimes():
    total = 0
    for i in range(3, 1000000, 2):
        if isCircularPrime(i): 
            total += 1
    print total + 1
    
def isCircularPrime(num):
    digits = []
    rotates = []
    for digit in str(num):
        digits.append(digit)
    for i in range(len(digits)):
        toApp = ""
        for digit in range(len(digits)):
            toApp += digits[digit - i]
        rotates.append(int(toApp))
    for numbers in rotates:
        if not isPrime(numbers):
            return False 
    return True 

def isPrime(num):
    i = 2
    while i < num / i + 1:
        if num % i == 0:
            return False 
        i+= 1
    return True 
    
circularPrimes()