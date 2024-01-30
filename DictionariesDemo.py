#dictionary
countries = {"US" : "United States", "UK" : "United Kingdom", "FR" : "France", "MX" : "Mexico"}

#to print each type of data in a dictionary
for k in countries.keys():
    print(k)
print()
for v in countries.values():
    print(v)
print()
for i in countries.items():
    print(i)
print()

#change keys to a list
keyList = list(countries.keys())
print(keyList)

valueList = list(countries.values())
print(valueList)
print()

key = input("Enter a key to check if country is in the dictionary: ")

if key in countries.keys():
    print("It is")
else:
    print("It isn't")

#geting keys
country = countries.get("MX")
if country in countries.values():
    print("Yes")
else:
    print("Nope")
#or
country = countries.get("GB", "Not in the dictionary") #default if not in dictionary
print(country)
print()

#Nested dictionaries
allGuests = {"Alice" : {"apples" : 5, "pretzels" : 12},
             "Bob" : {"ham sandwiches" : 3, "apples" : 2},
             "Carol" : {"cups" : 3, "apple pies": 1}}

def totalBrought(guests, item):
    numBrought = 0
    for k, v in guests.items():
        numBrought = numBrought +v.get(item, 0)
    return numBrought

print('Number of things being brought:')
print(' - Apples         ' + str(totalBrought(allGuests, 'apples')))
print(' - Cups           ' + str(totalBrought(allGuests, 'cups')))
print(' - Cakes          ' + str(totalBrought(allGuests, 'cakes')))
print(' - Ham Sandwiches ' + str(totalBrought(allGuests, 'ham sandwiches')))
print(' - Apple Pies     ' + str(totalBrought(allGuests, 'apple pies')))
