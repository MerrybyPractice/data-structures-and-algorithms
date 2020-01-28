from recur_fib import recur_fib

def sum_even(): 
    even_fib_sum = 0
    i = 0
    while recur_fib(i) < 4000000: 
        term = recur_fib(i)
        if term % 2 == 0: 
            even_fib_sum += term
        i+=1 
    return even_fib_sum

if __name__ == "__main__":
  print(sum_even())
