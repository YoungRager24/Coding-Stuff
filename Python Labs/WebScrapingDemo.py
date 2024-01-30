import webbrowser, sys, pyperclip, requests, bs4

#to open a website
webbrowser.open("http://inventwithpython.com/")

#MapIt project
if len(sys.argv) > 1:
    #get address from command line
    address = " ".join(sys.argv[1:])
else:
    #get address from clipboard
    address = pyperclip.paste()

#opens address in google maps in browser
webbrowser.open("https://www.google.com/maps/place/" + address)

#requesting sites
result = requests.get("https://automatetheboringstuff.com/files/rj.txt")
print(type(result)) #type of response from web server
result.status_code == requests.codes.ok #verify code is the one that means the site is ok
result.raise_for_status() #ensure that the download worked

#opening file from site
File = open("RomeoAndJuliet.txt", "wb") #binary mode
for text in result.iter_content(100000):
    File.write(text)
File.close()

print(len(result.text)) # character length
print(result.text[:250]) # displays the first 250 characters
print(result.text) # displays the text

#checking for errors
#res = requests.get("https://inventwithpython.com/page_that_does_not_exist")
#res.raise_for_status()

#using beautiful soup
bs = requests.get("https://www.sccsc.edu//")
src = bs.content
soup = bs4.BeautifulSoup(src, "html.parser")

elements = []
for div_tag in soup.select("div"):
    myText = div_tag.getText()
    elements.append(myText)

for items in elements:
    print(items)

element = []
for links in soup.select("div"):
    link = links.getText()
    element.append(link)

for i in element:
    print(i)
