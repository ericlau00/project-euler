import time
import math 
def solution():
    done = False
    test = 10
    a = []
    while not done:
        if inSequence(test):
            a.append(test)
        test += 1
        done = len(a) == 30
    print a
    
def inSequence(n):
    sum = sumDigits(n)
    if sum == 1:
        return False 
    exponent = str(math.log(n, sum))
    return exponent[len(exponent)-2:] == ".0"
    # power = 1
    # while sum ** power <= n:
        # if sum**power == n:
            # return True 
        # power+=1
    # return False 
    
def sumDigits(n):
    if n < 10:
        return n
    else:
        return sumDigits(n/10) + sumDigits(n % 10)

start = time.time()
solution()
end = time.time()
print end-start 