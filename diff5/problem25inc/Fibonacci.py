def toFib(index):
    if index == 1:
        return 1
    if index == 2:
        return 1 
    else:
        return toFib(index - 1) + toFib(index - 2)
     
def solution():
    place = 1
    while not digitCount(toFib(place), 1000): 
        place += 1
    print place 
   
def digitCount(number, digits):
    return len(str(number)) == digits 
    
solution()