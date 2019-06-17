package com.codingblocks.Lect9;

import java.util.ArrayList;

public class recursionques {

    public static void main(String[] args) {
//               dice("",4);
//          permutation("","ab");
//
      //  System.out.println(replacepi("","pipipi}}pip"));
//        ArrayList list=new ArrayList();
//
//       mazepath("",3,3);
        System.out.println(mazepathlist1("",3,3));
    }


    public static void dice(String processed, int target){

        if(target==0){
            System.out.println(processed);
            return;
        }

        for (int i = 1; i <=6&&i<=target ; i++) {

            dice(processed+i,target-i);
        }
    }

    public static void permutation(String processed,String unprocessed){

        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch=unprocessed.charAt(0);
        unprocessed=unprocessed.substring(1);

        for (int i = 0; i <=processed.length() ; i++) {

            String first=processed.substring(0,i);
            String second =processed.substring(i);


            permutation(first+ch+second,unprocessed);

        }
    }


    public static String replacepi(String processed , String unprocessed){


        if(unprocessed.length()<2){
            return processed+unprocessed;
        }

        char ch=  unprocessed.charAt(0);

        if(ch=='p' && unprocessed.charAt(1)=='i'){
            return replacepi(processed+"3.14",unprocessed.substring(2));
        }

        return replacepi(processed+ch,unprocessed.substring(1));
    }

    public static void mazepath(String processed,int row,int col){


        if(row==1&&col==1){
            System.out.println(processed);
            return ;
        }



        if(row>1){

            mazepath(processed+'V',row-1,col);
        }

        if(col>1){

            mazepath(processed+'H',row,col-1);
        }


    }

    public static ArrayList mazepathlist(String processed,int row,int col,ArrayList list){


        if(row==1&&col==1){


            list.add(processed);
            return list;
        }



        if(row>1){

            mazepathlist(processed+'V',row-1,col,list);
        }

        if(col>1){

            mazepathlist(processed+'H',row,col-1,list);
        }

        return list;
    }

    public static ArrayList mazepathlist1(String processed,int row,int col){


        if(row==1&&col==1){
            ArrayList list =new ArrayList();

            list.add(processed);
            return list;
        }

        ArrayList list =new ArrayList();

        if(row>1){

            list.addAll(mazepathlist1(processed+'V',row-1,col));
        }

        if(col>1){

          list.addAll(mazepathlist1(processed+'H',row,col-1));
        }

        return list;
    }

}
