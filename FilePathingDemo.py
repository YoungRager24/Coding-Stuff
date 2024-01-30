from pathlib import Path
import os
print(Path.cwd())
print(Path.home())

#to make a directory
"""
os.makedirs("C:\\delicious\\walnut\\waffles\\nuts")
Path("C:\\Users\\ktjda\\spam").mkdir()
"""

#to extract attributes from file path
p = Path("C:\\Users\\ktjda\\spam\\spam.txt")
print(p.anchor)
print(p.parent)
print(p.name)
print(p.stem)
print(p.suffix)
print(p.drive)

#finding file sizes and folder contents
size = os.path.getsize("D:\\Game Backlog\\Baldurs-Gate-3-SteamRIP.com\\Baldurs Gate 3\\bin\\bg3_dx11.exe")
print(size)
content = os.listdir("D:\\Game Backlog\\Baldurs-Gate-3-SteamRIP.com\\Baldurs Gate 3\\bin")
print(content)

#to read files
"""
helloFile = open(Path.home() / "hello.txt")
readHello = helloFile.read()
print()
print(readHello)
"""
sonnetFile = open("C:\\Users\\ktjda\\Desktop\\sonnet29.txt")
readSonnet = sonnetFile.read()
print(readSonnet)

#storing file with its path into a variable
t = Path("C:\\Users\\ktjda\\spam.txt")
t.write_text("Hello, world!\nktjda\nRobert Johnson") #writing text to file
print(t.read_text())

#to write then read
helloFile = open("C:\\Users\\ktjda\\hello.txt", "w")
helloFile.write("Hello Jared")
helloFile.close()

helloFile = open("C:\\Users\\ktjda\\hello.txt", "r")
print(helloFile.read())
helloFile.close()

sonnetFile = open("C:\\Users\\ktjda\\Desktop\\sonnet29.txt", "r")
print(sonnetFile.readlines())
sonnetFile.close()
