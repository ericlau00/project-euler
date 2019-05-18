import time 
def toFib(index):
    sub2 = 0
    sub1 = 1
    for i in range(1,index):
        storage = sub1
        sub1 += sub2
        sub2 = storage 
    return sub1 
     
def solution():
    place = 1
    while not digitCount(toFib(place), 1000 ): 
        place += 1
    print place, toFib(place)
   
def digitCount(number, digits):
    return len(str(number)) == digits 
    
start = time.time()
solution()
print time.time() - start 
