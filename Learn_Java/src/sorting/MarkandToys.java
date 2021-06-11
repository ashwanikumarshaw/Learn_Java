package sorting;
import java.io.*;
import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
/*
 * MarkandToys
 * Mark and Jane are very happy after having their first child. Their son loves toys,
 *  so Mark wants to buy some. There are a number of different toys lying in front of him, 
 *  tagged with their prices. Mark has only a certain amount to spend, and he wants to maximize the number of toys he buys with this money.
 *  Given a list of toy prices and an amount to spend, determine the maximum number of gifts he can buy.

Note Each toy can be purchased only once.
Example :
I/P:
7 50
1 12 5 111 200 1000 10
O/P:
4
 */

public class MarkandToys {
    public static void main(String[] args){

    	
    	Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int k=sc.nextInt();

        List<Integer> prices = new ArrayList<Integer>(n);
        int i=0;
        while(i<n) {
        int a=sc.nextInt();
        prices.add(a);
        i++;
        }
        		System.out.println( maximumToys(prices, k));
       

    }


    /*
     * Complete the 'maximumToys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY prices
     *  2. INTEGER k
     */

    public static int maximumToys(List<Integer> prices, int k) {
    // Write your code here
    
    int c=0;
     Collections.sort(prices);
    // for(int a:prices)
    // System.out.print(a+ " ");
    for(int a:prices){
        if(k>0&a<k){
            k=k-a;
            c++;
        }else{
            break;
        }
    }
    return c;

    }


}

