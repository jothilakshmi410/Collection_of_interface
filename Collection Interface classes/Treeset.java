package com.anna.msccs;
import java.util.*;  
public class Treeset{  
public static void main(String args[]){    
TreeSet<String> set=new TreeSet<String>();  
set.add("Hema");  
set.add("Kalai");  
set.add("Hema");  
set.add("Sanjay");    
Iterator<String> itr=set.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}  