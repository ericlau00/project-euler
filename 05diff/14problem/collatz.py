import time 
startTime = time.time()
def toCollatz(num,general):
    seq = [num]
    while num != 1:
        if num % 2 == 0:
            num /= 2
        else :
            num = num * 3 + 1
        if num in general:
            seq.extend(general[general.index(num):general.index(1,general.index(num))+1])
            break
        seq.append(num)
    return seq
        
def problem():
    longest = []
    general = []
    for i in range(1,100001):
        if i in general:
            continue
        current = toCollatz(i,general)
        for element in current:
            general.append(element)
        if len(current) >= len(longest):
            longest = current
            print "longest", longest[0], len(longest)            
problem()
print "Time Elapsed: " + str(time.time() - startTime)
