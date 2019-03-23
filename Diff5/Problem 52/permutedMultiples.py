def permutedMultiples():
    condition = False 
    i = 0
    while not condition:
        i += 1
        for multiple in range(2,7):
            if sameDigits(str(multiple * i), str(i)):
                condition = True
            else:
                condition = False 
                break
    print i
    
def sameDigits(multiple, num):
    for digit in num:
        num = num.replace(digit,"",1)
        multiple = multiple.replace(digit,"",1)
    return num == multiple
    
permutedMultiples()