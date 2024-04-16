#include <iostream>

using namespace std;

class kitty {
 public:
  kitty();
  ~kitty();

  static kitty m();

  void speak();  
  void speak2() { 
  cout << "totes works" << endl; 
  }

};