import pyperclip, re

#creating the regex
websiteregex = re.compile(r'''
    https?://           #match http:// or https://
    w{3}\.              #www-dot
    [a-zA-Z0-9_-]+      #domin name
    \.                  #dot
    [a-zA-Z]{2,3}       #extension
    ''', re.VERBOSE)

#copying data from document
text = str(pyperclip.paste())

#store matches in this list
matches = []

#find website from the pasted text
for site in websiteregex.findall(text):
    matches.append(site)

#displaying copied websites
if len(matches) > 0:
    pyperclip.copy('\n'.join(matches))
    print ('Copied to clipboard:')
    print ('\n'.join(matches))
else:
    print('No website found')
