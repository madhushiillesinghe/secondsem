
package org.example;
public class Boy {
    Agreement agreement;
    Boy(Agreement agreement){
        this.agreement=agreement;
    }
    public void chatwithgirl() {

     agreement.chat();
         }
    public void test(){
        agreement.chat();
    }

    public static void main(String[] args) {
        Boy boy=new Boy(new Girl());
    }
}
