public class StringDemo
{
 public static void main (String args[])
    {
        String s="";
        int c=0;
        Scanner(System.in);
        System.out.println("please enter number of string");
        s=in.nextLine();
        char ch[]= new char[s.length()];      
        for(i=0;i<s.length();i++)
        {
            ch[i]= s.charAt(i);
            if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )
            c++;
        }
        
        System.out.println("The number of words in the String are :  "+res);
    }
}
