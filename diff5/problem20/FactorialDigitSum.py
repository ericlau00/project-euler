def FactorialDigitSum():
    print digitSum(factorial(100))
    
def digitSum(num):
    if (num <= 10):
        return num
    else :
        return digitSum(num % 10) + digitSum(num / 10)

def factorial(num):
    product = 1
    for i in range(1,num + 1):
        product *= i
    return product
    
FactorialDigitSum()