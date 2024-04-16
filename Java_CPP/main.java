public class main 
{
    public static void main(String argv[]) 
    {
        System.loadLibrary("example"); // Attempts to load example.dll (on Windows) or libexample.so (on Linux)
	    //kitty a = kitty.m();
	    System.out.println(example.fileTest());
	    System.out.println(example.testingPointers());
	    System.out.println(example.localTimeCheck());
	    System.out.println(example.dataTypeSizeTest());
	    System.out.println(example.preprocessingTest());
	    //System.out.println("Hello world!");
    }
}

/*
int fileTest();
int testingPointers();
int argumentsTest(int args,...);
int localTimeCheck();
int dataTypeSizeTest();
int timerFunction(int(func)());
int preprocessingTest();
*/