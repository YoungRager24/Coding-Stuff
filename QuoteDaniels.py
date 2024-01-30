import os
os.chdir("C:\\Sample")

#create text file for quote for customer
quote = open("TPN Quote.txt", "w")
quote.write((" "*12) + "TPN Computer Products\n \n\n")
quote.write((" "*15) + "Quote Details\n \n\n")
quote.write((" "*7) + "Qty  Hard Drive         Price Per Unit     Total Price\n\n")

#dictionary of hard drives
drives = {335160:484.99,354732:221.44,3514676:257.42,3006905:315.55,3351600:447.50,357888:379.15}
total = 0

#loop start for customer to decide items to purchase
while True:
    #display menu
    print("{:<20} {}".format("Hard Drives:", "Price:"))
    for i, x in drives.items():
        x = f"{x:,.2f}"
        print("{:<20} {}".format(i, "$" + x))
    drive = int(input("\nPlease enter item number you would like to purchase (enter 999 to end): "))
    if drive == 999:
        break
    curPrice = drives[drive]
    amount = input("\nHow many of " + str(drive) + " would you like to purchase? ")
    price = curPrice * int(amount)
    total = total + price
    shipping = (total * .03)
    total = shipping + total
    shipping = format(shipping, ".2f")
    price = format(price, ".2f")
    curPrice = format(curPrice, ".2f")
    quote.write((" "*7) + str(amount) + (" "*4) + str(drive) + (" "*13) + "$" + str(curPrice) + (" "*12) + "$" + str(price) + "\n\n")

total = format(total, ".2f")
quote.write("\n\n" + ("  "*6) + "Shipping      =      $" + str(shipping))
quote.write("\n\n\n" + ("  "*6) + "  Total       =      $" + str(total))
quote.close()
    
