#include <iostream>
using namespace std;

int prizeTable1[21] = {500,300,300,200,200,200,50,50,50,50,30,30,30,30,30,
10,10,10,10,10,10 };

int prizeTable2[31] = {512,256,256,128,128,128,128,64,64,64,64,64,64,64,64,
32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32};

int MyPrize(int _a, int _b)
{
	int total = 0;
	
	if ((_a >= 1) && (_a <= 21))
	{
		total += prizeTable1[_a - 1];
	}

	if ((_b >= 1) && (_b <= 31))
	{
		total += prizeTable2[_b - 1];
	}

	total *= 10000;
	return total;

}


int main()
{
	int testcase;
	cin >> testcase;

	int a;
	int b;

	for (int i = 0; i < testcase; i++)
	{
		cin >> a >> b;
		cout << MyPrize(a, b) << "\n";
	}

	return 0;
}