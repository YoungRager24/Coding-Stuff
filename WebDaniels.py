import bs4, requests, time

#telling program which website it will be parsing
site = requests.get("https://www.sccsc.edu//admissions-aid/apply.php/")

#checking for exceptions
try:
    site.raise_for_status()
except Exception as exc:
    print('There was a problem: %s' % (exc))
    
source = site.content
soup = bs4.BeautifulSoup(source, "html.parser")

#extracting elements from website
elements = []
for div_tag in soup.select("h1"):
    myText = div_tag.getText()
    elements.append(myText)

#printing said elements
for items in elements:
    print(items)
time.sleep(5)
