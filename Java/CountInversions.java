public class CountInversions{
	
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

            int []nums = new int[high-low+1] ;
            int k = 0 ;

            while(left<=mid && right<=high){


                if(arr[left]<=arr[right]){
                    nums[k++] = arr[left++] ;

                }
                else{
                    count+=(mid-left+1) ;

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
            int arr[] = {1,2,4,1,3,5};
            System.out.println(sort(arr,0,arr.length-1));


        }

}

