import time

#define function
def display():
    print("{:<25} {}".format("Employee Classification:", "Salary Increase Percentage:"))
    for i, x in employeeList.items():
        x = f"{x:,.3f}"
        print("{:<25} {}".format(i, x))

#employee classification and salary increase percentage
employeeList = {"1" : 0.02, "2" : 0.035, "3" : 0.025, "4" : 0.03, "5" : 0.01}

#loop start
while True:

    #display
    display()

    #prompt user for employee number and performance rating
    number = input("\nPlease enter your employee number: ")
    rating = input("\nPlease enter your performance rating\n(E for Excellent, S for Satisfactory or U for Unsatisfactory: ")

    #performance rating evaluation
    if rating == "U":
        print("\nYou will be on probation for a year.")
        break
    else:
        
        #prompt user for current salary and classification number
        currentSalary = float(input("\nPlease enter your current salary: $"))
        classification = input("\nPlease enter your classification number: ")
        
        #deciding salary increase percentage
        if classification in employeeList.keys():
            newSalary = (currentSalary * employeeList[classification]) + currentSalary
            print("\nEmployee number " + number)
            print("Your current salary is $" + str(currentSalary))
            print("Your new salary is $" + str(newSalary))
            time.sleep(5)
        break
