# PE007 Project Euler Problem:  10001st Prime
# By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
#
# What is the 10 001st prime number?

def is_Prime(num) -> bool:
    i = 2
    if num == 2 or num == 3:
        return True
    while (i <= num/2):
        if num % i == 0:
            return False
        i += 1
    return True


primes = []
counter = 2

while len(primes) < 10001:
    if is_Prime(counter):
        primes.append(counter)
        print(len(primes))
    counter += 1

print(primes[10000])

