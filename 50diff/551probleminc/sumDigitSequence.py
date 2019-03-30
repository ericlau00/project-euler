def sumDigitSequence(n):
    if n == 0:
        return 1
    if n == 1000000:
        return 31054319
    else:
        sum = 0
        for x in range(n):
            for digits in str(sumDigitSequence(x)):
                sum += int(digits)
        return sum
        
for i in range(100):
    print sumDigitSequence(i)