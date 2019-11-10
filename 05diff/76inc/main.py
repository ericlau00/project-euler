import time
from itertools import permutations

def main():
    start = time.time()
    keys = open("keylog.txt", "r").read().split("\n")[0:2]

    # for key in keys:
    #     if there are permutations, 
    #         add to the set of permutations with permuting new key with first permutation in set 
    #     else 
    #         find permutation of key
    #     for permutation in permutations 
    #         if next key does not allow for permutation
    #             remove permutation from set 
    print(time.time() - start, "ms")

# not allowed def 
#     find the first occurance of the first digit 
#         if the first index is out of bounds 
#             return false 
#         else 
#             find the first occurance of the second digit after the first index
#                 if the index is out of bounds 
#                     return false 
#                 else 
#                     find the first occurance of the third digit after the second index 
#     essentially recursive backtracking 

if __name__ == '__main__':
    main()

