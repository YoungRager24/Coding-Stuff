import time

#function
def itemPrice(item):
    if item == 1:
        price = 18
    elif item == 2:
        price = 12
    elif item == 3:
        price = 12
    elif item == 4:
        price = 15
    elif item == 5:
        price = 12
    return price

#loop start and imput
while True:
    name = input("Please enter your name: ")
    if name == "end":
        print("Thank you!")
        break
    else:
        item = int(input("Please enter the item you wish to order: "))
        ask = input("Would you like to add a tip (y/n): ")

        #adding tax and tip
        tax = (itemPrice(item) * .09) + itemPrice(item)
        if ask == "y":
            tip = int(input("How much would you like to tip? "))
            finalPrice = tax + tip
        else:
            finalPrice = tax
        print("Your total is: $" + str(round(finalPrice, 2)))
        time.sleep(5)

