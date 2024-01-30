import time

#loop start and variables
while True:
    years = int(input("Please enter years of teaching experience: "))
    time.sleep(5)
    salary = float(input("Please enter your current salary: "))
    time.sleep(5)
    critical = str(input("Do you teach in a critical area? (y/n): "))
    time.sleep(5)

    #variables
    if years <= 2:
        newSalary = float(salary) * .02 + salary
    elif years > 2 and years <= 5:
        newSalary = float(salary) * .04 + salary
    elif years > 5 and years <= 10:
        newSalary = float(salary) * .06 + salary
    elif years > 10:
        newSalary = float(salary) * .08 + salary
    if critical == "y":
        newSalary = newSalary + 5000.00
    
        
    #output
    print("Your salary is: $" + str(newSalary))
    time.sleep(5)
    cont = input("Would you like to conitinue? (y/n): ")
    time.sleep(5)
    if cont == "y":
        True
    else:
        break
