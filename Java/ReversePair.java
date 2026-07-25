public class ReversePair {

//    you have to return  pair of indices such that nums[i] > 2*nus[j] ;
    public  static int sort(int arr[] , int low , int high){
        if(low>=high) return 0 ;

        int mid = low+(high-low)/2 ;

        int leftCount = sort(arr, low , mid) ;
        int rightCount = sort(arr, mid+1 , high) ;

        return leftCount+rightCount+merge(arr, low , mid , high) ;

    }

    public static int merge(int []arr , int low , int mid , int high){
        int left = low ;
        int right =  mid+1 ;

        int count = 0 ;

        for(; left<=mid ; left++){
            while(right<=high && arr[left]>2L*arr[right]){
                right ++ ;

            }

            count+= right - ( mid+1) ;

        }

        left = low ;
        right = mid+1 ;
        int []nums = new int[high-low+1] ;
        int k = 0 ;

        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
               nums[k++] = arr[left++] ;

            }
            else{
                nums[k++] = arr[right++] ;

            }
        }

        while(left<=mid){
            nums[k++] = arr[left++] ;
        }
        while(right<=high){
            nums[k++] = arr[right++] ;

        }

        for(int i = low ; i<=high ; i++){
            arr[i] = nums[i-low] ;

        }
        return count ;

    }
    public static void main(String[] args) {
        int arr[] = {1,3,2,3,1};
        System.out.println(sort(arr,0,arr.length-1));


    }

}
