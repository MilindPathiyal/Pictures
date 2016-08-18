//Milind Pathiyal

//Pictures Lab : User enters # of rows and columns and prints out multiplication table user enters # of lines he would like the pyramid to be, print sunburst

import java.util.*;
import gpdraw.*;
import java.awt.Color;
public class pictures
{
    public void start()
    {
        Scanner keys = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int numRow = keys.nextInt();
        System.out.println("Enter number of columns");
        int numCol = keys.nextInt();
        findTable(numRow, numCol);
        
        System.out.println("How many lines would you like the pyramid to be?");
        int lines = keys.nextInt();
        makePyramid(lines);
    }
    
    public void findTable(int numRow, int numCol)
    {
        for (int col = 1; col <=numCol; col++)
        {
            System.out.print("\t" + col + "\t");
            ///Prints out the column multiplicators
        }
        System.out.println();
        System.out.println();  //Spacing
        for (int row = 1; row <= numRow; row ++)
        {
            System.out.print(row); //Prints out the row multiplicators
            for (int col = 1; col <= numCol; col ++)
            {
                System.out.print("\t" + row * col + "\t");
            }
            System.out.println();
        }
    }
    
    public void makePyramid(int lines)
    {
        int sum = 1;
        for (int i = 0; i < lines; i++)
        {   
            for (int j = 0; j < lines - sum; j++)
            {
                System.out.print(" ");//For every time j is less than line - sum, a space is inserted
            }
            for (int k = 0; k <= i; k++)
            { 
                System.out.print("* ");//Every time while is true. it prints *
            }
            System.out.println();
            sum ++;//Sum allows the program to evenly space the * by row
        }
    }
    
    public void sunburst()
    {
        SketchPad pad = new SketchPad (500,500);
        DrawingTool pen = new DrawingTool(pad);
        int sum = 1;
        
        while (sum <= 360)
        {
            float hue = (float)(sum/360.0000);  //Color
            pen.setColor(Color.getHSBColor(hue, 1.0f, 1.0f));   //Fade Color
            pen.forward(100);
            pen.backward(100);
            pen.turnRight(1);
            sum++;
        }
    }
}
        
/*
Enter number of rows
4
Enter number of columns
6
    1       2       3       4       5       6   

1   1       2       3       4       5       6   
2   2       4       6       8       10      12  
3   3       6       9       12      15      18  
4   4       8       12      16      20      24  
How many lines would you like the pyramid to be?
5
    * 
   * * 
  * * * 
 * * * * 
* * * * * 
*/










