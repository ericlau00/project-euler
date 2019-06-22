def powerDigitSum():
    print digitSum(2 ** 1000)
    
def digitSum(num):
    if num < 10:
        return num
    else :
        return digitSum(num % 10) + digitSum(num / 10)
    
powerDigitSum()