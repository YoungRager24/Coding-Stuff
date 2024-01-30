// Jared-Daniels-CPT-168-A80S-Lab-10.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>
#include <fstream> 
#include <string>
#include <iomanip>
using namespace std;

int main()
{
	cout << "\t\t******************************" << endl;
	cout << "\t\t*        Jared Daniels       *" << endl;
	cout << "\t\t*        CPT-168-A80S        *" << endl;
	cout << "\t\t*       Sequential File      *" << endl;
	cout << "\t\t*           Lab-10           *" << endl;
	cout << "\t\t******************************" << endl << endl;


	ifstream inFile;
	inFile.open("employee.txt");
	string firstName = "";
	string lastName = "";
	string ssn = "";
	double hoursWorked = 0.0;
	double hourlyRate = 0.0;
	double netPay = 0.0;
	double grossPay = 0.0;
	double deduction = 0.0;
	int num = 0;

	cout << fixed << setprecision(2);
	cout << " SSN            Name    \tHours\tRate\tGross\tDeductions\tNetPay" << endl;
	cout << " ____           _____________\t_____\t____\t_____\t__________\t______" << endl;
	inFile >> firstName >> lastName >> ssn >> hoursWorked >> hourlyRate;

	while (!inFile.eof())
	{
		if (hoursWorked >= 40)
			grossPay = hourlyRate * 40 + (hoursWorked - 40) * (hourlyRate * 1.5);
		else
			grossPay = hoursWorked * hourlyRate;

		deduction = grossPay * .10;
		netPay = grossPay - deduction;

		cout << " " << ssn.substr(7, 4) << "        \t" << firstName.substr(0, 1) << ". " << lastName << "  \t" << hoursWorked << "\t" << hourlyRate << "\t" << grossPay << "\t" << deduction << "\t\t" << netPay << endl;
		inFile >> firstName >> lastName >> ssn >> hoursWorked >> hourlyRate;
		num++;
	}

	cout << "\n\n\tNumber of records: " << num << endl;
	cout << "\n\t\tT H A N K  Y O U\n" << endl;
	inFile.close();
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
