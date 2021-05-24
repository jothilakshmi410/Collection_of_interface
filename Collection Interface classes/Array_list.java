package com.anna.msccs;
import java.util.*;  
class Array_list{  
public static void main(String args[]){  
ArrayList<String> list=new ArrayList<String>(); 
list.add("Jothi"); 
list.add("Lakshmi");  
list.add("Jothi");  
list.add("Sakthi");  
//Traversing list through Iterator  
Iterator itr=list.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}  