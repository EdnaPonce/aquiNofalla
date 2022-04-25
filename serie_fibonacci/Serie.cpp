#include <iostream>
using namespace std;
int main()
	{
	double t,a,s,n,suma;
	a=0;
	s=1;
	cout << "SUCESION FIBONACCI." <<endl;
	cout << "Numero de terminos:" <<endl;
	cin >> t;
		if (t==1)
		{
		cout << a;
		}
		if (t==2)
		{
		cout << a << ", " << s;
		}
		if (t>=3)
		{
		cout << a << ", " << s;
		}
			for (n=3;n<=t;n=n+1)
			{
			cout << ", ";
			suma=a+s;
			cout << suma;
			a=s;
			s=suma;
			}
	cout <<endl;
	return 0;
}