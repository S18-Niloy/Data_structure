
//////////////////////////////////// Name: Soumik Deb Niloy ////////////////////////////////////

//////////////////////////////////// ID: 20301207 ////////////////////////////////////

//////////////////////////////////// Section: 05 ////////////////////////////////////










class LinearArray {
    public static void main(String[] args) {
        
        ////////////////// 01 //////////////////
        
        System.out.println("-----------Task 01-----------");
        int[] a_1={10,20,30,40,50,60}; 
        int[] v_1 = shiftleft(a_1,3);
        for(int i=0;i<a_1.length;i++){
            System.out.println(v_1[i]);
        }
        
        ////////////////// 02 //////////////////
        
        System.out.println("-----------Task 02-----------");
        
        int[] a_2={10,20,30,40,50,60}; 
        int[] v_2 = rotateleft_k(a_2,3);
        for(int i=0;i<a_1.length;i++){
            System.out.println(v_2[i]);
        }
        
        ////////////////// 03 //////////////////
        
        System.out.println("-----------Task 03-----------");
        int[] a_3={10,20,30,40,50,60}; 
        int[] v_3 = shiftright(a_3,3);
        for(int i=0;i<a_3.length;i++){
            System.out.println(v_3[i]);
        }
        
        ////////////////// 04 //////////////////
        
        System.out.println("-----------Task 04-----------");
        int[] a_4={10,20,30,40,50,60}; 
        int[] v_4 = rotateright_k(a_4,3);
        for(int i=0;i<a_4.length;i++){
            System.out.println(v_4[i]);
        }
        
        ////////////////// 05 //////////////////
        
        System.out.println("-----------Task 05-----------");
        int[] a_5={10,20,30,40,50,0,0}; 
        int[] v_5 = remove(a_5,5,3);
        for(int i=0;i<a_5.length;i++){
            System.out.println(v_5[i]);
        }
        
        ////////////////// 06 //////////////////
        
        System.out.println("-----------Task 06-----------");
        int[] a_6={10,2,30,2,50,2,2,0,0}; 
        int[] v_6 = removeAll(a_6,7,2);
        for(int i=0;i<a_6.length;i++){
            System.out.println(v_6[i]);
        }
        
        ////////////////// 07 //////////////////
        
        System.out.println("-----------Task 07-----------");
        int[] a_7={1,1,1,2,1}; 
        splittingArray(a_7);
        
        ////////////////// 08 //////////////////
        
        System.out.println("-----------Task 08-----------");
        ArraySeries(3);
        
        System.out.println("-----------Task 09-----------");
        int[] a_8 = { 1, 2, 2, 3, 3, 3, 4, 4, 1, 1, 1, 1,1 };
        
        MaxBunchCount(a_8);
        
        System.out.println("-----------Task 10-----------");
        int[] a_9 = {4,5,6,6,4,3,6,4};
        repetition(a_9);
    
        
    }
    
    
    ////////////////// 01 //////////////////
    public static int[] shiftleft(int[] array, int k){
        for (int i=k;i<array.length;i++){
            array[i-k]=array[i];
        }
        for(int j=k;j<array.length;j++){
            array[j]=0;
        }
        return array;
    }
    
    ////////////////// 02 //////////////////
    
    public static int[] rotateleft_k(int[] array, int k){
        int[] slice=new int[3];
        for (int i=0;i<k;i++){
            slice[i]=array[i];
        }
        for (int i=k;i<array.length;i++){
            array[i-k]=array[i];
        }
        for(int j=k;j<array.length;j++){
            array[j]=slice[j-k];
        }
        return array;
    }
    
    ////////////////// 03 //////////////////
    
    public static int[] shiftright(int[] array, int k){
        for (int i=0;i<k;i++){
            array[i+k]=array[i];
        }
        for(int j=0;j<k;j++){
            array[j]=0;
        }
        return array;
    }
    
    ////////////////// 04 //////////////////
    
    public static int[] rotateright_k(int[] array, int k){
        int[] slice=new int[6];
        for (int i=k;i<array.length;i++){
            slice[i]=array[i];
        }
        for (int i=0;i<k;i++){
            array[i+k]=array[i];
        }
        for(int j=0;j<k;j++){
            array[j]=slice[j+k];
        }
        return array;
    }
    
    ////////////////// 05 //////////////////
    
    public static int[] remove(int[] array, int size ,int idx){
        for (int i=idx; i<=size;i++){
            array[i]=array[i+1];
        }
        return array;
    }
    
    ////////////////// 06 //////////////////
    
    public static int[] removeAll(int[] array, int size, int n){
        for (int i=0;i<=size;i++){
            if (array[i]==n){
                remove(array,size,i);
            }
        }
        
        for (int i=0;i<array.length;i++){
            if (array[i]==n){
                remove(array,size,i);
            }
        }
        return array;
    }
    
    ////////////////// 07 //////////////////
    
    public static int[] splittingArray(int[] array) {
        int sum = 0, sum_2 = 0, sum_3 = 0, sum_4 = 0;
        Boolean x = true, y = false;
        for (int i = 0; i <= (array.length / 2) - 1; i++) {
            sum += array[i];
        }
        for (int j = array.length / 2; j < array.length; j++) {
            sum_2 += array[j];
        }
        for (int k = 0; k <= array.length / 2; k++) {
            sum_3 += array[k];
        }
        for (int l = (array.length / 2) + 1; l < array.length; l++) {
            sum_4 += array[l];
        }
        if (sum == sum_2) {
            System.out.println(x);
        } else {
            if (sum_3 == sum_4) {
                System.out.println(x);
            } else {
                System.out.println(y);
            }
        }
        return array;
    }
    
    ////////////////// 08 //////////////////
    
    public static void ArraySeries(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = n; j > 0; j--) {
                int k = n - i + 1;
                if (j <= k) {
                    System.out.println(j);
                } else {
                    System.out.println(0);
                }
            }
        }
    }
    
    ////////////////// 09 //////////////////
    public static void MaxBunchCount(int[] array){
        int[]empty=new int[array.length];
        int x=0;
        int index = 1;
        for(x=0;x<array.length-1;x++){
            if(array[x]==array[x+1]){
                index+=1;
            }
            else{
                if(index>1){
                    empty[index]=index;
                    index=1;
                }
            }
            if(x==array.length-2){
                empty[x]=0;
                empty[x+1]=index;
            }
        }
        
        int m=empty[0];
        for (int i =0;i<empty.length;i++){
            if(empty[i]>m){
                m=empty[i];
            }

        }
        
        System.out.println(m);
    }
    
    ////////////////// 10 //////////////////
    
    public static void repetition(int[]s){
        Boolean a=null;
        int[] empty=new int[s.length];
        int r=100;
        for(int i = 0; i < s.length; i++) {
            int count = 1;
            for(int j = i+1; j < s.length; j++){
                if(s[i]==s[j]){
                    count++;
                    empty[j]=r;
                }
            }
            if(empty[i]!=r) {
                empty[i] = count;
            }
        }

        for (int i =0;i<empty.length;i++){
            for(int j=i+1;j<empty.length;j++){
                if(empty[i]==empty[j]){
                    a=true;
                }
                else{
                    a=false;
                }
            }
        }
        System.out.println(a);
    }

}





