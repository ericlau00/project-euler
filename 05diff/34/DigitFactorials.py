import time 
def solution():
    sum = 0 
    i = 10
    while True:
        if condition(digitize(i),i):
            sum += i 
        print sum, i 
        i+=1        

def condition(digits, number):
    sum = 0 
    for digit in digits:
        sum += factorial(digit)
    return sum == number 
        
def factorial(number):
    product = 1 
    while number > 1:
        product *= number 
        number -= 1
    return product
    
def digitize(num):
    list = []
    for i in str(num):
        list.append(int(i))
    return list 

start = time.time()
solution()
end = time.time()
print end - start 