def pandigitalPrime():
    for i in range(1,9000000,2):
        if isPandigital(i) and isPrime(i):
            print i
    
def isPrime(number):
    i = 2
    while i < number / i + 1:
        if number % i == 0:
            return False
        i += 1
    return True

def isPandigital(number):
    reference = ""
    for i in range(1, len(str(number)) + 1):
        reference += str(i)
    for digit in reference:
        reference = reference.replace(digit, "", 1)
        number = str(number).replace(digit,"",1)
    return reference == number 

pandigitalPrime()