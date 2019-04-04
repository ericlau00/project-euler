import time 

def solution():
    dictionary = {}
    longest = []
    length = len(longest)
    for i in range(1,1000001):
        if not i in dictionary:
            to_dictionary(i,dictionary)
            efficient(i, dictionary)
            current = len(dictionary[i])
            if current > length:
                longest = dictionary[i]
                length = current 
    return longest 
    
def to_dictionary(N,dictionary):
    n = N
    seq = [n] 
    while n != 1:
        if n % 2 == 0:
            n /= 2
        else:
            n = n*3 + 1 
        seq.append(n)
    dictionary[N] = seq 
    
def efficient(n,dictionary):
    for i in range(len(dictionary[n])):
        if not dictionary[n][i] in dictionary:
            dictionary[dictionary[n][i]] = dictionary[n][i:]
        
start = time.time()
print solution()
end = time.time()
print end - start 