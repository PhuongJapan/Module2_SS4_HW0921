package Session4;

import java.util.Scanner;

public class Session4_hw1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. Nhập số phần tử của mảng từ bàn phím
        System.out.println("Nhập số phần tử của mảng:");
        int arrSize = Integer.parseInt(scanner.nextLine());
        //2. Khai báo và khởi tạo mảng
        int[] arrInt = new int[arrSize];
        //3. In ra menu và thực hiện các chức năng theo menu
        do {
            System.out.println("*********************MENU*********************");
            System.out.println("1. Nhập giá trị các phần tử của mảng");
            System.out.println("2. In ra giá trị các phần tử của mảng");
            System.out.println("3. In ra giá trị các phần tử chẵn và tính tổng");
            System.out.println("4. In các phần tử có giá trị là số nguyên tố và tính tổng");
            System.out.println("5. In ra phần tử có giá trị lớn nhất và nhỏ nhất trong mảng");
            System.out.println("6. Sắp xếp mảng giảm dần");
            System.out.println("7. Thoát");
            System.out.print("Lựa chọn của bạn:");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    for (int i = 0; i < arrInt.length; i++) {
                        System.out.printf("arrInt[%d]=", i);
                        arrInt[i] = Integer.parseInt(scanner.nextLine());
                    }
                    break;
                case 2:
                    System.out.println("Giá trị các phần tử trong mảng là:");

                    for (int element : arrInt) {
                        System.out.printf("%d\t", element);
                    }
                    System.out.printf("\n");
                    break;
                case 3:
                    System.out.println("Giá trị các phần tử chẵn trong mảng là:");
                    int sum=0;
                    for (int i = 0; i < arrInt.length; i++) {
                        if (arrInt[i] % 2 == 0) {
                            System.out.printf("%d\t", arrInt[i]);
                            sum+=arrInt[i];
                        }
                    }
                    System.out.println("Tổng các giá trị phần tử chẵn là: "+sum);
                    System.out.printf("\n");
                    break;
                case 4:
                    System.out.println("Giá trị các phần tử có giá trị là số nguyên tố: ");
                    boolean isPrime;
                    int sum2=0;
                    for (int element : arrInt) {
                        isPrime=true;
                        if(element<=1){
                            isPrime=false;
                        }else {
                            for (int i = 2; i <= Math.sqrt(element); i++) {
                                if (element%i==0){
                                    isPrime= false;
                                    break;
                                }
                            }
                        }
                        if (isPrime) {
                            System.out.printf("%d\t", element);
                            sum2+=element;
                        }
                    }
                    System.out.println("\nTổng các số nguyên tố là:"+sum2);
                    break;
                case 5:
                    System.out.println("Bạn vừa chọn để tìm ra số lớn nhất và nhỏ nhất của mảng");
                    int min=arrInt[0];
                    int max=arrInt[0];
                    for (int i = 0; i < arrInt.length; i++) {
                            if(arrInt[i]>max){
                                max=arrInt[i];

                            }if (arrInt[i]<min){
                                min=arrInt[i];
                        }
                    }System.out.println("Giá trị lớn nhất của mảng là: "+max);
                    System.out.println("Giá trị nhỏ nhất của mảng là: "+min);
                    System.out.printf("\n");
                    break;
                case 6:
                    for (int i = 0; i < arrInt.length - 1; i++) {
                        for (int j = i+1; j < arrInt.length; j++) {
                            if (arrInt[i]<arrInt[j]){
                                int temp = arrInt[i];
                                arrInt[i] = arrInt[j];
                                arrInt[j] = temp;
                            }
                        }
                    }
                    System.out.println("Đã sắp xếp xong mảng giảm dần");
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.err.println("Vui lòng chọn 1-7");
            }
        } while (true);
    }
}