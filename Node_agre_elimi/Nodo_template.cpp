#include <stdlib.h>
#include <stdio.h>

typedef struct _nodo {
   int valor;
   struct _nodo *siguiente;
} tipoNodo;


typedef tipoNodo *pNodo;
typedef tipoNodo *Lista;

/* Funciones con listas: */
void Insertar(Lista *l, int v);
void Borrar(Lista *l, int v);

int ListaVacia(Lista l);

void BorrarLista(Lista *);
void MostrarLista(Lista l);

int main() {
   Lista lista = NULL;
   pNodo p;
//////////////se insertan los numeros /////////////
   Insertar(&lista, 20);
   Insertar(&lista, 10);
   Insertar(&lista, 40);
   Insertar(&lista, 30);

   MostrarLista(lista);
//////////////////Aqui se borra /////////
   Borrar(&lista, 10);
   /*
   Borrar(&lista, 30);
   Borrar(&lista, 40);*/

   MostrarLista(lista);

   BorrarLista(&lista);

   return 0;
}

void Insertar(Lista *lista, int v) {
   pNodo nuevo, anterior;

   
   nuevo = (pNodo)malloc(sizeof(tipoNodo));
   nuevo->valor = v;

   if(ListaVacia(*lista) || (*lista)->valor > v) {
      nuevo->siguiente = *lista;
      *lista = nuevo;
   } else {

      anterior = *lista;
      while(anterior->siguiente && anterior->siguiente->valor <= v)
         anterior = anterior->siguiente;
      nuevo->siguiente = anterior->siguiente;
      anterior->siguiente = nuevo;
   }
}

void Borrar(Lista *lista, int v) {
   pNodo anterior, nodo;

   nodo = *lista;
   anterior = NULL;
   while(nodo && nodo->valor < v) {
      anterior = nodo;
      nodo = nodo->siguiente;
   }
   if(!nodo || nodo->valor != v) return;
   else {
      if(!anterior) 
         *lista = nodo->siguiente;
      else 
         anterior->siguiente = nodo->siguiente;
      free(nodo);
   }
}

int ListaVacia(Lista lista) {
   return (lista == NULL);
}

void BorrarLista(Lista *lista) {
   pNodo nodo;

   while(*lista) {
      nodo = *lista;
      *lista = nodo->siguiente;
      free(nodo);
   }
}

void MostrarLista(Lista lista) {
   pNodo nodo = lista;

   if(ListaVacia(lista)) printf("Lista vacía\n");
   else {
      while(nodo) {
         printf("%d -> ", nodo->valor);
         nodo = nodo->siguiente;
     }
     printf("\n");
   }
}