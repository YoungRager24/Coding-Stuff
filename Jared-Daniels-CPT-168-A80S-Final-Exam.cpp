// Jared-Daniels-CPT-168-A80S-Final-Exam.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>
#include <string>
#include <fstream>
#include <iomanip>
using namespace std;
int main()
{
	cout << "\t\t\t\t******************************" << endl;
	cout << "\t\t\t\t*        Jared Daniels       *" << endl;
	cout << "\t\t\t\t*        CPT-168-A80S        *" << endl;
	cout << "\t\t\t\t*         Final Exam         *" << endl;
	cout << "\t\t\t\t******************************" << endl << endl;

	ifstream inFile;
	inFile.open("acres.txt", ios::in);
	string first = "";
	string last = "";
	string zip = "";
	int year = 0;
	string state = "";
	string oddEven = "";
	double acres = 0.0;
	double tax = 0.0;
	int recordNum = 0;

	cout << "Last Name\tFirst Initial \t    State\tZip Code\tAcres\tTax\t\tOdd/Even" << endl;
	cout << "_________      \t______________\t    _____\t_________\t_____\t_______\t\t________" << endl;
	inFile >> first >> last >> acres >> zip >> year;

	while (inFile.eof() == false)
	{
		if (zip.substr(0, 1) == "9")
		{
			tax = acres * 500;
			state = "CA";
		}
		else if (zip.substr(0, 1) == "2")
		{
			tax = acres * 100;
			state = "SC";
		}
		else
		{
			tax = acres * 200;
			state = "FL";
		}
		if (zip.length() == 5)
			zip = zip + "-8623";
		if (year % 2 == 0)
			oddEven = "Even Year";
		else
			oddEven = "Odd Year";

		cout << last << "\t\t" << first.substr(0, 1) << "." << "                  " << state << "\t\t" << zip << "\t" << acres << "\t$" << tax << "\t\t" << oddEven << endl;
		inFile >> first >> last >> acres >> zip >> year;
		recordNum++;
	}
	
	cout << "\n\n\tNumber of records: " << recordNum << endl;
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
