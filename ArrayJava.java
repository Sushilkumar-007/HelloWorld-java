import java.util.Scanner;
public class ArrayJava{
  public static void main(String args[])
  {
    System.out.println("Enter the size of array");
    Scanner sc=new Scanner(System.In);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
      {
        a[i]=i*5;
      }
    for(int j=0;j<n;j++)
      {
        System.out.println("array element "+j+"is"+a[j]);
      }
  }
}
