import time 
def solution():
    number = 0 
    i = 1
    while i < 10**10:
        if not isBouncy(i):
            number += 1 
        i+=1
    return number 

def isIncreasing(n):
    if n < 10: 
        return True
    index = 0 
    for digit in str(n): 
        index += 1
        for otherDigits in str(n)[index:]:
            if int(digit) > int(otherDigits):
                return False 
    return True 

def isDecreasing(n):
    if n < 10:
        return True 
    index = 0 
    for digit in str(n):
        index += 1
        for otherDigits in str(n)[index:]:
            if int(digit) < int(otherDigits):
                return False 
    return True 
    
def isBouncy(n):
    return not isIncreasing(n) and not isDecreasing(n)
  
start = time.time()  
print solution()
end = time.time()
print end - start 