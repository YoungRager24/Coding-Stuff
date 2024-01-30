import pyautogui, time

time.sleep(2)
print(pyautogui.size()) #screen resolution
print(pyautogui.position()) #mouse position currently
#print(pyautogui.displayMousePosition()) #realtime live mouse position

for i in range(3): #moves mouse in a square
    pyautogui.moveTo(100, 100, duration=0.25)
    pyautogui.moveTo(200, 100, duration=0.25)
    pyautogui.moveTo(200, 200, duration=0.25)
    pyautogui.moveTo(100, 200, duration=0.25)

time.sleep(2)

for i in range(3):
        pyautogui.move(100, 0, duration=0.25) #right
        pyautogui.move(0, 100, duration=0.25) #down
        pyautogui.move(-100, 0, duration=0.25)#left
        pyautogui.move(0, -100, duration=0.25)#up

time.sleep(2)

pyautogui.click(x=3530, y=18) #type ", button=right" after the y coordinate to right click

time.sleep(2)

pyautogui.click()    # Click to make the window active.
distance = 300
change = 20
while distance > 0:
    pyautogui.drag(distance, 0, duration=0.2)   # Move right.
    distance = distance - change
    pyautogui.drag(0, distance, duration=0.2)   # Move down.
    pyautogui.drag(-distance, 0, duration=0.2)  # Move left.
    distance = distance - change
    pyautogui.drag(0, -distance, duration=0.2)  # Move up.

myscreen = pyautogui.screenshot()
myscreen.save("image.png")
