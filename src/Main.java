public class Main {
    private static final String[]arr= new String[]{"abccd_","d2ffd__"};
    private static final String[]arr1= new String[]{"abc","d2ffd__.."};

    public static void main(String[] args) {
        ValidateAccount validateAccount=new ValidateAccount();
        for (String e:arr
             ) {
            boolean isvalid= validateAccount.validate(e);
            System.out.println(isvalid);
        }for (String e:arr1
             ) {
            boolean isvalid= validateAccount.validate(e);
            System.out.println(isvalid);
        }
    }

}
