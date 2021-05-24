package com.anna.msccs;import java.util.*;  
public class Vector_prgm{  
public static void main(String args[]){  
Vector<String> v=new Vector<String>();  
v.add("Jothi");  
v.add("Hema");  
v.add("Priya");  
v.add("Rudhra");  
Iterator<String> itr=v.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}  