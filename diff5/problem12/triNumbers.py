import time 
start = time.time()
def divisors(num):
    list = []
    i = 1
    while i < num / i + 1:
        if num % i == 0:
            list.append(i)
            if num / i != i:
                list.append(num / i)
        i+=1
    return list 

def triNumbers(num):
    this = 0 
    i = num 
    while i > 0:
        this += i
        i -= 1
    return this 
     
def solution():
    i = 1
    goal = 500
    while len(divisors(triNumbers(i))) < goal:
        i+=1
    print triNumbers(i), divisors(triNumbers(i))
   
solution()
print time.time() - start 