import java.nio.file.FileSystem;

public class stars
{
    public static void main (String[]args)
    {
        int abc, def;
        for (abc = 0; abc < 10; abc++)
        {
            for (def = 0; def < 10; def++)
            {
                if ((def+abc) < 9)
                {
                    System.out.print("  ");
                    continue;
                }
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}