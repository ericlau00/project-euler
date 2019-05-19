import time 
def solution():
    constant = champernowne(1000000)
    product = 1
    for i in [1,10,100,1000,10000,100000,1000000]:
        product *= int(constant[1+i])
    print product 

def champernowne(limit):
    constant = "0."
    integer = 1
    while len(constant) - 2 < limit:
        constant += str(integer)
        integer+=1
    return constant 

start = time.time()
solution()
print time.time() - start 