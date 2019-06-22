import time 
dictionary = {}
def solution():
    eightynine = 0
    one = 0
    for i in range(1,1000001):
        if createChain(i,dictionary)[-1] == 1:
            one += 1
        else:
            eightynine += 1
    return eightynine

def createChain(num,dictionary):
    chain = [num]
    while num != 1 and num != 89:
        if num in dictionary:
            return [dictionary[num]]
        chain.append(squareDigits(num))
        num = squareDigits(num)
    for i in chain:
        dictionary[i] = chain[-1]
    return chain 
        
def squareDigits(num):
    sum = 0 
    for digit in str(num):
        sum += int(digit) ** 2 
    return sum
  
start = time.time()
print solution()
end = time.time()
print end - start 