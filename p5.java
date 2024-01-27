/*import java.util.Scanner;
public class p5{
public static void usrstrcmp(String s1,String s2){
if(s1.compareTo(s2)==0){
System.out.println("The two strings are equal");
}
else{
System.out.println("The two strings are not equal");
}
}
public static void usrstrcmp(String s1,String s2,int n){
String st1=s1.substring(0,n);
String st2=s2.substring(0,n);
if(st1.equals(st2)){
System.out.println("The 1st "+n+" characters of the two strings are equal");
}
else{
System.out.println("The 1st "+n+" characters of the two strings are not equal");
}
}
public static void main(String args[]){
Scanner s= new Scanner(System.in);
String str1;
String str2;
int n;
System.out.print("Enter 1st string:");
str1=s.next();
System.out.print("Enter 2nd string:");
str2=s.next();
usrstrcmp(str1, str2);
System.out.print("Enter the no. of characters to compare:");
n=s.nextInt();
usrstrcmp(str1, str2, n);
s.close();
}
}
*/
import java.util.Scanner;
public class p5 {
public static void usrstrcmp(String s1,String s2){
int flag=0;
for (int i = 0; i < s1.length(); i++) {
if(s1.charAt(i)!=s2.charAt(i)){
flag=1;
break;
}
}
if(flag==0){
System.out.println("The two strings are equal");
}
else{
System.out.println("The two strings are not equal");
}
}
public static void usrstrcmp(String s1,String s2,int n){
int flag=0;
for (int i = 0; i < n; i++) {
if(s1.charAt(i)!=s2.charAt(i)){
flag=1;
break;
}
}
if(flag==0){
System.out.println("The 1st "+n+" characters of the two strings are equal");
}
else{
System.out.println("The 1st "+n+" characters of the two strings are not equal");
}
}
public static void main(String args[]){
Scanner s= new Scanner(System.in);
String str1;
String str2;
int n;
System.out.print("Enter 1st string:");
str1=s.next();
System.out.print("Enter 2nd string:");
str2=s.next();
usrstrcmp(str1, str2);
System.out.print("Enter the no. of characters to compare:");
n=s.nextInt();
usrstrcmp(str1, str2, n);
s.close();
}
}
//Modification:Make use of charAt function in order to compare two strings instead of built-in functions
