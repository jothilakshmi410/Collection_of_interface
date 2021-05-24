package com.anna.msccs;
import java.util.*;  
public class Stack_prg{  
public static void main(String args[]){  
Stack<String> stack = new Stack<String>();  
stack.push("Jothi");  
stack.push("Hema");  
stack.push("Priya");  
stack.push("Rudhra");  
stack.push("Vanitha");  
stack.pop();  
Iterator<String> itr=stack.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}  