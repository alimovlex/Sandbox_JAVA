public class main 
{
    public static void main(String argv[]) 
    {
        System.loadLibrary("example"); // Attempts to load example.dll (on Windows) or libexample.so (on Linux)
        //System.out.println(example.foo());
	System.out.println(example.listFiles());
	System.out.println(example.fileTest());
	System.out.println(example.preprocessingTest());
	System.out.println(example.dataTypeSizeTest());
	System.out.println(example.localTimeCheck());
	System.out.println(example.pointersTest());
	System.out.println(example.characterSetTest());
	//System.out.println("Hello world!");
    }
}

/*
int listFiles();
int fileTest();
int preprocessingTest();
int dataTypeSizeTest();
int localTimeCheck();
void timerFunction(int(func)());
int pointersTest();
int characterSetTest();
int argumentsTest(int args,...);
int sandbox();
*/
