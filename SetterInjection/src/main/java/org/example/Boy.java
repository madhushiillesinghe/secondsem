

package org.example;
public class Boy {
   Agreement agreement;

    public void chatwithgirl() {

     agreement.chat();
         }
    public void test(){
        agreement.chat();
    }

    public static void main(String[] args) {
        Boy boy=new Boy();
       boy.setAgreement(new Girl());
    }
    public void setAgreement(Agreement a){
        this.agreement=a;
    }
}
