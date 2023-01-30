
package javaapplication77;

import java.util.Arrays;

public class JavaApplication77 {

    public static void main(String[] args) {

             int value=35;
             int index=2;
       
               int arr[]= { 25,14,56,15,36 };
               
               System.err.println("element is arr[]"+"~~"+Arrays.toString(arr));

               int newarr[]=new int[arr.length+1];
               
               for (int i = 0; i < newarr.length; i++) {
                   if(i< index){
                    newarr[i]=arr[i];}
                   else if(i==index){
                  newarr[index]=value;}
                   else{
                    newarr[i]=arr[i-1];
                   }
        }
               
             System.err.println("element is newarr[]"+"~~"+Arrays.toString(newarr));

    }
               
    }
    

