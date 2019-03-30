def bouncyNumbers():
    bouncy = []
    ratio = 0
    i = 0
    while ratio < 0.99:
        i += 1
        if isBouncy(i):
            bouncy.append(i)
        ratio = len(bouncy) * 1.0 / i
    print i 

def isIncreasing(num):
    for digit in range(len(str(num))):
        for i in range(digit, len(str(num))):
            if str(num)[digit] > str(num)[i]:
                return False 
    return True 

def isDecreasing(num):
    for digit in range(len(str(num))):
        for i in range(digit, len(str(num))):
            if str(num)[digit] < str(num)[i]:
                return False 
    return True 

def isBouncy(num):
    return not isIncreasing(num) and not isDecreasing(num)
bouncyNumbers()