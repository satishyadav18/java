public class VArgs{

    static void show(int ...A){
        for(int x : A){
            System.out.println(x);
        }
    }

    static void showList(String ...S){
        for(int i=0; i<S.length; i++){
            System.out.println(i+1+". "+S[i]);
        }
    }

    
    static void showList2(int start, String ...S){
        for(int i=0; i<S.length; i++){
            System.out.println(start+". "+S[i]);
            start++;
        }
    }


    public static void main(String ...args){
        show();
        show(10,20,30,40);
        show(new int[]{1,2,3,4,5,6,7,8});  //no refernece for this array and new means it is created in heap and
                                            // Arrays without any refernce are called anonymous array
        
        showList2(5,"John", "Smith", "Ajay", "Vijay", "Mark");
        showList("CV Raman","JC Bose", "Araybhatt", "Abdul Kalam", "Homi J Bhabha");
    } 
}