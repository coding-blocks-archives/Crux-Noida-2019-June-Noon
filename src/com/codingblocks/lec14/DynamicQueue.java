package com.codingblocks.lec14;

public class DynamicQueue extends queuecircular {

    @Override
    public boolean insert(int element) {
        if(isFull()){
            System.out.println("Here we are doubling up");
            int temp[]=new int[data.length*2];

            for (int i = 0; i <data.length ; i++) {
                temp[i]=data[(front+i)%data.length];


            }
            front=0;
            end=data.length;
            data=temp;
        }

        return super.insert(element);
    }
}
