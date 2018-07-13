/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgbreak.pkg13.pkg07;

/**
 *
 * @author Kemal
 */
public class Break1307 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matris1=new int[10][10];
        int a=10;
        for (int i = 0; i < 10; i++) {///ilk olarak dizideki sayıların yerlerini belirledik.
            for (int j = 0; j < 10; j++)
            {
                matris1[i][j]=a;
                a++;
            }
        }
        for (int i = 0; i < 10; i++) //belirlediğimiz sayıları yerlerine yazdık.
        {
            System.out.println("");
            for (int j = 0; j < 10; j++) {
                System.out.print(matris1[i][j]+"\t ");
            }
        }
    }
    
}
/*Çıktı>>>
10	 11	 12	 13	 14	 15	 16	 17	 18	 19	 
20	 21	 22	 23	 24	 25	 26	 27	 28	 29	 
30	 31	 32	 33	 34	 35	 36	 37	 38	 39	 
40	 41	 42	 43	 44	 45	 46	 47	 48	 49	 
50	 51	 52	 53	 54	 55	 56	 57	 58	 59	 
60	 61	 62	 63	 64	 65	 66	 67	 68	 69	 
70	 71	 72	 73	 74	 75	 76	 77	 78	 79	 
80	 81	 82	 83	 84	 85	 86	 87	 88	 89	 
90	 91	 92	 93	 94	 95	 96	 97	 98	 99	 
100	 101	 102	 103	 104	 105	 106	 107	 108	 109	*/
