#Comparison Example
"""
age = int(input("Enter your age: "))

if age > 17:
    print("You are " + str(age) + ". So you can vote!")
else:
    print("You are not old enough to vote.")
"""

creditScore = int(input("Enter your credit score: "))
years = int(input("Years as a customer: "))

if creditScore >= 700 and years >= 5:
    interest = 3.0
elif creditScore >= 600:
    interest = 5.0
elif creditScore >= 500:
    interest = 8.0
else:
    interest = 12.5
print("Your rate is:", str(interest))
