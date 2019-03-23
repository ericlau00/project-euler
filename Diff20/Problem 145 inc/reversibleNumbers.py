def reversibleNumbers():
    reversible = []
    for i in range(1,1000):
        if not i in reversible:
            if isReversible(i):
                reversible.append(i)
                reversible.append(int(str(i)[::-1]))
    print reversible
    
def isReversible(num):
    if "0" in str(num)[-1]:
        return False 
    otherNum = int(str(num)[::-1])
    sum = num + otherNum
    for digit in str(sum):
        if int(digit) % 2 == 0:
            return False
    return True 
    
reversibleNumbers()

##0 10 ten 
##20 100 hundred 
##120 1000 thousand 
##720 10000 ten thousand 
##720 100000 hundred thousand 
##4320 200000 two hundred thousand 
##7920 300000 three hundred thousand 
##10620 400000 four hundred thousand 
##1000000 million 
##10000000 ten million 
##100000000 hundred million 
##1000000000 one billion 