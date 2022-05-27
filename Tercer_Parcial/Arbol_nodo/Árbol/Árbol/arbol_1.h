#ifndef ARBOL_H
#define ARBOL_H
#include <iostream>

template<typename T>
class Arbol
{
	class Nodoarbol {
public:
		T data;
		Nodoarbol* hijoizq = nullptr;
		Nodoarbol* hijodere = nullptr;
		Nodoarbol(T _data) :
			data(_data) {};
	};
	Nodoarbol* root = nullptr;

public:
	Arbol() { }
	void add(T Nuevodato) {
		inseDebajo(Nuevodato, root);
	}
	
	void print() { 
		escribir(root);
	}

private:
	void inseDebajo(T Nuevodato, Nodoarbol*& n) {
		if (n == nullptr)
			n = new Nodoarbol(Nuevodato);
		else if (n->data > Nuevodato)
			inseDebajo(Nuevodato, n->hijoizq);
		else
			inseDebajo(Nuevodato, n->hijodere);
	}

	void escribir(Nodoarbol*& n) {
		if (n == nullptr)
		return;
		escribir(n->hijoizq); 
		std::cout << n->data << " "; 
		escribir(n->hijodere); 
	}
};
#endif