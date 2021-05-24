package com.anna.msccs;
import java.util.*;  
public class Hashset_prg{  
public static void main(String args[]){    
HashSet<String> set=new HashSet<String>();  
set.add("Hema");  
set.add("Kalai");  
set.add("Hema");  
set.add("Sanjay");  
//Traversing elements  
Iterator<String> itr=set.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}  