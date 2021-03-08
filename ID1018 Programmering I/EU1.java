public class Algoritmer {



public static void UrvalSortera ( int [] v )
{

    int e;
    int minst;

    for (int pos = 0; pos < v.length - 1; pos++) {
        minst = pos;

        for (int jamfor = pos + 1; jamfor < v.length; jamfor++)
            if (v[jamfor] < v[minst])
                minst = jamfor;

        if (minst != pos) {
            e = v[pos];
            v[pos] = v[minst];
            v[minst] = e;
        }

        System.out.println(java.util.Arrays.toString(v));



    }

}





     //Insätningssortering
    public static void sort(int [] element)
      {

       int e = 0;
       int  halpos = 0;


    for (int pos = 1; pos< element.length; pos++)
    {

        e = element[pos];
        halpos = pos;



        while (halpos > 0 && e < element[halpos - 1])
        {
            element[halpos] = element[halpos - 1];
            halpos--;
        }

        element[halpos] = e;
        System.out.println(java.util.Arrays.toString(element));

    }
    }




    // sökningsalgortim
    public static int find(int[] element, int e)
    {

        int x=0;

        for (int pos = 0; pos < element.length; pos++)
            if (e == element[pos]) {
                x = pos;
                break;
            }
            else
                x = -1;
            return x;

    }




     //Binary search
    public static int sok(int[] element, int a){
        int forst = 0;
        int sist = element.length-1;
        int mitterst = 0;


        while (forst<=sist)
        {
            mitterst = (forst+sist)/2;
            if (a==element[mitterst])
                break;
            else if (a < element[mitterst])
                sist = mitterst-1;
            else
                forst = mitterst+1;
        }
        if (!(forst<=sist))
            mitterst = -1;

        return mitterst;


        }


}