def toFib(index):
    phi = (1 + 5 ** 0.5) / 2 
    psi = (1 - 5 ** 0.5) / 2 
    return (phi ** index - psi ** index) / 5 ** 0.5 
     
def solution():
    place = 1
    while not digitCount(toFib(place), 50 ): 
        print toFib(place)
        place += 1
    print place, toFib(place)
   
def digitCount(number, digits):
    return len(str(number)) - 2 == digits 
    
solution()
