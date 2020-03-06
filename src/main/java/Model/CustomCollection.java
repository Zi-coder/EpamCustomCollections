package Model;

import java.util.ArrayList;
import java.util.List;

public class CustomCollection {
    List<Integer> mainList = new ArrayList<Integer>();
    
    public void add(int data){
        mainList.add(data);
    }
    int get(int index){
        return mainList.get(index);
    }
    public void remove(int data){
        if(mainList.contains(data))
        mainList.remove(data);
        else {
            System.out.println("Data Not Found");
        }
        
    }
    public void print(){
        System.out.println("\nData :- ");
        for(int data : mainList)
            System.out.print(data + " ");
    }
    public int find(int data){
        if(mainList.contains(data))
            return mainList.indexOf(data);
        
        return -1;
    }
}
