// Jared-Daniels-CPT-168-A80S-Test-2.cpp : This file contains the 'main' function. Program execution begins and ends there.
/*
Jared Daniels
CPT-168-A80S
Test 2
*/

#include <iostream>
#include <iomanip>
using namespace std;
int main()
{
	// Display my information
	cout << "\t\t******************************" << endl;
	cout << "\t\t*        Jared Daniels       *" << endl;
	cout << "\t\t*        CPT-168-A80S        *" << endl;
	cout << "\t\t*  Calculate Chritmas Bonus  *" << endl;
	cout << "\t\t*           Test-2           *" << endl;
	cout << "\t\t******************************" << endl << endl;

	//Declare variables
	float weight = 0.0;
	double shipping = 0.0;

	//Input/Output
	cout << "Please enter the package weight: ";
	cin >> weight;

	//Decision
	if (weight <= 24)
	{
		if (weight >= 8)
		{
			shipping = .20 * weight;
		}
		else
		{
			cout << "****** Free Shipping ******" << endl;
		}
	}
	else
	{
		shipping = .30 * weight + 20;
	}

	//Output
	cout << "-------> Shipping cost: $";
	cout << fixed;
	cout << setprecision(2);
	cout << shipping << endl;
	cout << "\t\t****** T H A N K  Y O U ******" << endl;

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
