import java.util.*;
import java.io.*;
public class File1
{
public static void main(String x[])
{
File f=new File("C:/Users/Dell Store Una/Desktop/java123456789/assignment10.text");
                  try
                   {
              FileOutputStream fout=new FileOutputStream(f);
                   String s="C:/Users/Test/video.mp4";
  char ch[]=s.toCharArray();
                 for(int i=0;i<s.length();i++)
                   {
             fout.write(ch[i]);
                  }
              fout.close();
                  }
            catch(Exception e)
            {
           System.out.println(e);
            }
}
}