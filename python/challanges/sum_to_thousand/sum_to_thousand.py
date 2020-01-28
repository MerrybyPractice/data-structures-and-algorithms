def sum_to_thousand(a, b): 
    """ Takes in two number and returns the sum of their miltiples upto 1000. 
    Raises ValueError
    
    :param a: the first number to be find multiples of
    :type a: int, float, long
    :param b:the seccond number to find multiples of
    :type b: int, float, long
    """    
    
    if not isinstance(a, int) or not isinstance(a, float) or not isinstance(a, long): 
        raise ValueError("Please try again by passing an int, a float, or a long as a")
    if not isinstance(b, int) or not isinstance(b, float) or not isinstance(b, long): 
        raise ValueError("Please try again by passing an int, a float, or a long as b")
    
    sum = 0; 
    for i in range(1000): 
        if ( i % a == 0) and (i % b == 0) : 
            sum += i 
        elif (i % a == 0): 
            sum += i 
        elif (i % b == 0): 
            sum += i
        else: 
            continue
    print(sum)

if __name__ == "__main__":
    sum_to_thousand(3, 5)
