public class main {

	public static void main(String[] args) {
  
        for (int i=1; i<=10; i++)
        {
            for (int k=1; k<i; k++)
            {
                System.out.print(" ");
            }
            System.out.print("*");

            for (int j=1; j<=(10*2)-(i*2); j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
