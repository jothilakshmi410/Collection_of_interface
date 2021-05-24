package com.anna.msccs;
import java.util.*;  
public class Deque_prg{  
public static void main(String[] args) {  
//Creating Deque and adding elements  
Deque<String> deque = new ArrayDeque<String>();  
deque.add("Karthik");  
deque.add("Gopi");  
deque.add("Swetha");  
//Traversing elements  
for (String str : deque) {  
System.out.println(str);  
}  
}  
}  