import re

phoneNumRegex = re.compile(r"(\d\d\d)-(\d\d\d-\d\d\d\d)")
mo1 = phoneNumRegex.search("My number is 864-593-2806")
print(mo1.group(1))
print(mo1.group(2))
print(mo1.groups())

heroRegex = re.compile(r"Batman|Tina Fey")
mo2 = heroRegex.search("Batman and Tina Fey")
print(mo2.group())
mo3 = heroRegex.search("Tina Fey and Batman")
print(mo3.group())

batRegex = re.compile(r'Bat(wo)?man')
mo4 = batRegex.search('The Adventures of Batman')
print(mo4.group())

haRegex = re.compile(r'(Ha){3}')
mo5 = haRegex.search('HaHaHa')
print(mo5.group())

mo6 = haRegex.search("Ha")
print(mo6)

consonantRegex = re.compile(r'[^aeiouAEIOU]')
mo7 = consonantRegex.findall('RoboCop eats baby food. BABY FOOD.')
print(mo7)

beginsWithHello = re.compile(r"^Hello")
mo8 = beginsWithHello.search("Hello World!")
print(mo8.group())

endsWithNumber = re.compile(r"\d$")
mo9 = endsWithNumber.search("Your number is 42")
print(mo9.group())
