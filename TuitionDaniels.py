import time

#variables
name = (input("Please enter your name: "))
time.sleep(5)
hours = float(input("Please enter your total credit hours: "))
time.sleep(5)
charge = 198

#calculation
tuition = hours * charge
tuition = f'{tuition:,.2f}'

#output
print("Hi " + name + ". " + "Your tuition is $" + str(tuition) + ".")
time.sleep(5)

