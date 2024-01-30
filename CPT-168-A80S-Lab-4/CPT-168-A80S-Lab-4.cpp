// CPT-168-A80S-Lab-4.cpp : This file contains the 'main' function. Program execution begins and ends there.
//Jared Daniels CPT-168-A80S Lab 4

#include <iostream>
using namespace std;
int main()
{
	// Display my information
	cout << "\t\t******************************" << endl;
	cout << "\t\t*        Jared Daniels       *" << endl;
	cout << "\t\t*        CPT-168-A80S        *" << endl;
	cout << "\t\t*    Calculate Commission    *" << endl;
	cout << "\t\t*            Lab-4           *" << endl;
	cout << "\t\t******************************" << endl << endl;
	
	// Declare variables
	int carsSold = 0;
	float commission = 0.0;
	
	// Input/Output
	cout << "Please enter number of cars you sold: ";
	cin >> carsSold;

	//Process
	commission = carsSold * 500;

	//Output
	cout << "\tYour commission is: $" << commission << endl;
	cout << "\t\tT H A N K  Y O U" << endl;
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
