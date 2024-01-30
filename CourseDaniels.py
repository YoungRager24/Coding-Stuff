import time

#loop start
while True:

    #Two courses lists
    science = ["ECO 210", "GEO 101", "SOC 101", "PSY 201", "HIS 101", "PSC 201"]
    scienceNum = [210, 101, 101, 201, 101, 201]
    humanities = ["ART 101", "ENG 102", "MUS 105", "PHI 101", "REL 101"]
    humanitiesNum = [101, 102, 105, 101, 101]

    #diplaying social sciences list
    print("\nSocial Sciences: ")
    for x in science:
        print(x)
    print()

    #asking student which course they would like to take
    course = int(input("What course number would you like to take in social science? "))

    #searching social science list
    if course in scienceNum:
        print("\nThe course you selected is eligible.\n")
        time.sleep(5)
    else:
        print("\nThe course you selected is not eligible.\n")
        time.sleep(5)
        print("Social Sciences: ")
        for x in science:
            print(x)
        print()
        
    #diplaying humanities list
    print("Humanities: ")
    for x in humanities:
        print(x)
    print()

    #asking student which course they would like to take
    courseTwo = int(input("What course number would you like to take in humanities? "))
    
    #searching humanities list
    if courseTwo in humanitiesNum:
        print("\nThe course you selected is eligible.\n")
        time.sleep(5)
    else:
        print("\nThe course you selected is not eligible.\n")
        time.sleep(5)
        print("Humanities: ")
        for x in humanities:
            print(x)
        print()
        
    #ending the loop
    end = input("Do you want to end the program? (y/n) ")
    if end.lower() == "n":
        True
    else:
        break
    
