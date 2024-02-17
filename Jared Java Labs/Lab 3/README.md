a. Create a class to hold Event data for Yummy Catering. The class contains the following:

Two public final static fields that hold the price per guest ($35) and the cutoff value for a large event (50 guests).
Three private fields that hold an event number, number of guests for the event, and the price. The event number is stored as a String because the company plans to assign event numbers such as M312.
Two public set methods that set the event number (setEventNumber()) and the number of guests (setGuests()). The price does not have a set method because the setGuests() method will calculate the price as the number of guests multiplied by the price per guest every time the number of guests is set.
Three public get methods that return the values in the three nonstatic fields.
A constructor that accepts an event number and number of guests as parameters. Pass these values to the setEventNumber() and setGuests() methods, respectively. The setGuests() method will automatically calculate the event price.
Another constructor that is a default constructor that passes A000 and 0 to the two-parameter constructor. Save the file as YourNameEvent.java.
b. Create an application that declares two Event objects.

One Event object uses the default constructor.
The other Event object is constructed from values input by a user.
Display the details of each object by passing them, in turn, to a method named displayDetails(). Save the file as YourNameEventDemo.java.

 

a. Yummy Catering provides meals for parties and special events. In the previous section, you created an Event class for the company. Now, make the following changes to the class:

Currently, the class contains a constant for the price per guest ($35) that is used for every guest. Replace that constant field with two constant fields—a lower price per guest that is $32 and a higher price per guest that is $35.
Add a new method named isLargeEvent() that returns true if the number of guests is 50 or greater and otherwise returns false.
Modify the method that sets the number of guests so that a large Event (more than 50 guests) uses the lower price per guest to set the field that holds the price per guest and to calculate the total Event price. A small Event uses the higher price.
Save the file as YourNameEvent.java.

 

 

 

Yummy Catering provides meals for parties and special events. In previous chapters, you developed a class named Event that holds catering event information. Now create an EventDemo application to do the following:

Create three Event objects.
Continually prompt the user for the number of guests for each Event until the value falls between 5 and 100 inclusive.
Display the details for each Event object.
For the Event object with the fewest number of guests, create a loop that displays Please come to my event! as many times as there are guests for the Event.
Save the file as  YourNameEventDemo.java.
