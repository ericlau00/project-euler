def doubleBasePalindrome():
    sum = 0
    for i in range(1, 1000000):
        if isPalindrome(str(i)) and isPalindrome(toBase2(str(i))):
            sum += i
    print sum 

def isPalindrome(num):
    i = 0
    while i < len(num):
        if num[i] != num[-1 - i]:
            return False 
        i += 1
    return True 

def toBase2(num):
    if int(num) == 0:
        return "0"
    if int(num) == 1:
        return "1"
    return toBase2(int(num) / 2) + toBase2(int(num) % 2)
        
doubleBasePalindrome()