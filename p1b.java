/*public class p1b {
public static void main(String[] args)
{
int[] a1={1,2,3,4,5};
int[] a2={6,7,8,9,10};
if(a1.length!=a2.length){
System.out.println("Arrays must have same length for multiplication");
return;
}
int[] res=new int[a1.length];
for(int i=0;i<a1.length;i++){
res[i]=a1[i]*a2[i];
}
System.out.print("Result of array multiplication:");
for(int num:res){
System.out.print(" "+num);
}
}
}*/

import java.util.Scanner;
public class p1b {
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.println("Enter the size of the array:");
int n=s.nextInt();
int[] a1=new int[n];
int[] a2=new int[n];
int[] res=new int[n];
System.out.println("Enter the elements of 1st array:");
for(int i=0;i<n;i++){
a1[i]=s.nextInt();
}
System.out.println("Enter the elements of 2nd array:");
for(int i=0;i<n;i++){
a2[i]=s.nextInt();
}
System.out.println("Addition of 2 arrays:");
for(int i=0;i<n;i++){
res[i]=a1[i]+a2[i];
}
for(int num:res){
System.out.print(" "+num);
}
s.close();
}
}
