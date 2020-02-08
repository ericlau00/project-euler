"""Problem 2 Even Fibonacci numbers
By considering the terms in the Fibonacci sequence whose values
do not exceed four million, find the sum of the even-valued terms."""
sequence = [0, 1]
i = 2
total = 0
while sequence[-1] <= 4000000:
    sequence.append(sequence[i - 1] + sequence[i - 2])
    if sequence[i] % 2 == 0:
        total += sequence[i]
    i += 1

print total
