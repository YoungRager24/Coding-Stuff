import time

#variables
name = input("Please enter your name: ")
time.sleep(5)
grade = float(input("Please enter your current numeric grade: "))
time.sleep(5)

#calculations
if grade >= 89.5:
    letter = "A"
elif grade >= 79.5 and grade < 89.5:
    letter = "B"
elif grade >= 69.5 and grade < 79.5:
    letter = "C"
elif grade < 69.5:
    letter = "F"

#Display/Output
print("Hi " + name + ", your final grade is a(n) " + letter + ".")
time.sleep(5)
