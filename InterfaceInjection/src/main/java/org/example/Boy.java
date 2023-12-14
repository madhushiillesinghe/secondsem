package org.example;
public class Boy implements By {
    Agreement agreement=new Girl();

    public void chatwithgirl() {
     agreement.chat();
         }

    public static void main(String[] args) {
        Boy boy=new Boy();
        boy.chatwithgirl();
        boy.inject(new Girl());
    }

    @Override
    public void inject(Agreement agreement) {
        this.agreement=agreement;
    }
}
