package com.anna.msccs;
import java.util.*;  
public class Linkedhashset{  
public static void main(String args[]){  
LinkedHashSet<String> set=new LinkedHashSet<String>();  
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