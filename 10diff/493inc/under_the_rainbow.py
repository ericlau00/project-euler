import random
from decimal import * 
import time

colors = ["red", "orange", "yellow", "green", "blue", "indigo", "violet"]
balls_in_urn = {}
chosen_balls = {}

for color in colors:
    balls_in_urn[color] = 10

def pick_twenty():
    for i in range(20): 
        keys = list(balls_in_urn.keys())
        print(keys)
        values = list(balls_in_urn.values())
        print(values)

        chosen_ball = random.choices(keys,weights=values,k=1)[0]

        balls_in_urn[chosen_ball] -= 1

        if not chosen_ball in list(chosen_balls.keys()): 
            chosen_balls[chosen_ball] = 1
        else: 
            chosen_balls[chosen_ball] += 1
    
    return len(list(chosen_balls.keys()))

sum = 0
tests = 0
start = time.time()
# while time.time() - start < 60:
for i in range(2):
    tests += 1
    distinct_colors = pick_twenty()
    if(distinct_colors < 7):
        print(distinct_colors)
    sum += distinct_colors

getcontext().prec = 9
print(sum)
print(tests)
print (Decimal(sum) / Decimal(tests))