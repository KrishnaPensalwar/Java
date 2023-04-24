public class Exception_Handeling {
    public static void main(String[] args)
    {
        Arithmatic_Operation obj = new Arithmatic_Operation();

//        obj.getadata();
        try {
            obj.division();
        }
        catch(Exception e){
            System.out.println("Enter second number other than 0.");
        }
        finally {
            System.out.println("Division done.");
        }

//        obj.division();
        obj.input_mismatch();
    }
}