public class Selection{
    public static void main(String[] args) {
        int[] a = {13,46,24,52,20,9};
        
        SelectioSort s = new SelectioSort();
        s.sort(a);

        
    }
}
class SelectioSort{
   
    void swap(int a[], int i,int j){
        int temp = a[i];
        a[i]= a[j];
        a[j]=temp;
    }
    int min(int a[],int i){
        int mini=i;
        for(;i<a.length;i++){
            if(a[mini]>a[i])
            mini=i;
        }
        return mini;
    }
    void sort(int a[]){
        for(int i=0;i<a.length-1;i++){
            int j =min(a,i);
            if(i!=j)
            swap(a,i,j);
            System.out.println("PASS : " +(i+1));
            for(int x=0;x<a.length;x++){
                System.out.print(a[x]+ " ");
            }
            System.out.println();
        }
    }
}