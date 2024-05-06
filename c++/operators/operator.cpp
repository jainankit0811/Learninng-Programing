// there are two type of header files:
//  1. system header file: It comes with the compiler
//  2. user define header file: It is written by the programer
// #include "this.h" // --> user define header file
#include <iostream>

using namespace std;

int main()
{
    int a = 4, b = 5;
    cout << "Types of operators :" << endl;
    // Arithmetic op]erator
    cout << "value of a + b : " << a + b << endl;
    cout << "value of a - b : " << a - b << endl;
    cout << "value of a * b : " << a * b << endl;
    cout << "value of a / b : " << a / b << endl;
    cout << "value of a % b : " << a % b << endl;
    cout << "value of a++ : " << a++ << endl;
    cout << "value of ++a : " << ++a << endl;
    cout << "value of a-- : " << a-- << endl;
    cout << "value of --a : " << --a << endl;
    cout << endl;

    return 0;
}