// BankingFileProject.cpp : This file contains the 'main' function. Program execution begins and ends there.
//
/*
Write a program that gets a user's first and last name,  account number, and the amounts of their last 4 bank transactions.
Take the data entered and write it to a file.  Then read the data from the file and display in a report to the screen for the user.
The report should format their name into lastname, first. Format the account number to show only the last 4, and should format the transactions
into $00.00 format.
*/
#include <iostream>
#include <fstream>
#include <iomanip>
#include <string>
using namespace std;

int main()
{

    ifstream bankData;
    ofstream bankReport;
    string firstName = "";
    string lastName = "";
    string acctNumber = "";
    string last4 = "";
    double transactions[4] = { 0 };
    char again = 'Y';
    bankReport.open("bankingFile.txt", ios::app);
    string banner = "";
    banner.assign('*', 20);
    cout << banner << endl;
    cout << "\t\t* Charles thompson *" << endl;
    cout << "\t\t* CPT-168-A80S *" << endl;
    cout << "\t\t* Total Sales *" << endl;
    cout << banner << endl << endl;

    while (toupper(again) == 'Y')
    {
        cout << "Please enter your first name: ";
        cin >> firstName;
        cout << "Please enter your last name: ";
        cin >> lastName;
        cout << "Please enter your account number: ";
        cin >> acctNumber;
        cout << "Please enter your last 4 transactions: " << endl;

        for (int transaction = 0; transaction < 4; transaction++)//7654321
        {
            cout << "Transaction " << transaction + 1 << ": ";
            cin >> transactions[transaction];

        }
        bankReport << firstName << "#" << lastName << "#" << acctNumber.substr(acctNumber.length() - 4);
        for (int index = 0; index < 4; index++)//7654321
        {
            bankReport << "#" << transactions[index];

        }
        bankReport << endl;

        cout << " Wrote record to file...." << endl;

        cout << "Do you have another set of info to write? (y or n):  ";
        cin >> again;


    }
    bankReport.close();
    system("pause");
    bankData.open("bankingFile.txt", ios::in);

    if (bankData.is_open())
    {
        cout << "File opened for reading!!!" << endl;

    }
    else
    {
        cout << " ERROR opening file! Exiting..." << endl;
        return 0;
    }
    int record = 0;
    cout << "Reading Records" << endl;
    while (bankData.eof() == false)
    {
        record++;
        getline(bankData, firstName, '#');
        getline(bankData, lastName, '#');
        getline(bankData, last4, '#');
        for (int index = 0; index < 4; index++)
        {
            bankData >> transactions[index];
            bankData.ignore();

        }
        cout << lastName << ", " << firstName.substr(0, 1) << ".\t XXX-XX" << last4 << endl;
        cout << "Last 4 Transactions: " << endl;

        for (int transaction = 0; transaction < 4; transaction++)//7654321
        {
            cout << "Transaction " << transaction + 1 << ": ";
            cout << transactions[transaction] << endl;

        }

    }
    cout << "Done!" << endl;
    bankData.close();

    cout << "T  H  A  N  K    Y  O  U  ! !" << endl;
    system("pause");
    return 0;

}