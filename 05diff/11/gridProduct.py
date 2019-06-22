def solution():
    numbers = open("numbers.txt").read().rstrip("\n").split("\n")
    numbers = convertToIntergers(numbers)
    maximum = 0
    for row in range(len(numbers)):
        for column in range(len(numbers[row])):
            checks = check(numbers, row, column)
            if checks > maximum:
                maximum = checks
    return maximum 

def convertToIntergers(numbers):
    for line in range(len(numbers)):
        numbers[line] = numbers[line].split()
        for i in range(len(numbers[line])):
            numbers[line][i] = int(numbers[line][i])
    return numbers 
    
def check(numbers,row,column):
    diagonal = checkDiagonals(numbers,row,column)
    vertical = checkVerticals(numbers,row,column)
    horizontal = checkHorizontals(numbers,row,column)
    return max(diagonal,vertical,horizontal)

def checkDiagonals(numbers, row, column):
    left = leftDiagonal(numbers,row,column)
    right = rightDiagonal(numbers,row,column)
    return max(left, right)
    
def leftDiagonal(numbers,row,column):
    if column > 2 and row < 17:
        first = numbers[row][column]
        second = numbers[row+1][column-1]
        third = numbers[row+2][column-2]
        fourth = numbers[row+3][column-3]
        return first * second * third * fourth 
    return 0

def rightDiagonal(numbers,row,column):
    if column < 17 and row < 17:
        first = numbers[row][column]
        second = numbers[row+1][column+1]
        third = numbers[row+2][column+2]
        fourth = numbers[row+3][column+3]
        return first * second * third * fourth 
    return 0 
         
def checkVerticals(numbers,row,column):
    u = up(numbers,row,column)
    d = down(numbers,row,column)
    return max(u,d)

def up(numbers,row,column):
    if row > 2:
        first = numbers[row][column]
        second = numbers[row-1][column]
        third = numbers[row-2][column]
        fourth = numbers[row-3][column]
        return first * second * third * fourth 
    return 0 

def down(numbers,row,column):
    if row < 17:
        first = numbers[row][column]
        second = numbers[row+1][column]
        third = numbers[row+2][column]
        fourth = numbers[row+3][column]
        return first * second * third * fourth 
    return 0 

def checkHorizontals(numbers,row,column):
    l = left(numbers,row,column)
    r = right(numbers,row,column)
    return max(l,r)

def left(numbers,row,column):
    if column > 2:
        first = numbers[row][column]
        second = numbers[row][column-1]
        third = numbers[row][column-2]
        fourth = numbers[row][column-3]
        return first * second * third * fourth 
    return 0 
    
def right(numbers,row,column):
    if column < 17:
        first = numbers[row][column]
        second = numbers[row][column+1]
        third = numbers[row][column+2]
        fourth = numbers[row][column+3]
        return first * second * third * fourth 
    return 0 
    
print solution()