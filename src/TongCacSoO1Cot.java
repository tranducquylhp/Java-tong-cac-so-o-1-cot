import java.util.Scanner;

public class TongCacSoO1Cot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so hang: ");
        int row = scanner.nextInt();
        System.out.println("Nhap so cot: ");
        int col = scanner.nextInt();
        float[][] arr = new float[row][col];
        for (int i=0; i<row; i++){
            for (int j=0; j<col; j++){
                System.out.print("Nhap phan tu cua hang "+i+" cot "+j+" = ");
                arr[i][j] = scanner.nextFloat();
            }
        }
        int x = scanner.nextInt();
        try {
            for (int i=0; i<row; i++){
                for (int j=0; j<col; j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
            float sum=0;
            for (int i=0; i<row; i++){
                sum+=arr[i][x];
            }
            System.out.println("Tong cot "+x+" la: "+sum);
        }catch (Exception e){
            System.err.println("Khong co cot "+x);
        }
    }
}
