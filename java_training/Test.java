interface Inter1{
    void meth1();
    int x = 8;
}

interface Inter2{
    void meth2();
}

class Inter3{
    int x=7;
    void meth3(){
        System.out.println("From prent");
    }
}

class TestInterface extends Inter3 implements Inter1, Inter2{
    public void meth1(){
        System.out.println("Overriding......"+super.x);
    }
    public void meth2(){
        System.out.println("Overiding.....2");
    }
}

class Test{
    public static void main(String[] args){
        TestInterface i1 = new TestInterface(); //compile time error
        i1.meth1();
        i1.meth2();
        i1.meth3();
    }
}