package com.codingblocks.lec14;



public class queueClient {

    public static void main(String[] args) throws Exception {

       DynamicQueue q= new DynamicQueue();
        for (int i = 0; i <20 ; i++) {

           q.insert(i);
           q.display();
        }
        for (int i = 0; i <18 ; i++) {
            System.out.println(q.remove());
        }
        q.insert(105);
        q.insert(107);
        q.insert(108);
        q.insert(109);
        q.insert(111);
        q.insert(112);
        q.insert(113);
        q.insert(114);
        q.insert(115);
        q.remove();
        q.display();


    }
}
