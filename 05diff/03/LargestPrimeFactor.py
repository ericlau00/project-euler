"""Problem 3 Largest prime factor
What is the largest prime factor of the number 600851475143 ?"""


def isPrime(num):
    factors = 0
    for i in range(1, num + 1):
        if num % i == 0:
            factors += 1
    return factors == 2


factor = 0
i = 1
num = 600851475143
while i <= num:
    if 600851475143 % i == 0 and isPrime(i):
        factor = i
        num /= factor
    i += 2

print factor
