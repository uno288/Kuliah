def recur_fibo(n):
    if n <= 1 :
        return n
    else : 
        return(recur_fibo(n - 1) + recur_fibo(n - 2))

#nterms = 20

nterms = int(input("How many terms?  "))
if nterms <= 0:
    print("please enter positive Integer")
else :
    print("Fibonacci sequence :")
    for i in range(nterms):
        print(recur_fibo(i))