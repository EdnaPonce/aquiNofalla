#include <iostream>
#include <conio.h>
#include <stdlib.h>
using namespace std;

struct Nodo{
    int dato;
    Nodo *siguiente;
};


//funciones en menu 
void menu();
void insertarLista(Nodo *&,int);
void mostrarLista(Nodo *);
void eliminarNodo(Nodo *&,int);


Nodo *lista =NULL;

int main(){
    menu();
    getch();
    return 0;
}

void menu (){
    int opcion, dato;

    do{
        cout<<"1.Elementos de la lista\n";
        cout<<"2.Mostrar elementos\n";
        cout<<"3.Eliminar un nodo de la lista\n";
        cout<<"4.salir\n";
        cout<<"Opcion:\n";
        
        cin>>opcion;

        switch (opcion){
            case 1:cout<<"Escribe un numero:\n";
            cin>>dato;
            insertarLista(lista,dato);
            cout<<"\n";
            system("pause");
            break;
            
            case 2:mostrarLista(lista);
            cout<<"\n";
            system("pause");
            break;
            
            
            case 3:cout<<"Elemeto a eliminar:\n";
            cin>>dato;
            eliminarNodo(lista,dato);
            cout<<"\n";
            system("pause");
            break;
        }
        system("cls");
    }while (opcion !=4);
}

void insertarLista (Nodo *&lista, int n){
    Nodo *nuevo_nodo = new Nodo();

    nuevo_nodo->dato=n;
    Nodo *aux1 =lista;
    Nodo *aux2;

    while((aux1 != NULL)&&(aux1->dato <n )){
        aux2=aux1;
        aux1=aux1->siguiente;
    }
    if (lista == aux1){
        lista = nuevo_nodo;
    }
    else{
        aux2->siguiente=nuevo_nodo;
    }
    nuevo_nodo->siguiente=aux1;
    cout<<"\tElemento  "<<n<<"   esta en la lista\n";
}

void mostrarLista(Nodo *lista){
    Nodo *actual =new Nodo();
    actual=lista;

    while(actual !=NULL){
        cout<<actual->dato<<"->";
        actual=actual->siguiente;
    }
}

void eliminarNodo(Nodo *&lista,int n){
    if (lista!=NULL){
        Nodo *aux_borrar;
        Nodo *anterior = NULL;
        aux_borrar=lista;

        while ((aux_borrar != NULL)&&(aux_borrar->dato != n))
        {
            anterior =aux_borrar;
            aux_borrar= aux_borrar->siguiente;
        }
        
        if(aux_borrar == NULL){
            cout<<"El elemento no existe";
        }

        else if (anterior == NULL){
            lista = lista->siguiente;
            delete aux_borrar;
        }
        else{
            anterior->siguiente=aux_borrar->siguiente;
            delete aux_borrar;
        }
    }
}
