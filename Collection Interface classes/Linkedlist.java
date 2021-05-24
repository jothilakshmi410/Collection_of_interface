package com.anna.msccs;
import java.util.*;  
public class Linkedlist{  
public static void main(String args[]){  
LinkedList<String> al=new LinkedList<String>();  
al.add("Jothi");  
al.add("Lakshmi");  
al.add("Jothi");  
al.add("Sakthi");  
Iterator<String> itr=al.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}  