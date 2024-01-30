import sys

#display menu function
def display():
    print("(Type everything exactly as you see it, it is all case sensative)")
    print("{:<20} {}".format("Robot:", "Price:"))
    for i, x in robotList.items():
        x = f"{x:,.2f}"
        print("{:<20} {}".format(i, "$" + x))

#define dictionary and variables
robotList = {"NAO" : 7000, "Pepper" : 9000, "Romeo" : 7500, "Atlas" : 6000, "Whiz" : 4000}
cost = 0
tax = 0.07

#display menu and prompt user for purchase
display()

while True:
    robot = input("\nWhich robot would you like to purchase? (end to stop): ")
    if robot == "end":
        sys.exit()
        
    if robot in robotList.keys():
        print("\nThe price of the robot is", robotList[robot])
        cost = cost + robotList[robot]
        break
    else:
        print("\nWe do not carry that robot")
        continue

#ask about warrantys 
print("\nWould you like a: (Type exact phrasing of warranty you want)")
print("{:<20} {}".format("7 Year Warranty:", "$500"))
print("{:<20} {}".format("Lifetime Warranty:", "$800"))
print("{:<20} {}".format("No Warranty:", "$0"))
warranty = input("\n")

#calculate costs based on warranty selected
if warranty == "7 Year Warranty":
    cost = cost + 500
elif warranty == "Lifetime Warranty":
    cost = cost + 800
elif warranty == "No Warranty":
    cost = cost

#ask about training package
training = input("\nWould you like to purchase an online training package (y/n)? (Extra $250): ")

if training.lower() == "y":
    cost = cost + 250

#ask user if they are a healthcare professional for a discount
health = input("Are you a healthcare professional (y/n)? ")

if health.lower() == "y":
    print("\nYou reciece a 20% discount")
    cost = cost - (cost * .20)

#calculate tax on to total cost
total = (cost * tax) + cost

#display total to user
total = f"{total:,.2f}"
print("\nYour total is: $" + str(total))
