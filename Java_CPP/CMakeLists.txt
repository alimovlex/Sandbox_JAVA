cmake_minimum_required(VERSION 2.8)

find_package(SWIG REQUIRED)
find_package(Java REQUIRED)
find_package(JNI REQUIRED)
include(UseJava)
include(UseSWIG)
include_directories(${JNI_INCLUDE_DIRS})
include_directories(Sandbox_CPP/source/inc)
file(GLOB Sandbox_CPP "Sandbox_CPP/source/inc/*.hpp" "Sandbox_CPP/source/src/*.cpp")

set( CMAKE_SWIG_OUTDIR ${CMAKE_CURRENT_BINARY_DIR} )

set_property(SOURCE example.i PROPERTY CPLUSPLUS ON)
#swig_add_library(mymod LANGUAGE python SOURCES mymod.i)

# Build the C++ code into a dynamic library: example.dll (on Windows) or libexample.so (on Linux)
swig_add_module(
    example 
    java 
    example.i 
    ${Sandbox_CPP}
)

# For convenience we copy the dynamic library to the current build folder
add_custom_command(
    TARGET example 
    POST_BUILD
    COMMAND ${CMAKE_COMMAND} -E copy_if_different $<TARGET_FILE:example> ${CMAKE_CURRENT_BINARY_DIR}
)

# Build the Java code into ExampleJNI.jar
add_jar(
    ExampleJNI
    SOURCES
    ${CMAKE_SWIG_OUTDIR}/example.java
    ${CMAKE_SWIG_OUTDIR}/exampleJNI.java
)
add_dependencies( ExampleJNI example )

# Finally build the demonstration code into Main.jar

set(CMAKE_JAVA_JAR_ENTRY_POINT main) 
add_jar(
    Main 
    SOURCES main.java
    ENTRY_POINT main
)
add_dependencies( Main ExampleJNI )
