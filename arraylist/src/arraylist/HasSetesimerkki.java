package arraylist;

import java.util.*;

public class HasSetesimerkki {
	public static void main(String args[]){
	    HashSet<String> set=new HashSet<>();
	    set.add("Paul");
	    set.add("Ram");
	    set.add("Aaron");
	    set.add("Leo");
	    set.add("Becky");

	    Iterator<String> it=set.iterator();
	    while(it.hasNext()){
	      System.out.println(it.next());
	    }
	  }
	}

