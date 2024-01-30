// Jared-Daniels-CPT-168-A80S-Lab-8.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>
#include <iomanip>
using namespace std;
int main()
{
	//Declare variables
	string name[6] = { "Angelina Jolie", "Brad Pitt", "Margot Robbie", "George Clooney", "Jennifer Lopez", "Jennifer Lawrence" };
	string phone[6] = { "949-232-1124", "949-865-3492", "864-235-7569", "939-453-2288", "987-209-2132", "543-239-8745" };
	int inputNum = 0;
	char answer = ' ';

	//Input
	do
	{
		system("cls");
		cout << "\t\t******************************" << endl;
		cout << "\t\t*        Jared Daniels       *" << endl;
		cout << "\t\t*        CPT-168-A80S        *" << endl;
		cout << "\t\t*        Actor's Info        *" << endl;
		cout << "\t\t*            Lab-8           *" << endl;
		cout << "\t\t******************************" << endl << endl;
		
		cout << "Enter a number from 1 to 6 to display an actor's info: ";
		cin >> inputNum;
		if (inputNum >= 1 && inputNum <= 6)
		{
			cout << "\nYour actor's name is: " << name[inputNum - 1] << endl;
			cout << "Phone: " << phone[inputNum - 1] << endl;
		}
		else
		{
			cout << "Invalid number was entered." << endl;
		}
		cout << "\nWould you like to continue (Y or N)? ";
		cin >> answer;
	} while (toupper(answer) == 'Y');
	cout << "\nT H A N K   Y O U\n" << endl;
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
