import time

def step(a_n):
    remainder = a_n % 3
    if remainder == 0:
        return a_n // 3, "D"
    elif remainder == 1:
        return (4 * a_n + 2) // 3, "U"
    else:
        return (2 * a_n - 1) // 3, "d"

def add(a_n, num_seq, str_seq):
    while num_seq[-1] != 1:
        num, string = step(num_seq[-1])
        num_seq.append(num)
        str_seq.append(string)

def start(a_n, num_seq, str_seq):
    num_seq.append(a_n)
    add(a_n, num_seq, str_seq)
    return num_seq, str_seq

if __name__ == "__main__":
    begin = time.time()
    target = "UDDDUdddDDUDDddDdDddDDUDDdUUDd"
    a_i = 10 ** 15
    while time.time() - begin < 60:
        num_seq, str_seq = start(a_i, [], [])
        str_seq = "".join(str_seq)
        if str_seq[:len(target)] == target:
            print("number: " + str(a_i), num_seq, str_seq, sep="\n")
            break
        i+=1
    print(time.time() - begin, "seconds")