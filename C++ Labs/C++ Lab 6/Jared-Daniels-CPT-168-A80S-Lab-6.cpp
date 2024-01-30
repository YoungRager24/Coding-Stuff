// Jared-Daniels-CPT-168-A80S-Lab-6.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

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
	cout << "\t\t*            Lab-6           *" << endl;
	cout << "\t\t******************************" << endl << endl;

	//Declare variables
	double grossPay = 0.0;
	int yearsWorked = 0;
	double bonus = 0.0;

	//Input/Output
	cout << "Please enter number of years you worked or (0, 99 or higher, negative number to exit): ";
	cin >> yearsWorked;

	//Decision
	while (yearsWorked > 0 && yearsWorked < 99)
	{
		cout << "Please enter your gross pay per year: $";
		cin >> grossPay;
		if (yearsWorked >= 1 && yearsWorked <= 5)
		{
			bonus = grossPay * .01;
		}
		else
		{
			bonus = grossPay * .02;
		}
		cout << "\tYour bonus is: $" << fixed << setprecision(2) << bonus << endl;
		cout << "Please enter number of years you worked or (0, 99 or higher, negative number to exit): ";
		cin >> yearsWorked;
	}

	//Output
	cout << "\t\tT H A N K  Y O U" << endl;

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
