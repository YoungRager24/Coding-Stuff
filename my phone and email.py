import pyperclip, re

# Regex to match phone numbers like 864-592-4839, (864) 592-4839, 864.592.4839
# 864-592-4600 ext 4839 or x 4839 or ext. 4839
# could be optional area code
phoneregex=re.compile(r'''(
    (\d{3}|\(\d{3}\))?      # area code
    (\s|-|.)?               # separator
    (\d{3})                 # first 3 digits
    (\s|-|.)                # separator
    (\d{4})                 # last 4 digits
    (\s*(ext|x|ext.)\s(\d{2,5}))?       #extension
    )''',re.VERBOSE)

emailregex=re.compile(r'''(
    [a-zA-Z0-9_%+-]+          #username
    @                         # @ symbol
    [a-zA-Z0-9.-]+            # domain name
    (.[a-zA-Z]{2,4})         # dot-something
    )''',re.VERBOSE)

text=str(pyperclip.paste())

matches = []                   # list of matches
for groups in phoneregex.findall(text):
    phonenum='-'.join([groups[1],groups[3],groups[5]])
    if groups[8] != '':
        phonenum += 'x' + groups[8]
    matches.append(phonenum)
for groups in emailregex.findall(text):
    matches.append(groups[0])

if len(matches) > 0:
    pyperclip.copy('\n'.join(matches))
    print ('Copied to clipboard:')
    print ('\n'.join(matches))
else:
    print('No phone number or email addresses found.')
