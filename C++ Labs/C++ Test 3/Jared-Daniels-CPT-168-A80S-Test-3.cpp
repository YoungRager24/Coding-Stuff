// Jared-Daniels-CPT-168-A80S-Test-3.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>
#include <string>
#include <iomanip>
using namespace std;
int main()
{
	//Display my information
	cout << "\t\t******************************" << endl;
	cout << "\t\t*        Jared Daniels       *" << endl;
	cout << "\t\t*        CPT-168-A80S        *" << endl;
	cout << "\t\t*           Test 3           *" << endl;
	cout << "\t\t******************************" << endl << endl;

	//Declare variables
	int inputNum = 0;
	string horoscope[7] = { "This week is going to be a lucky week for you, buy lotto", "You will barely escape an accident this week", "You are going to have a week full of surprises",
		"You will receive a large amount of money this week", "You will get promoted at your job this week", "You will get a phone call from an old friend this week", "You may have some type of car problem this week" };
	string days[7] = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
	string numbers[7] = { "8,9,23,29,50", "7,19,21,38,51", "6,25,28,30,49", "22,27,33,37,42", "16,18,28,34,38", "10,3,6,13,33", "7,21,25,28,37" };

	//Input
	cout << "\t<<<<<<<<<<<<<< Hello >>>>>>>>>>>>>>" << endl;
	cout << "\nPlease enter a number from 1 - 7 or 99 to end: ";
	cin >> inputNum;
	do
	{
		if (inputNum >= 1 && inputNum <= 7)
		{
			cout << "\nYour " << days[inputNum - 1] << " Horoscope: " << horoscope[inputNum - 1] << endl;
			cout << "Lucky Carolina5 numbers: " << numbers[inputNum - 1] << endl;
		}
		else
		{
			cout << "Invalid number was entered\n";
		}
		cout << "\nPlease enter a number from 1 - 7 or 99 to end: ";
		cin >> inputNum;
	} while (inputNum >= 1 && inputNum <= 7 || inputNum != 99);
	cout << "\n\tT H A N K   Y O U\n" << endl;
	system("pause");
	return 0;
}

// Run program: Ctrl + F5 or Debug > Start Without Debugging menu
// Debug program: F5 or Debug > Start Debugging menu

// Tips for Getting Started: 
//   1. Use the Solution Explorer window to add/manage files
//   2. Use the Team Explorer window to connect to source control
//   3. Use the Output window to see build output and other messages
//   4. Use the Error List window to view errors
//   5. Go to Project > Add New Item to create new code files, or Project > Add Existing Item to add existing code files to the project
//   6. In the future, to open this project again, go to File > Open > Project and select the .sln file
