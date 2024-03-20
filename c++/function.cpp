#include <iostream>

using namespace std;
int globle = 6;
void sum()
{
    globle = 56;
}
int main()
{
    globle = 78;
    sum();
    globle = 29;
    cout << globle << endl;
    return 0;
}