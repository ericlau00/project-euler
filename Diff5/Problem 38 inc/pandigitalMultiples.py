def pandigitalMultiples():
    i = 1
    n = 2
    curProduct = 1
    while i < 100000000:
        product = 1
        while not eachDigit(product) and len(str(product)) <= 9:
            product = concatenateProduct(i, n)
            print product 
            n += 1
        curProduct = int(product) 
        n = 2
        i += 1
    print curProduct
    
def eachDigit(num):
    for i in range(1,10):
        if not str(i) in str(num):
            return False 
    return len(num) == 9
    
def concatenateProduct(num,multiply):
    product = ""
    for i in range(1, multiply + 1):
        product += str(num * i)
    return product 
    
pandigitalMultiples()