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
    while True: 
        num = toFib(place)
        if end(num) and front(num):
            print place, num
        place += 1
   
   
def hasNine(string):
    for i in range(1,10):
        if not str(i) in string:
            return False 
    return True 
    
def end(num): 
    return hasNine(str(num)[len(str(num)) - 9:])
    
def front(num):
    return hasNine(str(num)[:9])
    
start = time.time()
solution()
print time.time() - start 