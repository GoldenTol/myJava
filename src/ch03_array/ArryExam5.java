package ch03_array;

public class ArryExam5 {
    public static void main(String[] args) {
        int[]aaa={10,20};
        int[][]arr=new int[2][3];
        for (int i=0; i<arr.length; i++){
            for(int k=0; k<arr.length; k++){
                arr[i][k]=i%arr.length+3*k+i;
            }
        }
        arr[0][2]=aaa[0]-5;
        arr[1][1]=arr[0][2]*aaa[1]-7;

        for (int i=0; i<arr.length; i++){
            System.out.println("==="+i+"번째 행 출력 === ");
            for (int k=0; k<arr.length; k++){
                System.out.print(arr[i][k]+"\t");
            }
            System.out.println();
            System.out.println();
        }
    }
}
