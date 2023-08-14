class HelloWorld {
    public static void main(String[] args) {
        int [] arr={0,1,2,6,9};
        System.out.println(contains(arr,1));
        int [] arr2={3,4,7,8,12};
       System.out.println(common(arr,arr2)) ;
    }
    
    public static String common(int[] a, int [] b){
    boolean isCommon=false;
    for(int i=0;i<a.length;i++){
        for(int j=0;j<b.length;j++){
            if(contains(a, b[j])){
                isCommon=true;
            }
            
        }
    }
            return "does to arrays have nything in common " + isCommon;

}


    public static boolean contains(int[] array, int input){
    for(int i=0;i<array.length;i++){
        if(array[i]==input){
            return true;
        
        }
    
    }
    return false;
}
}
