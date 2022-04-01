#include <stdio.h> 
#include <iostream>
#include <cstdlib>

using namespace std;

class Triangulo {
	private:
		int s,fil,l,k,m;
	public:
		Triangulo(int);
		void filas();
};

class Cuadrado {
	private:
		int num,i,j;
	public:
		Cuadrado(int);
		void numero();	
};

class Menu{
	private:
		int opc;
    public:
    	Menu(int);
    	void opcion();
};

Menu :: Menu (int oo){
	opc=oo;
}
void Menu::opcion(){
	
        system("cls");
        cout << "\n\nMenu de Opciones" << endl;
        cout << "1. Opcion 1" << endl;
        cout << "2. Opcion 2" << endl;
        cout << "0. SALIR" << endl;

        switch (opc) {
            case 1:
                system("pause>nul"); 
                break;
            case 2:         
                system("pause>nul"); 
                break;  
        }        
}

Cuadrado :: Cuadrado (int n){
	num=n;
}

void Cuadrado::numero() {
	 for (int i = 1; i <= num; i++) {
        for (int j = 1; j <= num; j++) {
            if (i == 1 || i == num || j == 1 || j == num){
                cout<<"* ";
            }else{
            	cout<<"  ";
            }
        }
        cout<<"\n";
    }
}


Triangulo :: Triangulo (int f){
	fil=f;
}
void Triangulo::filas() {
    s=fil+4-1; 
   for(int l=1;l<=fil;l++) 
   { 
      for(int k=s;k>=1;k--) 
            { 
              printf(" "); 
            } 
      for(int m=1;m<=l;m++){
            printf("* ");
     }
    printf("\n"); 
    s--; 
   }
}




int main(){
	int x;
	bool rep=true;
	do{
    system("cls");
	cout << "****MENU DE OPCIONES****"<< "\n";
	cout << "1.-Cuadrado vacio "<< "\n\n";
	cout << "2.-Triangulo Equilatero"<< "\n\n";
	cout << "3.-Salir del programa"<< "\n\n";
	cin>>x;
	
	if(x==1){
	Cuadrado R2(5);
    R2.numero();
    system("pause>nul");
	}
	else if (x==2){
	Triangulo R1(8);
   	R1.filas();   
   	system("pause>nul");
	}
	else if (x==3){
		rep=false;
		cout << "Usted salio del programa :)"<< "\n";
	}
	
 }while(rep);
return 0;
}