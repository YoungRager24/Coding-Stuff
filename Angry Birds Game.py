# --------------------------------------- IMPORTS STATEMENTS----------------------------------------
# (Put the necessary import statements first)
from math import radians, tan, cos, sqrt
import matplotlib.pyplot as plt
import random

# -------------------------------------- FUNCTION DEFINITIONS---------------------------------------
# (Then put any function definitions)

def get_basics():
   """Takes user selections for active bird and planet. Returns (bird, planet). 'Bird' includes
      name, color and size. 'Planet' includes name and gravity. """
   a = bird_picker()                                  # Runs fn to provide bird menu
   b = planet_picker()                                # Runs fn to provide planet menu
   return a, b

def trajectory_y(x, g, vo, angle):
   """Returns (y-value) of the trajectory for a given x-val, gravity, initial velocity,and angle."""
   angle = radians(angle)
   return (x*tan(angle))-(g*x**2)/(2*(vo**2)*cos(angle)**2)

def bird_picker():
   '''Prints "Bird Menu" and takes user inputs for bird . If user input does not match any bird from menu then it
   asks for user input again. Returns(name, color, size) of bird.'''
   print('----------Bird Menu----------')
   print('Red = red, small bird\nChuck = yellow, small bird\nBomb = black, large bird\nTerence = red, large bird\n')

   user_bird = input('Enter bird you want (Red, Chuck, Bomb, Terrence): ').capitalize()
   while user_bird not in ('Red', 'Chuck', 'Bomb', 'Terrence'):
      user_bird = input('Enter bird you want (Red, Chuck, Bomb, Terrence): ').capitalize()

   name = ''
   color = ''
   size = ''
   if user_bird == 'Red':
      name = 'Red'
      color = 'red'
      size = 'small bird'
   elif user_bird == 'Chuck':
      name = 'Chuck'
      color = 'yellow'
      size = 'small bird'
   elif user_bird == 'Bomb':
      name = 'Bomb'
      color = 'black'
      size = 'large bird'
   elif user_bird == 'Terrence':
      name = 'Terrence'
      color = 'red'
      size = 'large bird'
   return name, color, size

def planet_picker():
   '''Prints "Planet Menu" and takes user inputs for planet. If user input does not match any planet from menu
   then it asks for user input again. Returns(name, g) of planet.'''
   print('\n------Planet Menu------')
   print('Earth = 9.807 m/s2\nMars = 3.711 m/s2\nMoon = 1.625 m/s2\nJupiter = 24.79 m/s2\n')

   user_planet = input('Enter planet you want (Earth, Mars, Moon, Jupiter): ').capitalize()
   while user_planet not in ('Earth', 'Mars', 'Moon', 'Jupiter'):
      user_planet = input('Enter planet you want (Earth, Mars, Moon, Jupiter): ').capitalize()

   name = ''
   g = 0
   if user_planet == 'Earth':
      name = 'Earth'
      g = 9.807
   elif user_planet == 'Mars':
      name = 'Mars'
      g = 3.711
   elif user_planet == 'Moon':
      name = 'Moon'
      g = 1.625
   elif user_planet == 'Jupiter':
      name = 'Jupiter'
      g = 24.79
   return name, g

def get_guesses():
   '''Takes user input for initial velocity and theta as floats. Returns(v_guess, theta_guess).'''
   v_guess = float(input('\nEnter initial velocity (m/s): '))
   theta_guess = float(input('\nEnter angle in degrees: '))
   return v_guess, theta_guess

def trajectory(g, v_guess, theta_guess):
   '''Function parameters are g, v_guess, theta_guess. And calls trajectory_y function to get y values given x ,g,
   v_guess, theta_guess, and creates x and y value lists with a loop. Returns(x_vals, y_vals) which are a list of
   x and y values on trajectory'''
   x_vals = []
   y_vals = []
   x = 0
   y = 0
   while y >= 0:
      y = trajectory_y(x, g[1], v_guess, theta_guess)
      if y >= 0:
         x_vals.append(x)
         y_vals.append(y)
         x += 0.1
   return x_vals, y_vals

def hit(x, y, target):
   '''Returns (True) if given value of x and y are on or near the target. Returns (False) if given value of x and y are
   not on or near the target '''
   r = target[2] / 2
   for i in range(len(x)):
      if (x[i] <= (target[0] + r)) and (x[i] >= (target[0] - r)):
         if (y[i] <= (target[1] + r)) and (y[i] >= (target[1] - r)):
            find_y = sqrt((x[i]**2) + (r**2))
            if (y[i] <= (y[i] + find_y)) and (y[i] >= (y[i] - find_y)):
               return True
   return False

