// ArrayExamples.cpp : This file contains the 'main' function. Program execution begins and ends there.
//
/*Write a program that creates three parallel arrays that will contain the information that relates to famous
* peoples net worth. The program should ask the user to enter a number 101-110. That number should give them
* the person, along with their net worth, and their favorite vacation spot.  After showing the person's information
* the program should also tell us if this person has a net worth over 5 billion dollars and if their favorite
* vacation is in the US or not. The program should also display all the people at the end with their information
* and ask the user if they would want to display another famous person, if they do, the program should clear the screen
* and repeat.
* *** also display a menu for the output****

what is the goal????? is going to display a famous person's networth, name, vacation spot. then tell if their worth more than
5 billion, and tell if they favorite spot is in the us or not.
what is this program going to do????
take user input to display famous info, determine networth over 5 bill, vacation spot in or out of us, display all people at the end
allow user to repeat program again and clear the screen if they choose to do so.

How do we do it?
*/
#include <iostream>
#include <iomanip>
using namespace std;

int main()
{
	//display my information
	cout << "\t\t******************************" << endl;
	cout << "\t\t* Jared Daniels *" << endl;
	cout << "\t\t* CPT-168-A80S *" << endl;
	cout << "\t\t* Total Sales *" << endl;
	cout << "\t\t******************************" << endl << endl;

	//Declare my variables
	string nameArr[10] = { "Elon Musk", "Steve Jobs", "Jeff Bezos", "Mark Cuban", "Steve Wazniack", "Oprah Winfrey", "Steve Harvey",
		"Mark Zukerburg", "Warren Buffet", "Tyler Perry" };
	string vacationArr[10] = { "FR-Paris", "AUS-Sydney", "US-Hawaii", "OTH-Maldives", "SA-Capetown", "US-Los Angeles", "OTH-Barbados",
		"UAE-Dubai", "US-New York City", "US-South Beach Miami" };
	int netWorthArr[10] = { 0 };
	int inputNum = 0;

	//input
	cout << "Please enter the networth for the following famous people." << endl;

	for (int sub = 0; sub < 10; sub++)//0->9
	{
		cout << "Person " << sub + 1 << ": " << nameArr[sub] << ":  ";
		cin >> netWorthArr[sub];
	}

	cout << "Please enter a number between 101 and 110 to retrieve a person" << endl;
	cin >> inputNum; //101-110 ->0-9(-101)


	cout << nameArr[inputNum - 101] << "  Net Worth: " << netWorthArr[inputNum - 101] << "  Favorite Vacation Spot:  " << vacationArr[inputNum - 101] << endl;
	if (netWorthArr[inputNum - 101] > 5000000000)
	{
		cout << "Hey they have alot of money" << endl;
	}
	if (vacationArr[inputNum - 101].substr(0, 2) == "US")
	{
		cout << "They like to vacation in the US" << endl;
	}
	else if (vacationArr[inputNum - 101].substr(0, 3) == "OTH")
	{
		cout << "We do not know where this is! " << endl;
	}



	cout << "Results:" << endl;
	for (int sub = 0; sub < 10; sub++)//0->9
	{
		cout << "Person: " << nameArr[sub] << "  Net Worth: " << netWorthArr[sub] << " Favorite Spot: " << vacationArr[sub] << endl;
	}

	cout << "T  H  A  N  K   Y  O  U " << endl;
	system("Pause");
	return 0;
}
