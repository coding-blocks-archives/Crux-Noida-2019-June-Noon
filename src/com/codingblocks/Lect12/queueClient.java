package com.codingblocks.Lect12;

public class queueClient {

    public static void main(String[] args) throws Exception {

        queuecircular q= new queuecircular(4);
        for (int i = 0; i <4 ; i++) {
            q.insert(i);
            q.display();
        }
        for (int i = 0; i <2 ; i++) {
            q.remove();
            q.display();
        }
        q.insert(5);
        q.insert(6);
        q.display();

    }
}
