// Jared-Daniels-CPT-168-A80S-Lab-7.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>
#include <iomanip>
using namespace std;
int main()
{
	//Declare variables
	char choose = 'Y';
	int x = 0;

	//Input/Output
	do
	{
		system("cls");
		cout << "\t\t******************************" << endl;
		cout << "\t\t*        Jared Daniels       *" << endl;
		cout << "\t\t*        CPT-168-A80S        *" << endl;
		cout << "\t\t*     Square-Cube Program    *" << endl;
		cout << "\t\t*            Lab-7           *" << endl;
		cout << "\t\t******************************" << endl << endl;

		cout << "Please enter a number to Square, Cube, and raise to the 4th power: ";
		cin >> x;

		cout << "\t" << left << setw(10) << "Number" << setw(10) << "Square" << setw(10) << "Cube" << setw(10) << "4th Power" << endl;
		cout << "\t" << left << setw(10) << "------" << setw(10) << "------" << setw(10) << "------" << setw(10) << "-------" << endl;

		for (int i = 1; i <= 10; i++)
		{
			cout << "\t" << left << setw(10) << x << setw(10) << pow(x, 2.0) << setw(10) << pow(x, 3.0) << setw(10) << pow(x, 4.0) << endl;
			x = x + 5;
		}
		cout << "Would you like to continue (Y or N)? ";
		cin >> choose;
	} while (toupper(choose) == 'Y');
	cout << "T H A N K  Y O U" << endl;
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
