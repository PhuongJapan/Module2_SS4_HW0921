package Session4;

import java.util.Scanner;

public class Session4_hw2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập vào số dòng");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào số cột");
        int col = Integer.parseInt(scanner.nextLine());
        //2.Khai báo và khởi tạo mảng 2 chiều gồm row và col
        int [][] arrInt = new int[row][col];

        do{
            System.out.println("*******MENU*******");
            System.out.println("1.Nhập các giá trị của mảng");
            System.out.println("2.In ra giá trị các phẩn tử trong mảng");
            System.out.println("3.In giá trị các phần tử nằm trên đường biên của ma trận và tính tổng");
            System.out.println("4.In giá trị các phần tử nằm trên đường chéo chính và chéo phụ và tính tổng");
            System.out.println("5. In ra giá trị lớn nhất và nhỏ nhất trong mảng");
            System.out.println("6. Sắp xếp mảng tăng dần theo cột");
            System.out.println("7. Thoát");
            System.out.println("Lựa chọn của bạn là gì:");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Bạn vừa chọn nhập vào các giá trị mảng");
                    //3.Nhập giá trị các phần tử của mảng;
                    for (int i = 0; i < row; i++) {
                        //i chạy theo dòng
                        for (int j = 0; j < col; j++) {
                            //j chạy theo cột
                            System.out.printf("arrInt[%d][%d]=",i,j);
                            //Lưu giá trị
                            arrInt[i][j]=Integer.parseInt(scanner.nextLine());
                        }
                    }
                    break;
                case 2:
                    System.out.println("Bạn vừa chọn in ra các giá trị mảng");
                    System.out.println("Các phần tử của mảng 2 chiều là");
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            //In dòng
                            System.out.printf("%5d",arrInt[i][j]);
                        }
                        System.out.printf("\n");
                    }
                    System.out.printf("\n");
                    break;

                case 3:
                    System.out.println("Các giá trị đường biên là: ");
                    int sum =0;
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            if (i == 0 || j == 0 || i == row - 1 || j == col - 1) {
                                System.out.print(arrInt[i][j]+" ");
                                sum+=arrInt[i][j];
                            }else{
                                System.out.print("  ");
                            }
                        }
                        System.out.println();
                    }
                    System.out.println("Tổng các phần tử là: "+sum);
                    System.out.printf("\n");
                    break;

                case 4:
                    int sum1 =0;
                    int sum2=0;
                    if (row == col) {
                        //Số dòng == số cột -> ma trận vuông
                        System.out.println("Các phần tử nằm trên đường chéo chính:");
                        for (int i = 0; i < row; i++) {
                            for (int j = 0; j < col; j++) {
                                if (i == j) {
                                    System.out.println(arrInt[i][j]);
                                    sum1+=arrInt[i][j];
                                }
                            }
                        }
                        System.out.println("Tổng các phần tử đường chéo chính là"+sum1);
                        System.out.println("Các phần tử nằm trên đường chéo phụ:");
                        for (int i = 0; i < row; i++) {
                            for (int j = 0; j < col; j++) {
                                if (i + j == row - 1) {
                                    System.out.println(arrInt[i][j]);
                                    sum2+=arrInt[i][j];
                                }
                            }
                        }System.out.println("Tổng các phần tử đường chéo phụ là"+sum2);
                    }
                    System.out.printf("\n");
                    break;
                case 5:
                    System.out.println("Bạn vừa chọn để tìm ra số lớn nhất và nhỏ nhất của mảng");
                    int min=arrInt[0][0];
                    int max=arrInt[0][0];
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++)  {
                            if(arrInt[i][j]>max){
                                max=arrInt[i][j];

                            }if (arrInt[i][j]<min){
                                min=arrInt[i][j];
                            }
                        }
                    }System.out.println("Giá trị lớn nhất của mảng là: "+max);
                    System.out.println("Giá trị nhỏ nhất của mảng là: "+min);
                    System.out.printf("\n");
                    break;
                case 6:
                    System.out.println("Bạn chọn thoát nên chương trình kết thúc");
                    System.exit(0);
                default:
                    System.err.println("Vui lòng chỉ chọn từ 1 đến 6");

            }
        }while (true);
    }
}

