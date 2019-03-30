def NumberLetterCount():
    ones = {
    0: 0,
    1: 3,
    2: 3,
    3: 5,
    4: 4,
    5: 4,
    6: 3,
    7: 5,
    8: 5,
    9: 4
    }
    tens = {
    0: 0,
    1: 3,
    2: 6,
    3: 6,
    4: 5,
    5: 5,
    6: 5,
    7: 7,
    8: 6,
    9: 6
    }
    teens = {
    0: 3,
    1: 6,
    2: 6,
    3: 8,
    4: 8,
    5: 7,
    6: 7,
    7: 9, 
    8: 8,
    9: 8
    }
    
    count = 0
    for i in range(1,6):
        x = i
        one = x % 10
        x /= 10
        ten = x % 10
        x /= 10
        hund = x % 10
        if hund != 0:
            count += ones[hund] + len("hundred")
            print count 
            if one != 0 or ten != 0:
                count += len("and")
                print count 
        if ten == 1:
            count += teens[one]
            print count 
        elif ten > 1:
            count += tens[ten] + ones[one]
            print count 
        else:
            count += ones[one]
            print count 
    print count + 11 ##11 is one thousand 
    
NumberLetterCount()