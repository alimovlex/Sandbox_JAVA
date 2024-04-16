#include <iostream>
#include "example.hpp"

using namespace std;

kitty::kitty() {
  cout << "Constructor" << endl;
}

kitty::~kitty() {
  cout << "Destructor" << endl;
}

void kitty::speak() {
  cout << "I'm a cat." << endl;
}

kitty kitty::m() {
  cout << "mmmmm" << endl;
  return kitty();
}