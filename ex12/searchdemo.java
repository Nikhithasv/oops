/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generic;

/**
 *
 * @author @21CSE078
 */
public class searchdemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Integer se[]={0,2,13,54,15,86};
        test4<Integer,Integer> obj=new test4<>();
        obj.search(15, se);
       
    }
   
}
class test4<S,N>
{
    boolean check=false;
   
    public  <S,N> void search(S s,N[] value)
    {
        for(int i=0;i<value.length;i++)
        {
            if(s.equals(value[i]))
            {
                check= true;
                break;
            }
            else
                check=false;      
        }
       
        if(check)
            System.out.println("Search value Present");
        else
            System.out.println("Search value Not Present");
    }
}