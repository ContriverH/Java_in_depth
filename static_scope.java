class def {
    public static int z;z=30; // this will give error

    public static int z = 30; // this will work fine
    // OR
    // this is the way how a static scope can be defined
    static {
        z = 30;
    }
}

class abc {
    public static void main(String args[]) {

        def obj1 = new def();
        System.out.println(def.z);
    }
}