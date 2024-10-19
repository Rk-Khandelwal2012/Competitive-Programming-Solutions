public class printMatrix {

    public static void main(String args[]){
        int a[][] = new int[3][4];
        int count =1;
        for(int i =0;i<3;i++){
            for(int j=0;j<4;j++){
                a[i][j]=count;
                count++;
            }
            System.out.println();
        }
        for(int i =0;i<3;i++){
            for(int j=0;j<4;j++){
                    System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}

