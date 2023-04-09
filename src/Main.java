public class Main {
    public static void main(String[] args) {
        //task 1

//        int tower[] = new int[50];
//        for (int i = 1, j=0; i <= 99;i=i+2, j++) {
//            tower[j]=i;
//        }
//        for (int i = 0; i < tower.length; i++) {
//            System.out.println(tower[i]);
//        }


//        //task 2
//        int book[] = new int[20];
//        for (int i = 0; i < 20; i++) {
//            book[i] = (int) (Math.random()*10);
//            System.out.print(book[i] + " ");
//        }
//        System.out.println(" ");
//       // int bookmark[] = new int[20];
//        for (int i = 0; i < book.length; i++) {
//            if (0 == i % 2)
//                book[i] = book[i];
//            else
//                book[i] = 0;
//            System.out.print(book[i] + " ");
//
//        }


        //task 3
//        int z[] = new int[5];
//        int x[] = new int[5];
//        int c[] = new int[5];
//        int sumz = 0;
//        int sumx = 0;
//        int sumc = 0;
//        for (int i = 0; i < 5; i++) {
//            z[i] = (int) (Math.random() * 6);
//            System.out.print(z[i] + " ");
//        }
//        System.out.println();
//        for (int i = 0; i < 5; i++) {
//            x[i] = (int) (Math.random() * 6);
//            System.out.print(x[i] + " ");
//        }
//        System.out.println();
//        for (int i = 0; i < 5; i++) {
//            c[i] = (int) (Math.random() * 6);
//            System.out.print(c[i] + " ");
//        }
//        for (int i = 0; i < z.length; i++) {
//            sumz += z[i];
//        }
//        for (int i = 0; i < z.length; i++) {
//            sumx += x[i];
//        }
//        for (int i = 0; i < z.length; i++) {
//            sumc += c[i];
//        }
//        System.out.println();
//        System.out.println("Сума:" + sumz + " " + sumx + " " + sumc);
//        double z1 = (double) sumz / 5;
//        double x1 = (double) sumx / 5;
//        double c1 = (double) sumc / 5;
//        if (z1>=x1 & z1>=c1){
//            System.out.println("Найбільше число:" + z1);
//        }
//        else if (x1>=z1 & x1>=c1){
//            System.out.println("Найбільше число:" + x1);
//        }
//        else if (c1>=z1 & c1>=x1) {
//            System.out.println("Найбільше число:" + c1);
//        }
        //task 4
//        int[] one = new int[10];
//        int[] two = new int[10];
//        int[] sum = new int[10];
//        for (int i = 0; i < 10; i++) {
//            one[i] = (int) (Math.random() * 11);
//            System.out.print(one[i] + " ");
//        }
//        System.out.println("");
//        for (int i = 0; i < 10; i++) {
//            two[i] = (int) (Math.random() * 11);
//            System.out.print(two[i] + " ");
//        }
//        System.out.println("");
//        for (int i = 0; i < 10; i++) {
//            sum[i] = one[i] + two[i];
//            System.out.print(sum[i] + " ");
//
//        }
        //task 5
//        int[] arr = new int[15];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = (int) (Math.random() * 11);
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//
//        int count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % 2 == 0) {
//                count++;
//            }
//        }
//        System.out.println("К-сть парних елементів: " + count);


        //task 6
//        int[][] array = new int[15][];
//        array [0] = new int [5];
//        array [1] = new int [5];
//        array [2] = new int [5];
//        array [3] = new int [5];
//        array [4] = new int [8];
//        array [5] = new int [8];
//        array [6] = new int [8];
//        array [7] = new int [8];
//        array [8] = new int [3];
//        array [9] = new int [3];
//        array [10] = new int [3];
//        array [11] = new int [3];
//        array [12] = new int [9];
//        array [13] = new int [9];
//        array [14] = new int [9];
//
//        for(int i = 0;i < array.length;i++){
//            for(int j = 0;j < array[i].length;j++){
//                array[i][j] = (int)(Math.random()*16);
//                System.out.print(array[i][j]+" ");
//            }
//            System.out.println(" ");
//    }
}
}