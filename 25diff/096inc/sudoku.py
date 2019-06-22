import time 

def solution():
    text = open("p096_sudoku.txt","r").read().lstrip("\n").split("Grid ")[1:]
    for grid in text:
        grid = grid[4:]
        grid = grid.strip("\n").split("\n")
        for rows in grid:
            row = [] 
            for numbers in rows:
                number = [] 
                if numbers != "0":
                    number.append(numbers)
                else:
                    for i in range(1,10):
                        number.append(i)
                row.append(number)
            rows = row
            print rows
        print grid
start = time.time()
solution()
end = time.time()