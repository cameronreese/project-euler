# Project Euler Problem 6: Sum Square Difference
#
# The sum of the squares of the first ten natural numbers is,
#
# 1^2 + 2^2 + ... + 10^2 = 385
# The square of the sum of the first ten natural numbers is,
#
# (1 + 2 + ... + 10)^2 = 55^2 = 3025
# Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
#
# Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

number_array = []

i = 1

while i <= 100:
    number_array.append(i)
    i += 1

sum_of_squares = 0

for element in number_array:
    sum_of_squares += (number_array[element - 1] * number_array[element - 1])

square_of_sums = 0

for element in number_array:
    square_of_sums += number_array[element - 1]

square_of_sums *= square_of_sums

solution = square_of_sums - sum_of_squares

print(solution)
