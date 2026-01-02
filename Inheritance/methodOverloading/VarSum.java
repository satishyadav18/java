class Sum{
    float sum(float ...A){
        float sum = 0;
        for(float x : A){
            sum += x;
        }
        return sum;
    }
}

class VarSum{
    public static void main(String ...args){
        Sum s = new Sum();
        float S = s.sum(new float[]{4,5,6,7.5f,8,9,12});
        float f = s.sum(32.6f,45.47f,5.23f);

        System.out.println("sum is: "+S);
        System.out.println("sum is: "+f);
    }
}