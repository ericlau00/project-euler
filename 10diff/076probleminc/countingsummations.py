import time 
def solution():
    print 100,len(summation(100))
    
def summation(n):
    outer = [] 
    if n == 1 or n == 2:
        inner = [] 
        inner.append(1)
        if n == 2:
            inner.append(1)
        outer.append(inner)
        return outer 
    else:
        i = n - 1
        while i > 1:
            inner = [] 
            inner.append(i)
            inner.append(n-i)
            inner.sort()
            if not inner in outer:
                outer.append(inner)
            for inners in summation(n-1):
                inner = inners 
                inner.append(1)
                inner.sort()
                if not inner in outer:
                    outer.append(inner)
            i -= 1
        return outer 
        
start = time.time()
solution()
end = time.time()
print end - start 