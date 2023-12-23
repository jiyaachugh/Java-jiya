public class FindMin {
    public static void main(String[] args) {
        int arr[] = {1,45,23,-12,-14};
        System.out.println(min(arr));
    }
    // assume arr.length != 0
    // return the min value in the array
    static int min(int[] arr) {
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < ans) {
                ans = arr[i];
            }
        }
        return ans;
    }
}
