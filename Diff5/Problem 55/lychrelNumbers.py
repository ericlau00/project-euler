def lychrelNumbers():
    lychrel = 0
    for num in range(1, 10000):
        if isLychrel(num):
            lychrel += 1
    print lychrel
    
def isLychrel(num):
    newNum = num 
    for i in range(50):
        newNum, isPalindrome = produce(newNum)
        if isPalindrome:
            return False 
    return True 

def produce(num):
    opposite = int(str(num)[::-1])
    sum = num + opposite
    for i in range(len(str(sum)) / 2):
        if not str(sum)[i] == str(sum)[-1 - i]:
            return sum, False
    return sum, True
    
lychrelNumbers()
