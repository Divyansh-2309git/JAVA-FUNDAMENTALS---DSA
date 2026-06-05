public class solution11{
    public static int maxWaterContainer(int[] height ) {
        int n = height.length; 
        int l = 0 ; 
        int r = n - 1 ; 
        int maxWater = 0 ; 
        while(l < r){
            int width = r - l ; 
            int len = Math.min(height[l] , height[r]); 
            int currentWater = len * width ; 
            maxWater = Math.max(currentWater , maxWater) ; 
            
            if(height[l] > height[r]){
                r-- ; 
            }else{
                l ++; 
            }
        }
        return maxWater ; 
    }
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7}; 
        System.out.println(maxWaterContainer(height)) ; 
    }
}