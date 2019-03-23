"""Problem 22 names scores"""
names = open("Problem22names.txt", "r")
names = names.read()
names = names.split(",")
for i in range(len(names)):
   names[i] = names[i].strip("\"")
names.sort()
nameTotal = 0
thisName = 0
allNames = 0
for i in range(len(names)):
   for x in range(len(names[i])):
       nameTotal += ord(names[i][x]) - 64
   thisName = nameTotal * (i + 1)
   allNames += thisName
   nameTotal = 0
   thisName = 0
       
print allNames