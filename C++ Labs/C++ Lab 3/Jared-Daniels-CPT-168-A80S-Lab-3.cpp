// Jared-Daniels-CPT-168-A80S-Lab-3.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>
using namespace std;
int main() // Main Function
{
	system("color f0");
	// Display my information
	cout << "\t\t******************************" << endl;
	cout << "\t\t* Jared Daniels *" << endl;
	cout << "\t\t* CPT-168-A80S *" << endl;
	cout << "\t\t* Calculate Commission *" << endl;
	cout << "\t\t* Lab-3 *" << endl;
	cout << "\t\t******************************" << endl << endl;
	// Declare_variables
	double sale1 = 0.0;
	double sale2 = 0.0;
	double commissionRate = 0.0;
	double totalSales = 0.0;
	double commission = 0.0;
	// Input
	cout << "First sale? ";
	cin >> sale1;
	cout << "Second sale? ";
	cin >> sale2;
	cout << "Commission rate in decimal format? ";
	cin >> commissionRate;
	// Process
	totalSales = sale1 + sale2;
	commission = totalSales * commissionRate;
	// Output 
	cout << "\tCommission: $" << commission << endl;
	cout << "\n*********** T H A N K Y O U ***********\n" << endl;
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
