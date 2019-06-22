def solution():
    words = open("words.txt").read().rstrip("\n").split(",")
    triangleWords = 0 
    for i in range(len(words)):
        words[i] = words[i].strip("\"")
        words[i] = word_to_number(words[i])
    list = createNumbers(max(words))
    for number in words:
        if isTriangleWord(number,list):
            triangleWords+=1
    print triangleWords
    
def isTriangleWord(number,list):
    return number in list
    
def createNumbers(max):
    list = [1]
    i = 2 
    while list[-1] < max:
        list.append( i * ( i + 1) / 2)
        i+=1
    return list

def word_to_number(word):
    conversion = {'A':1, 
                  'B':2,
                  'C':3,
                  'D':4,
                  'E':5,
                  'F':6,
                  'G':7,
                  'H':8,
                  'I':9,
                  'J':10,
                  'K':11,
                  'L':12,
                  'M':13,
                  'N':14,
                  'O':15,
                  'P':16,
                  'Q':17,
                  'R':18,
                  'S':19,
                  'T':20,
                  'U':21,
                  'V':22,
                  'W':23,
                  'X':24,
                  'Y':25,
                  'Z':26
                  }
    sum = 0
    for letter in word:
        sum += conversion[letter]
    return sum 

solution()
