// Jared-Daniels-CPT-168-A80S-Lab-9.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>
#include <string>
using namespace std;
int main()
{
	//Display my information
	cout << "\t\t******************************" << endl;
	cout << "\t\t*        Jared Daniels       *" << endl;
	cout << "\t\t*        CPT-168-A80S        *" << endl;
	cout << "\t\t*     String Manipulation    *" << endl;
	cout << "\t\t*            Lab-9           *" << endl;
	cout << "\t\t******************************" << endl << endl;

	//Declare variables
	string firstName = "";
	string lastName = "";
	string fullName = "";
	string revFull = "";
	string phone = "";
	string ssn = "";
	char answer = ' ';

	//Input
	do
	{
		cout << "Enter your first name: ";
		cin >> firstName;
		cout << "Enter your last name: ";
		cin >> lastName;
		fullName = firstName + " " + lastName;

		do {
			cout << "Enter 10 digit phone number (with no dashes or parenthesis): ";
			cin >> phone;
		} while (phone.length() != 10);

		do {
			cout << "Enter 9 digit SSN (with no dashes): ";
			cin >> ssn;
		} while (ssn.length() != 9);

		for (int i = fullName.length(); i >= 0; i--)
		{
			revFull = revFull + fullName[i];
		}

		phone.insert(0, "(");
		phone.insert(4, ")");
		phone.insert(8, "-");
		ssn.insert(3, "-");
		ssn.insert(6, "-");

		cout << "\nYour full name is: " << fullName << endl;
		cout << "Your reversed full name is: " << revFull << endl;
		cout << "Your phone number: " << phone << endl;
		cout << "Your Social Security Number: " << ssn << endl;

		cout << "\nWould you like to try another set of phone and ssn (Y or N)? ";
		cin >> answer;
		cout << endl;
		revFull = "";
	} while (toupper(answer) == 'Y');

	cout << "\t\tT H A N K   Y O U\n" << endl;
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