def birds_plot(x, y, target, bird, bool=False):
   '''Plots trajectory of bird, uses color and size of bird. And plots green pig and puts X if pig gets hit by bird
   using the given x, y, target, bird, and contains a user default value which determines when to plot the X.'''
   if max(x) > target[0]:
      my_maxX = max(x)
   else:
      my_maxX = target[0] + target[2]
   if max(y) > target[1]:
      my_maxy = max(y)
   else:
      my_maxy = target[1] + target[2]

   my_markersize = 25
   plt.axhline(y=0, color='k', linestyle='-')

   if bool == False:
      if bird[0] == 'Red':
         plt.plot(x, y, '--r')
         c = plt.Circle((target[0], target[1]), radius=(target[2] / 2), color='lime')
         plt.axis("equal")
         plt.axis([0, my_maxX, 0, my_maxy])
         plt.gca().add_artist(c)
         plt.show()
      elif bird[0] == 'Chuck':
         plt.plot(x, y, '--y')
         c = plt.Circle((target[0], target[1]), radius=(target[2] / 2), color='lime')
         plt.axis("equal")
         plt.axis([0, my_maxX, 0, my_maxy])
         plt.gca().add_artist(c)
         plt.show()
      elif bird[0] == 'Bomb':
         plt.plot(x, y, '--k', linewidth=5)
         c = plt.Circle((target[0], target[1]), radius=(target[2] / 2), color='lime')
         plt.axis("equal")
         plt.axis([0, my_maxX, 0, my_maxy])
         plt.gca().add_artist(c)
         plt.show()
      elif bird[0] == 'Terrence':
         plt.plot(x, y, '--r', linewidth=5)
         c = plt.Circle((target[0], target[1]), radius=(target[2] / 2), color='lime')
         plt.axis("equal")
         plt.axis([0, my_maxX, 0, my_maxy])
         plt.gca().add_artist(c)
         plt.show()
   elif bool == True:
      if bird[0] == 'Red':
         plt.plot(x, y, '--r')
         c = plt.Circle((target[0], target[1]), radius=(target[2] / 2), color='lime')
         plt.axis("equal")
         plt.axis([0, my_maxX, 0, my_maxy])
         plt.gca().add_artist(c)
         plt.plot(target[0], target[1], 'rX', markersize=my_markersize)
         plt.show()
      elif bird[0] == 'Chuck':
         plt.plot(x, y, '--y')
         c = plt.Circle((target[0], target[1]), radius=(target[2] / 2), color='lime')
         plt.axis("equal")
         plt.axis([0, my_maxX, 0, my_maxy])
         plt.gca().add_artist(c)
         plt.plot(target[0], target[1], 'rX', markersize=my_markersize)
         plt.show()
      elif bird[0] == 'Bomb':
         plt.plot(x, y, '--k', linewidth=5)
         c = plt.Circle((target[0], target[1]), radius=(target[2] / 2), color='lime')
         plt.axis("equal")
         plt.axis([0, my_maxX, 0, my_maxy])
         plt.gca().add_artist(c)
         plt.plot(target[0], target[1], 'rX', markersize=my_markersize)
         plt.show()
      elif bird[0] == 'Terrence':
         plt.plot(x, y, '--r', linewidth=5)
         c = plt.Circle((target[0], target[1]), radius=(target[2] / 2), color='lime')
         plt.axis("equal")
         plt.axis([0, my_maxX, 0, my_maxy])
         plt.gca().add_artist(c)
         plt.plot(target[0], target[1], 'rX', markersize=my_markersize)
         plt.show()
# ------------------------------------------ MAIN PROGRAM ------------------------------------------
# (Then your Main Program)

# Sets up loop so user can repeat the game as many times as desired ('y' to continue, 'n' to quit)
pig_counter = 0
again = 'y'
while again == 'y':

   # Program will pick a random distance (x from 10-1000), height (y from 0-50) and size of a target
   target = (random.randint(10, 1000), random.randint(0, 50), random.randint(10, 50))

   # Takes initial guesses
   bird, g = get_basics()                           # Runs fn to get bird and planet information
   v_guess, theta_guess = get_guesses()             # Runs fn to get velocity and angle guesses

   # Loops guesses until bird hits target
   x, y = trajectory(g, v_guess, theta_guess)       # Create current x- and y- value lists
   while not hit(x, y, target):                     # Program cycles until throw hits the target
      birds_plot(x, y, target, bird)               # Plots trajectory & target of miss
      v_guess, theta_guess = get_guesses()         # Gets updated guesses from user
      x, y = trajectory(g, v_guess, theta_guess)   # Creates updated lists of x- and y-values

   # Handles winning case and asks if user would like to play again
   print('Yay!')
   pig_counter += 1
   birds_plot(x, y, target, bird, True)
   again = input('Would you like to play again? (y/n)')
   while again not in {'y', 'n'}:
       again = input('Please type either y or n only. Would you like to play again? (y/n)')

# Exiting when user decides to quit
print('\nThanks for playing! You popped %d pig(s) today!' % pig_counter)
