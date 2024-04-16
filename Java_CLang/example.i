%module example

%inline %{
    extern int foo();
    extern int listFiles();
    extern int fileTest();
    extern int preprocessingTest();
    extern int dataTypeSizeTest();
    extern int localTimeCheck();
    extern int pointersTest();
    extern int characterSetTest();
%}
