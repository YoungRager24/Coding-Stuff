import time

#initialize cost and tax
cost = 0
tax = 0.09

#dictionary
coffee = {"Hot Brew" : 4.25, "Latte" : 4.75, "Mocha" : 4.99, 
          "Cold Brew" : 3.95, "Cappuccino" : 4.89, "Donut" : 1.50}

#loop start
while True:
    #display menu
    print("{:<20} {}".format("Coffee Item:", "Price:"))
    for i, x in coffee.items():
        x = f"{x:,.2f}"
        print("{:<20} {}".format(i, "$" + x))

    #ask what item user wants to buy
    while True:
        key = input("\nWhat item would you like to purchase? (Case Sensative) ")

        #check if item is being sold
        if key in coffee.keys():
            cost = cost + coffee[key]
            choice = input("\nWould you like to purchase another item? (y/n) ")
            if choice.lower() == "n":
                break
            else:
                True
        else:
            print("We do not currently carry that item.\n")
            choice = input("Would you like to purchase another item? (y/n) ")
            if choice.lower() == "n":
                break
            else:
                True

    #adding up cost
    totalCost = (cost * tax) + cost
    
    #asking for donation
    donation = input("\nWould you like to donate $5 to the SCC Foundation for scholarships for students?(y/n) ")
    if donation.lower() == "y":
        totalCost = totalCost + 5
    totalCost = f"{totalCost:,.2f}"
    print("\nYour total is: $" + str(totalCost))
    time.sleep(5)
    cost = 0

    #asking for next customer/end loop
    newOrder = input("\nNew Order? (y/n) ")
    if newOrder.lower() == "n":
        break
    else:
        True
    
