public class DDDupEle0
{
        public static void main(String[] args)
        {
            int[][] a = {{5, 8, 11},
                        {15, 5, 20},
                        {11, 14, 15}};
            for(int i = 0; i < a.length; i++)
            {
                for(int j = 0; j < a.length; j++)
                {
                    for(int k = 0; k < a.length; k++)
                    {
                        for(int s = 0; s < a.length; s++)
                        {
                            if(k != i || s != j) // Avoid comparing the element with itself
                            {
                                if(a[i][j] == a[k][s])
                                {
                                    a[i][j] = 0;
                                }
                            }
                        }
                    }
                }
            }
            System.out.println("All Duplicate Elements are replaced by 0:");
            for(int i = 0; i < a.length; i++)
            {
                for(int j = 0; j < a[i].length; j++)
                {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
        }
}
