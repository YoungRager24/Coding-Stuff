"""
students = ["Mike", "Susan", "Mark", "James", "Mary"]
studentName = students[1:3]
print(studentName)

for numbers in [0, 1, 2, 3]:
    print(numbers)

print()

listName = [0, 1, 2, 3]
for numbers in listName:
    print(numbers)
"""
#to search for item in a list
lst = [1, 6, 3, 5, 4, 4, 12, 23, 19]

#to print a list
for num in lst:
    print(num)

num = int(input("Enter a number to check: "))
if num in lst:
    print(num, "exist")
else:
    print(num, "does not exist")
    for num in lst:
        print(num)


