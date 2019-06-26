package com.codingblocks.Lect12;

public class queueClient {

    public static void main(String[] args) throws Exception {

        queueoptimized q= new queueoptimized(100);
        for (int i = 0; i <100 ; i++) {
            q.insert(i);
            q.display();
        }
        for (int i = 0; i <100 ; i++) {
            q.remove();
            q.display();
        }

    }
}
