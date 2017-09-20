import java.util.Scanner;

class JavaPractice
{
    static  String out[];
static  int count=0;
       public static void main(String args[])
   
     {


          Scanner scan= new Scanner(System.in);
          String s=scan.nextLine();
          s=s.toUpperCase();
          int l=s.length();
          long f=fact(l);
          int temp[]=new int[26];

         for(int i=0;i<l;i++)
         {
            int p=s.charAt(i)-65;
            temp[p]++;

         }

         for(int i=0;i<26;i++)
         {
            if(temp[i]>1)
            f=f/fact(temp[i]);
         } 
      out=new String[(int)f];
      perm(s,l);
       

      
        
     } 

  public static long fact(int n)
   {
      
     if(n==1||n==0)
     
      return 1;

     else
     return n*fact(n-1);

   }


    void swap(int a,int b)
    {
         int temp;

         temp=a;
         a=b;
         b=temp;
    }


 public static void perm(String S,int n)
  {
        
        
        for(int i=0;i<n;i++)
        { 
           
           

        }

  }


}