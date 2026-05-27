public class accessModifiers {
    public static void main(String args[]) {
        BankAccount bk = new BankAccount() ; 
        bk.username = "Divyansh" ; 
        bk.setPassword("SagarSingh");
    }}
    class BankAccount{
        public String username ; 
        private String password ; 
        public void setPassword (String pwd ){
            password = pwd ; 
            System.out.println(password);

        }

    }
