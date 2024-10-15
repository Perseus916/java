import java.util.Scanner;
class Main{
    public static void main(String[] args){
        System.out.println("23DIT023 - ANSH KANSARA");
        char[] a={'A','B','C','D'};
        String[] b={"...-","..-.",".-..","-..."};

        int n;

        do {
            System.out.println("CHOOSE \n FROM 1. ENG TO MORSE \t 2. MORSE TO ENGLISH");
            Scanner obj = new Scanner(System.in);
            int x=obj.nextInt();

            if(x==1){
                System.out.println("CHAR TO MORSE::::: \n");
                System.out.println("ENTER YOUR CHARACTER: ");
                Scanner obj1 = new Scanner(System.in);
                String line=obj1.nextLine();

                for(int i=0;i<line.length();i++){
                    char s = line.charAt(i);
                    if(s==a[i]){
                        System.out.print(b[i]);
                    }
                }

            }
            else {
                System.out.println("MORSE TO CHAR::::: \n");
                System.out.println("ENTER YOUR MORSE CODE (use spaces to separate each morse character): ");
                Scanner obj2 = new Scanner(System.in);
                String line = obj2.nextLine();
                String[] s2 = line.split(" ");
                String cod = "";
                for (int i = 0; i < s2.length; i++) {
                    int index = 0;
                    for (int j = 0; j < b.length; j++) {
                        if (b[j].equals(s2[i])) {
                            index = j;
                        }
                    }
                    cod = cod + a[index];
                }
                System.out.println("String : " + cod);
            }
            System.out.println("\n Press 1 to continue further and 2 to exit: ");
            Scanner obj5= new Scanner(System.in);
            n=obj5.nextInt();
        } while (n!=2);

    }
}
