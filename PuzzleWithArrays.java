class PuzzleWithArrays {
    public static void main(String[] args) {
        int[] a={1,234,3,43456,5,645678,7,845,9,906};
        byte[] b=new byte[a.length];
        for(int i=0;i<a.length;i++){
            b[i]=(byte)a[i];
        }
        System.out.println("Array in int: ");
        for(int c:a){
            System.out.print(c+",");

        }
        System.out.println();
        for(byte d:b){
            System.out.print(d+",");
        }



    }
}