import sys, time

#display menu function
def display():
    print("(Type Laptop you want exactly as you see it, it is case sensative)")
    print("{:<20} {}".format("Laptop:", "Price:"))
    for i, x in laptopList.items():
        x = f"{x:,.2f}"
        print("{:<20} {}".format(i, "$" + x))

#define dictionary and variables
laptopList = {"Acer Aspire" : 700, "Lenovo Idea Pad" : 750, "Asus ZenBook" : 720, "Dell Lattitude" : 850, "HP Pavilion" : 800}
cost = 0
tax = 0.07

while True:
    
    #display menu and prompt user for purchase
    display()
    time.sleep(5)
    cost = 0
    
    laptop = input("\nWhich laptop would you like to purchase? (end to stop): ")
    if laptop == "end":
        break
        
    if laptop in laptopList.keys():
        print("\nThe price of the laptop is $" + str(laptopList[laptop]))
        cost = cost + laptopList[laptop]
    else:
        print("\nWe do not carry that laptop\n")
        continue

    #ask user if they are eligible for different discounts
    veteran = input("\nAre you a veteran (y/n)? ")
    scholar = input("\nAre you a technical scholar (y/n)? ")
    ambassador = input("\nAre you a student ambassador (y/n)? ")

    if veteran.lower() == "y":
        print("\nYou reciece a 30% discount")
        cost = cost - (cost * .30)
    if scholar.lower() == "y":
        print("\nYou reciece a 50% discount")
        cost = cost - (cost * .50)
    if ambassador.lower() == "y":
        print("\nYou reciece a 20% discount")
        cost = cost - (cost * .20)

    #ask about protection plan
    plan = input("\nWould you like to purchase a protection plan (y/n)? (Extra $150): ")

    if plan.lower() == "y":
        cost = cost + 150

    #calculate tax on to total cost
    total = (cost * tax) + cost

    #display total to user
    total = f"{total:,.2f}"
    print("\nYour total is: $" + str(total) + "\n")
    time.sleep(5)
