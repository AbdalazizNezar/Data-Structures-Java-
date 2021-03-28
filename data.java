import java.util.*;
import java.io.*;

class Data {
  public static void main(String[] args) {

    int[] arr = {5, 4, 3, 2, 1};

    System.out.println(Arrays.toString(arr));

    Arrays.sort(arr);
    System.out.println("List After Sorting:");
    System.out.println(Arrays.toString(arr));

    System.out.println("--------------");
    ArrayList<Integer> list = new ArrayList<>();
    list.add(7);
    list.add(-100);
    list.add(0, 8);
    list.add(0);
    list.add(1094);

    list.remove(list.size()-1);
    for(int i=0; i<list.size(); i++){
      System.out.println(list.get(i));
    }

    Collections.sort(list);
    for(int element: list) {
      System.out.println(element);
    }

  }
}
