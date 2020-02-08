"""Problem 7 10001st prime
What is the 10001st prime number?"""


def numberPrime(x):
    i = 0
    testingNumber = 2
    while i < x:
        if isPrime(testingNumber):
            i += 1
            print i, testingNumber
        if testingNumber == 2:
            testingNumber += 1
        else:
            testingNumber += 2


def isPrime(num):
    factors = 0
    for i in range(1, num + 1):
        if num % i == 0:
            factors += 1
    return factors == 2:


numberPrime(10001)
