#include <iostream>
#include <cstdlib>
#include <stdio.h>
#include <string>
#include<sstream>
#include <memory>

using namespace std;
#pragma once

class Date
{
	private:
		int day, month, year;
		std::string dateInString; 
	public:
		Date(int inMonth, int inDay, int inYear) : month(inMonth), day(inDay), year(inYear){};
		int formatDate(){
            std::cout<<month <<"/"<<day<<"/"<<year;
			//return day;
		}
		void increment(){
			day=day++;
		}
        Date operator+(int daysToAdd){
            Date newDate(month,day+daysToAdd,year);
            return newDate;
         }

		Date& operator ++() {
			++day;
			return *this;
		}
		Date& operator --() {
			--day;
			return *this;
		}
		
        //
	Date operator ++(int){
		Date copy (month,day,year);
		++day;
		return copy;
	}
	Date operator --(int){
		Date copy (month,day,year);
		--day;
		return copy;
	}
	
	operator const char* () {
		std::ostringstream formatDate;
		formatDate<<month<<"/"<<day<<"/"<<year;
		dateInString = formatDate.str();
		return dateInString.c_str();
	}

	
};

class Bis {
	public:

		void esAnoBis(int yr) {
			if(yr % 4 == 0 || yr % 400 == 0)
				cout << "es year bis, por lo que las fechas son las siuguientes:" << endl;
			else
				cout << "No es year bisiesto, por lo que las fechas son las siuguientes:" << endl;
		}
};



int main ()
{
    int yr;
    int yea;
	Bis z;
	cout << "Enter a year:" << endl;
	cin >> yea;
	z.esAnoBis(yea);



    std::cout<<"Enero"<<std::endl;
    Date a(01,01,yea);
    std::cout<<a<<std::endl;
    Date b(a+30);//copia de a+10 dias 
    std::cout<<b<<std::endl;
    

  
    std::cout<<"\nFebrero"<<std::endl;
    Date c(02,01,yea);
    std::cout<<c<<std::endl;
    
    if(yr % 4 == 0 || yr % 400 == 0){
    Date d(c+27);//copia de a+10 dias 
    std::cout<<d<<std::endl;   
   }else{
    Date d(c+28);//copia de a+10 dias 
    std::cout<<d<<std::endl;   
   }
    

    std::cout<<"\nMarzo"<<std::endl;
	Date e(03,01,yea);
    std::cout<<e<<std::endl;
    Date f(e+30);//copia de a+10 dias 
    std::cout<<f<<std::endl;

	

    std::cout<<"\nAbril"<<std::endl;
    Date g(04,01,yea);
    std::cout<<g<<std::endl;
    Date h(g+29);//copia de a+10 dias 
    std::cout<<h<<std::endl;

	std::cout<<"\nMayo"<<std::endl;
	Date i(05,01,yea);
    std::cout<<i<<std::endl;
    Date j(i+30);//copia de a+10 dias 
    std::cout<<j<<std::endl;


    std::cout<<"\nJunio"<<std::endl;
    Date k(06,01,yea);
    std::cout<<k<<std::endl;
    Date l(k+29);//copia de a+10 dias 
    std::cout<<l<<std::endl;

    std::cout<<"\nJulio"<<std::endl;
    Date m(07,01,yea);
    std::cout<<m<<std::endl;
    Date n(m+30);//copia de a+10 dias 
    std::cout<<n<<std::endl;

	std::cout<<"\nAgosto"<<std::endl;
    Date o(8,01,yea);
    std::cout<<o<<std::endl;
    Date p(o+30);//copia de a+10 dias 
    std::cout<<p<<std::endl;

	std::cout<<"\nSeptiembre"<<std::endl;
    Date q(9,01,yea);
    std::cout<<q<<std::endl;
    Date r(q+29);//copia de a+10 dias 
    std::cout<<r<<std::endl;

	std::cout<<"\nOctubre"<<std::endl;
	Date s(10,01,yea);
    std::cout<<s<<std::endl;
    Date t(s+30);//copia de a+10 dias 
    std::cout<<t<<std::endl;

    std::cout<<"\nNoviembre"<<std::endl;
    Date u(11,01,yea);
    std::cout<<u<<std::endl;
    Date v(u+29);//copia de a+10 dias 
    std::cout<<v<<std::endl;

    std::cout<<"\nDiciembre"<<std::endl;
    Date w(12,01,yea);
    std::cout<<w<<std::endl;
    Date x(w+30);//copia de a+10 dias 
    std::cout<<x<<std::endl;
   

     
    /*
    std::unique_ptr<int>smartIntPtr(new int);
    *smartIntPtr=42;

    std::cout<<"Integer value is "<< *smartIntPtr<<std::endl;
    std::unique_ptr<Date>smartDatePtr(new Date(04,07,2022));
    smartDatePtr->formatDate();

*/
   
/*
	Date a(04,07,2022);
	std::cout<< a<<std::endl;
	++a;
	std::cout<< a <<std::endl;
*/
}
