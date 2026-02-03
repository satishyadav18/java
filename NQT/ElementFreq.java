import java.util.*;

public class ElementFreq{
    static void CountFreq(int[] arr, int n){
        // boolean[] visited = new boolean[n];
        
        // for(int i=0; i<n; i++){
        //     if(visited[i])
        //         continue;

        //     int count = 1;
        //     for(int j=i+1; j<n; j++){
        //         if(arr[i] == arr[j]){
        //             visited[j] = true;
        //             count++;
        //         }
        //     }
        // System.out.println(arr[i] + ": "+ count);
        // }


        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }

        // System.err.println(map);
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lenght of array: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements of array: ");
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        ElementFreq.CountFreq(arr, n);

    }
}